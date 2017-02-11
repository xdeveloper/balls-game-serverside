package ua.com.abakumov.ballsgame.domain;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;


@Data
@Entity
@Table(name = "score")
public class Score {

    public Score() {}
    public Score(Integer score, String playerName) {
        this.score = score;
        this.playerName = playerName;
    }

    @Id
    @GeneratedValue
    @Column(name = "score_id")
    private Integer id;

    @Column(name = "score")
    @NotNull
    private Integer score;

    @Column(name = "player_name")
    @NotNull
    private String playerName;
}
