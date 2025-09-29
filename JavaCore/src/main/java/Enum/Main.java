package Enum;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pair<Day, Integer>[] countHoursPerDay = new Pair[Day.values().length];

        for (int i = 0; i < Day.values().length; i++) {
            Day currentDay = Day.values()[i];

            if (currentDay.isWorkingDay()) {
                System.out.println("Input hours for " + currentDay.name() + " (0-24):");
                Integer hours = sc.nextInt();

                // Проверка корректности ввода
                if (hours < 0 || hours > 24) {
                    System.out.println("Invalid hours! Please enter between 0 and 24.");
                    i--; // Повторить для этого же дня
                    continue;
                }

                // Инициализация элемента массива
                countHoursPerDay[i] = new Pair<>(currentDay, hours);
            } else {
                // Для выходных дней автоматически 0 часов
                countHoursPerDay[i] = new Pair<>(currentDay, 0);
                System.out.println(currentDay.name() + " is weekend - 0 hours");
            }
        }

        // Вывод результатов
        System.out.println("\nWork hours per day:");
        for (Pair<Day, Integer> pair : countHoursPerDay) {
            if (pair != null) {
                System.out.println(pair.getKey() + ": " + pair.getValue() + " hours");
            }
        }

        sc.close();
    }
}