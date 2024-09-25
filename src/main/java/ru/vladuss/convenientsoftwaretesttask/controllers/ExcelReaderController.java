package ru.vladuss.convenientsoftwaretesttask.controllers;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.PriorityQueue;

@RestController
@Tag(name = "Excel Controller", description = "Контроллер для работы с файлами Excel")
public class ExcelReaderController {

    @Operation(summary = "Возврат N-го максимального числа из Excel файла")
    @GetMapping("/max-number")
    public Integer getMaxNumber(@RequestParam String filePath, @RequestParam int number) throws IOException {
        try (FileInputStream fileInputStream = new FileInputStream(filePath);
             Workbook workbook = new XSSFWorkbook(fileInputStream)) {

            Sheet sheet = workbook.getSheetAt(0);
            PriorityQueue<Integer> minHeap = new PriorityQueue<>();

            for (Row row : sheet) {
                int value = (int) row.getCell(0).getNumericCellValue();
                minHeap.add(value);
                if (minHeap.size() > number) {
                    minHeap.poll();
                }
            }
            return minHeap.peek();
        }
    }

}
