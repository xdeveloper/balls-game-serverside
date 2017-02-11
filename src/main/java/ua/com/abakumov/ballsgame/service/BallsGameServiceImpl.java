package ua.com.abakumov.ballsgame.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import ua.com.abakumov.ballsgame.domain.Score;
import ua.com.abakumov.ballsgame.repository.ScoreRepository;

import javax.inject.Inject;
import java.util.List;


@Service
@SuppressWarnings(value = "unused")
public class BallsGameServiceImpl implements BallsGameService {
    private static final Logger LOGGER = LoggerFactory.getLogger(BallsGameServiceImpl.class);

    private final ScoreRepository scoreRepository;

    @Inject
    public BallsGameServiceImpl(final ScoreRepository scoreRepository) {
        this.scoreRepository = scoreRepository;
    }

    @Override
    public List<Score> top10Scores() {
        return scoreRepository.findTop10ByOrderByScoreDesc();
    }

    @Override
    public void saveScore(Integer score, String playerName) {
        Score scoreEntity = new Score(score, playerName);
        scoreRepository.saveAndFlush(scoreEntity);
    }

}
