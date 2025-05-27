package Task2;

public class task2 {
    public static void runTask2() {
        Point a = new Point(1, 3);
        Point b = new Point(5, 8);
        Point c = new Point(10, 11);
        Point d = new Point(15, 19);

        Line line1 = new Line(a, b);
        Line line2 = new Line(c, d);
        Line line3 = new Line(b, c);
        System.out.println("Линия 3 (до изменения): " + line3);

        b.setX(6); b.setY(9);
        c.setX(11); c.setY(12);

        System.out.println("Линия 3 (после изменения): " + line3);

        double totalLength = line1.getLength() + line2.getLength() + line3.getLength();
        System.out.printf("Суммарная длина всех линий: %.2f%n", totalLength);
    }
}
