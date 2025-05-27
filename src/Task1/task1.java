package Task1;

public class task1 {
    public static void runTask1() {
        Point p1 = new Point(1, 3);
        Point p2 = new Point(1, 3);
        Point p3 = new Point(5, 8);

        System.out.println("p1: " + p1);
        System.out.println("p2: " + p2);
        System.out.println("p3: " + p3);

        System.out.println("p1 == p2: " + (p1 == p2));
        System.out.println("p1 == p3: " + (p1 == p3));
    }
}