import Task1.task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер задания (1–4):");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1 -> task1.runTask1();
//            case 2 -> task2.run();
//            case 3 -> task3.run();
//            case 4 -> task4.run();
            default -> System.out.println("Такого задания нет :(");
        }
    }
}