package Seminars.Seminar1;

import java.util.Scanner;

// Задача 1. Написать программу, которая запросит пользователя ввести имя <Имя> в консоли. Получит введенную строку и выведет в консоль сообщение "Привет! <Имя >"

public class Task_1 {
    static public void main(String[] args) {
        try (Scanner sc = new Scanner(System.in, "cp866")) {
            System.out.printf("Введите имя: ");
            String name = sc.nextLine();
            System.out.printf("Привет, " + name);
        }

    }

}
