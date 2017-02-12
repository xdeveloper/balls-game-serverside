DROP TABLE score;

CREATE TABLE score (
  score_id    INTEGER PRIMARY KEY auto_increment,
  score       INTEGER,
  player_name VARCHAR(100)
);