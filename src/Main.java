import Task1.task1;
import Task2.task2;
import Task3.task3;
import Task4.task4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер задания (1–4):");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1 -> task1.runTask1();
            case 2 -> task2.runTask2();
            case 3 -> task3.runTask3();
            case 4 -> task4.runTask4();
            default -> System.out.println("Такого задания нет :(");
        }
    }
}