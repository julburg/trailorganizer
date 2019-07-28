package ddd.learning.trailorganizer.infrastructure;

import ddd.learning.trailorganizer.application.TrailReader;
import ddd.learning.trailorganizer.domain.Trail;

import static java.util.stream.Collectors.joining;


public class ConsoleAdapter {

    private TrailReader trailReader;
    private IConsoleWriter writer;

    public ConsoleAdapter(TrailReader trailReader, IConsoleWriter writer) {

        this.trailReader = trailReader;
        this.writer = writer;
    }


    public ConsoleAdapter(TrailReader trailReader) {

        this.trailReader = trailReader;
        this.writer = System.out::println;
    }

    public void showAllTrails() {

        writer.writeLine(trailReader.allTrails()
            .stream()
            .map(Trail::getName)
            .collect(joining(", ")));
    }
}
