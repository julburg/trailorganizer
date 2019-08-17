package ddd.learning.trailorganizer.api;

import ddd.learning.trailorganizer.application.TrailReader;
import ddd.learning.trailorganizer.domain.IObtainTrails;
import ddd.learning.trailorganizer.domain.Trail;
import ddd.learning.trailorganizer.infrastructure.HardcodedTrailLibrary;
import ddd.learning.trailorganizer.infrastructure.IConsoleWriter;

import org.junit.Test;

import static org.mockito.Matchers.eq;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import static java.util.Arrays.asList;


/**
 * @author  Julia Burgard - burgard@synyx.de
 */
public class ConsoleAdapterTest {

    @Test
    public void shouldGiveTrails_WhenAskedForAllTrails() {

        IObtainTrails obtainTrails = new HardcodedTrailLibrary(asList(new Trail("Trail des Vosges", 5),
                    new Trail("Gelita Trail", 5)));
        TrailReader trailReader = new TrailReader(obtainTrails);

        IConsoleWriter writer = mock(IConsoleWriter.class);
        ConsoleAdapter consoleAdapter = new ConsoleAdapter(trailReader, writer);

        consoleAdapter.showAllTrails();

        verify(writer).writeLine(eq("Trail des Vosges, Gelita Trail"));
    }
}
