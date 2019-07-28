package ddd.learning.trailorganizer.application;

import ddd.learning.trailorganizer.infrastructure.HardcodedTrailLibrary;
import ddd.learning.trailorganizer.domain.Trail;

import org.junit.Test;

import java.util.List;

import static org.hamcrest.CoreMatchers.is;

import static org.junit.Assert.assertThat;

import static java.util.Collections.singletonList;


/**
 * @author  Julia Burgard - burgard@synyx.de
 */
public class TrailReaderTest {

    @Test
    public void shouldGiveTrails_whenAskedForAllTrails() {

        IObtainTrails obtainTrails = new HardcodedTrailLibrary(singletonList(new Trail("Hometrail")));
        TrailReader trailReader = new TrailReader(obtainTrails);

        List<Trail> trails = trailReader.allTrails();

        assertThat(trails.size(), is(1));
        assertThat(trails.get(0).getName(), is("Hometrail"));
    }
}
