package ddd.learning.trailorganizer.infrastructure;

import ddd.learning.trailorganizer.application.IObtainTrails;
import ddd.learning.trailorganizer.domain.Trail;

import java.util.List;


public class HardcodedTrailLibrary implements IObtainTrails {

    private List<Trail> allTrails;

    public HardcodedTrailLibrary(List<Trail> allTrails) {

        this.allTrails = allTrails;
    }

    @Override
    public List<Trail> findAllTrails() {

        return allTrails;
    }
}
