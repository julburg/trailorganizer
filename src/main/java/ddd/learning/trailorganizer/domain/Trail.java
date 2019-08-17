package ddd.learning.trailorganizer.domain;

public class Trail {

    private String name;
    private double distance;

    public Trail(String name, double distance) {

        this.name = name;
        this.distance = distance;
    }

    public String getName() {

        return name;
    }

    public double getDistance() {
        return distance;
    }
}
