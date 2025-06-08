package ru.courses.tasks;


import ru.courses.geometry.Line;
import ru.courses.geometry.PointForTask2;
import ru.courses.geometry.PolyLine;

public class task3 {
    public static void runTask3() {
        PointForTask2 p1 = new PointForTask2(1, 5);
        PointForTask2 p2 = new PointForTask2(2, 8);
        PointForTask2 p3 = new PointForTask2(5, 3);
        PointForTask2 p4 = new PointForTask2(8, 9);

        PolyLine polyLine = new PolyLine(p1, p2, p3, p4);

        System.out.println("Ломаная: " + polyLine);

        double length = polyLine.getLength();
        System.out.printf("Длина ломаной: %.2f%n", length);

        Line[] lines = polyLine.getLines();
        System.out.println("Массив линий:");
        for (Line line : lines) {
            System.out.println("  " + line + " длина: " + line.getLength());
        }

        double totalLineLength = 0.0;
        for (Line line : lines) {
            totalLineLength += line.getLength();
        }

        System.out.printf("Суммарная длина линий: %.2f%n", totalLineLength);
        System.out.println("Совпадают ли длины: " + (Math.abs(length - totalLineLength) < 1e-6));

        p2.setX(12);

        System.out.println("\nПосле изменения p2:");
        System.out.println("Ломаная: " + polyLine);
        System.out.println("Линии после изменения:");
        for (Line line : lines) {
            System.out.println("  " + line + " длина: " + line.getLength());
        }
    }
}
