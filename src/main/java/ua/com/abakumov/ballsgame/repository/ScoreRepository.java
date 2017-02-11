package ua.com.abakumov.ballsgame.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.com.abakumov.ballsgame.domain.Score;

import java.util.List;

public interface ScoreRepository extends JpaRepository<Score, Integer> {
    List<Score> findTop10ByOrderByScoreDesc();
}
