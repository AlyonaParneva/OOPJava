package ru.courses.tasks;

import ru.courses.geometry.PointForTask1;

public class task1 {
    public static void runTask1() {
        PointForTask1 p1 = new PointForTask1(1, 3);
        PointForTask1 p2 = new PointForTask1(1, 3);
        PointForTask1 p3 = new PointForTask1(5, 8);

        System.out.println("p1: " + p1);
        System.out.println("p2: " + p2);
        System.out.println("p3: " + p3);

        System.out.println("p1 == p2: " + (p1 == p2));
        System.out.println("p1 == p3: " + (p1 == p3));
    }
}