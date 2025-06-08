package ru.courses.tasks;

import ru.courses.city.City;

public class task4 {
    public static void runTask4() {
        City A = new City("A");
        City B = new City("B");
        City C = new City("C");
        City D = new City("D");
        City E = new City("E");
        City F = new City("F");

        A.addPath(B, 5);
        A.addPath(F, 1);

        B.addPath(C, 3);
        B.addPath(A, 5);

        C.addPath(D, 4);
        C.addPath(B, 3);

        D.addPath(A, 6);
        D.addPath(E, 2);
        D.addPath(C, 4);

        E.addPath(F, 2);

        F.addPath(B, 1);
        F.addPath(E, 2);

        System.out.println("B.travelBy(1): " + B.travelBy(1).getName());
        System.out.println("B.travelBy(2): " + B.travelBy(2).getName());
        System.out.println("B.travelBy(3): " + B.travelBy(3).getName());

        System.out.println(A);
        System.out.println(B);
        System.out.println(C);
        System.out.println(D);
        System.out.println(E);
        System.out.println(F);
    }
}
