package ddd.learning.trailorganizer.infrastructure;

import ddd.learning.trailorganizer.application.IObtainTrails;
import ddd.learning.trailorganizer.application.TrailReader;
import ddd.learning.trailorganizer.domain.Trail;

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

        IObtainTrails obtainTrails = new HardcodedTrailLibrary(asList(new Trail("Trail des Vosges"),
                    new Trail("Gelita Trail")));
        TrailReader trailReader = new TrailReader(obtainTrails);

        IConsoleWriter writer = mock(IConsoleWriter.class);
        ConsoleAdapter consoleAdapter = new ConsoleAdapter(trailReader, writer);

        consoleAdapter.showAllTrails();

        verify(writer).writeLine(eq("Trail des Vosges, Gelita Trail"));
    }
}
