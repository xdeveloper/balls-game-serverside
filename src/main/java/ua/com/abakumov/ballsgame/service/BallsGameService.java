package ua.com.abakumov.ballsgame.service;

import ua.com.abakumov.ballsgame.domain.Score;

import java.util.List;

public interface BallsGameService {

    List<Score> top10Scores();

    void saveScore(Integer score, String playerName);
}
