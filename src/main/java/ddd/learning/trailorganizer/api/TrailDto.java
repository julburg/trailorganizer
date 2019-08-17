package ddd.learning.trailorganizer.api;

/**
 * @author  Julia Burgard - burgard@synyx.de
 */
public class TrailDto {

    private String name;
    private double distance;

    public TrailDto(String name, double distance) {
        this.name = name;
        this.distance = distance;
    }

    public String getName() {

        return name;
    }


    public double getDistance() {

        return distance;
    }


    public void setName(String name) {

        this.name = name;
    }


    public void setDistance(double distance) {

        this.distance = distance;
    }
}
