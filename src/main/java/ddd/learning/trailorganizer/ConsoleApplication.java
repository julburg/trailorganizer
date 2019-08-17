package ddd.learning.trailorganizer;

import ddd.learning.trailorganizer.api.ConsoleAdapter;
import ddd.learning.trailorganizer.application.TrailReader;
import ddd.learning.trailorganizer.domain.Trail;
import ddd.learning.trailorganizer.infrastructure.HardcodedTrailLibrary;

import static java.util.Collections.singletonList;


/**
 * @author  Julia Burgard - burgard@synyx.de
 */
public class ConsoleApplication {

    public static void main(String[] args) {

        TrailReader trailReader = new TrailReader(new HardcodedTrailLibrary(
                    singletonList(new Trail("Trail des Vosges", 5))));
        ConsoleAdapter consoleAdapter = new ConsoleAdapter(trailReader);

        consoleAdapter.showAllTrails();
    }
}
