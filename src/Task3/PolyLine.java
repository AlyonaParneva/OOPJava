package Task3;

import Task2.Line;
import Task2.Point;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PolyLine {
    private List<Point> points;

    public PolyLine() {
        this.points = new ArrayList<>();
    }

    public PolyLine(Point... initialPoints) {
        this.points = new ArrayList<>(Arrays.asList(initialPoints));
    }

    public void addPoint(Point p) {
        points.add(p);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Линия [");
        for (int i = 0; i < points.size(); i++) {
            sb.append(points.get(i));
            if (i < points.size() - 1) sb.append(", ");
        }
        sb.append("]");
        return sb.toString();
    }

    public Line[] getLines() {
        Line[] lines = new Line[points.size() - 1];
        for (int i = 0; i < points.size() - 1; i++) {
            lines[i] = new Line(points.get(i), points.get(i + 1));
        }
        return lines;
    }

    public double getLength() {
        double total = 0.0;
        Line[] lines = getLines();
        for (Line line : lines) {
            total += line.getLength();
        }
        return total;
    }

    public List<Point> getPoints() {
        return points;
    }
}
