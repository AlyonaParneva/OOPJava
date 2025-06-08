package ru.courses.geometry;

public class Line {
    private PointForTask2 start;
    private PointForTask2 end;

    public Line(PointForTask2 start, PointForTask2 end) {
        this.start = start;
        this.end = end;
    }

    public Line(int x1, int y1, int x2, int y2) {
        this.start = new PointForTask2(x1, y1);
        this.end = new PointForTask2(x2, y2);
    }

    public double getLength() {
        int dx = end.getX() - start.getX();
        int dy = end.getY() - start.getY();
        return Math.sqrt(dx * dx + dy * dy);
    }

    public PointForTask2 getStart() {
        return start;
    }
    public PointForTask2 getEnd() {
        return end;
    }

    @Override
    public String toString() {
        return "линия от " + start + " до " + end;
    }
}
