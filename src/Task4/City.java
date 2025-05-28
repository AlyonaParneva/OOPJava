package Task4;

import java.util.ArrayList;
import java.util.List;

public class City {
    private String name;

    public static class Path {
        private City destination;
        private int cost;

        public Path(City destination, int cost) {
            this.destination = destination;
            this.cost = cost;
        }

        public City getDestination() {
            return destination;
        }

        public int getCost() {
            return cost;
        }

        @Override
        public String toString() {
            return destination.getName() + ": " + cost;
        }
    }

    private List<Path> paths = new ArrayList<>();

    public City(String name) {
        this.name = name;
    }

    public void addPath(City destination, int cost) {
        paths.add(new Path(destination, cost));
    }

    public void addPath(Path path) {
        paths.add(path);
    }

    public String getName() {
        return name;
    }

    public List<Path> getPaths() {
        return paths;
    }

    public City travelBy(int steps) {
        City current = this;
        for (int i = 0; i < steps; i++) {
            if (current.paths.isEmpty()) return null;
            current = current.paths.get(0).getDestination();
        }
        return current;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(name + " -> [");
        for (int i = 0; i < paths.size(); i++) {
            sb.append(paths.get(i));
            if (i < paths.size() - 1) sb.append(", ");
        }
        sb.append("]");
        return sb.toString();
    }
}
