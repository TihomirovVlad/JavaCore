package com.microservice.javacore.Generics.DefaultGeneris;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TrainingJavaCoreApplication {
    public static void main(String[] args) {
        // Создание контейнеров разных типов
        DataContainer<String> stringContainer = DataContainer.of("Hello Generics!");
        DataContainer<Integer> intContainer = DataContainer.of(42);
        DataContainer<Double> doubleContainer = DataContainer.of(3.14);

        // Проверка наличия значения
        System.out.println("String present: " + stringContainer.isPresent());
        System.out.println("Value: " + stringContainer.getValue());

        // Фильтрация
        DataContainer<Integer> filtered = intContainer.filter(n -> n > 50);
        System.out.println("Filtered present: " + filtered.isPresent());

        // Преобразование
        DataContainer<String> mapped = intContainer.map(n -> "Number: " + n);
        System.out.println(mapped.getValue());

    }

}
