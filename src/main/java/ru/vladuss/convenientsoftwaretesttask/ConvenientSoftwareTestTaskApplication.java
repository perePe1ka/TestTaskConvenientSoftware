package ru.vladuss.convenientsoftwaretesttask;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ConvenientSoftwareTestTaskApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConvenientSoftwareTestTaskApplication.class, args);
        System.setProperty("server.port", "8080");
    }

}
