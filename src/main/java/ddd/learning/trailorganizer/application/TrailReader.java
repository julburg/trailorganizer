package ddd.learning.trailorganizer.application;

import ddd.learning.trailorganizer.domain.IObtainTrails;
import ddd.learning.trailorganizer.domain.Trail;

import org.springframework.stereotype.Component;

import java.util.List;


@Component
public class TrailReader {

    private IObtainTrails obtainTrails;

    public TrailReader(IObtainTrails obtainTrails) {

        this.obtainTrails = obtainTrails;
    }

    public List<Trail> allTrails() {

        return obtainTrails.findAllTrails();
    }
}
