package ddd.learning.trailorganizer.api;

import ddd.learning.trailorganizer.application.TrailReader;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static java.util.stream.Collectors.toList;


/**
 * @author  Julia Burgard - burgard@synyx.de
 */
@RestController
public class TrailRestController {

    private TrailReader trailReader;

    public TrailRestController(TrailReader trailReader) {

        this.trailReader = trailReader;
    }

    @RequestMapping("/trails")
    public List<TrailDto> allTrails() {

        return trailReader.allTrails()
            .stream()
            .map(trail -> new TrailDto(trail.getName(), trail.getDistance()))
            .collect(toList());
    }
}
