package ddd.learning.trailorganizer.infrastructure;

import ddd.learning.trailorganizer.domain.IObtainTrails;
import ddd.learning.trailorganizer.domain.Trail;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;


@Component
public class HardcodedTrailLibrary implements IObtainTrails {

    private List<Trail> allTrails;

    public HardcodedTrailLibrary(List<Trail> allTrails) {

        this.allTrails = allTrails;
    }

    @Override
    public List<Trail> findAllTrails() {

        return Arrays.asList(new Trail("Trail des vosges", 10.0), new Trail("Baden halb-marathon", 21.0));
    }
}
