package ua.com.abakumov.ballsgame.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import ua.com.abakumov.ballsgame.domain.Score;
import ua.com.abakumov.ballsgame.service.BallsGameService;

import javax.inject.Inject;
import java.util.List;


@SuppressWarnings(value = "unused")
@RestController
public class BallsGameController {

    private static final Logger LOGGER = LoggerFactory.getLogger(BallsGameController.class);

    private final BallsGameService service;

    @Inject
    public BallsGameController(final BallsGameService service) {
        this.service = service;
    }

    @GetMapping(value = "/ping")
    public String ping() {
        return "pong";
    }

    @PostMapping(value = "/score")
    @ResponseStatus(value = HttpStatus.OK)
    public void score(
            @RequestParam(value = "score") Integer score,
            @RequestParam(value = "playerName") String playerName) {
        LOGGER.info("Saving score ..." + score.toString() + ", " + playerName);

        service.saveScore(score, playerName);
    }

    @GetMapping(value = "/score")
    public List<Score> top10Scores() {
        LOGGER.info("Get top 10 scores");

        List<Score> scores = service.top10Scores();

        return scores;
    }
}
