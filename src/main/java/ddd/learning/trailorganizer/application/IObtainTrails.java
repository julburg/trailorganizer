package ddd.learning.trailorganizer.application;

import ddd.learning.trailorganizer.domain.Trail;

import java.util.List;


public interface IObtainTrails {

    List<Trail> findAllTrails();
}
