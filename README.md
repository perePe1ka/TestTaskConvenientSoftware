
Этот файл `README.md` поможет другим пользователям проекта быстро его собрать, запустить и использовать предоставленное API для работы с Excel файлами.

# Convenient Software Test Task

## Описание
Это приложение на Java Spring, которое предоставляет API для работы с Excel файлами. Основной функционал — получение N-го максимального числа из списка чисел, хранящихся в первом столбце Excel файла. Приложение использует Swagger для удобного взаимодействия с API.

## Требования
Для сборки и запуска проекта вам потребуются следующие инструменты:
- JDK 8 или выше
- Apache Maven 3.3.4 или выше

## Сборка и запуск проекта

### 1. Клонирование репозитория
Склонируйте этот репозиторий на ваш локальный компьютер:
bash
```git clone https://github.com/vladuss/convenient-software-test-task.git```

### 2. Сборка проекта

```cd convenient-software-test-task```
```mvn clean install```

### 3. Запуск проекта

```mvn spring-boot:run```

### 4. Доступ к Swagger UI

```http://localhost:8080/swagger-ui.html```

### 4. Использование API

```http://localhost:8080/max-number?filePath=/your/path/to/TestFile.xlsx&number=n```
Где n какое либо ваше число, а /your/path/to/TestFile.xlsx путь до excel файла
