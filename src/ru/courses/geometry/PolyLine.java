package ru.courses.geometry;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PolyLine {
    private List<PointForTask2> PointForTask2s;

    public PolyLine() {
        this.PointForTask2s = new ArrayList<>();
    }

    public PolyLine(PointForTask2... initialPointForTask2s) {
        this.PointForTask2s = new ArrayList<>(Arrays.asList(initialPointForTask2s));
    }

    public void addPointForTask2(PointForTask2 p) {
        PointForTask2s.add(p);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Линия [");
        for (int i = 0; i < PointForTask2s.size(); i++) {
            sb.append(PointForTask2s.get(i));
            if (i < PointForTask2s.size() - 1) sb.append(", ");
        }
        sb.append("]");
        return sb.toString();
    }

    public Line[] getLines() {
        Line[] lines = new Line[PointForTask2s.size() - 1];
        for (int i = 0; i < PointForTask2s.size() - 1; i++) {
            lines[i] = new Line(PointForTask2s.get(i), PointForTask2s.get(i + 1));
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

    public List<PointForTask2> getPointForTask2s() {
        return PointForTask2s;
    }
}
