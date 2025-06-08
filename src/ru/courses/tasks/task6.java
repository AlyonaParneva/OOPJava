package ru.courses.tasks;

import ru.courses.geometry.PointForTask1;

public class task6 {
    public static void runTask6() {
        PointForTask1 myPoint = new PointForTask1(3, 4);

        java.awt.Point awtPoint = new java.awt.Point(5, 6);

        System.out.println("Наша точка: " + myPoint);
        System.out.println("AWT точка: " + awtPoint);
    }
}
