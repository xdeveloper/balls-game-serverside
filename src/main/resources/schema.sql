DROP TABLE score;

CREATE TABLE score (
  score_id    INTEGER PRIMARY KEY auto_increment,
  score       INTEGER,
  player_name VARCHAR(100)
);


INSERT INTO score (score, player_name) VALUES (120, 'John Doe');
INSERT INTO score (score, player_name) VALUES (140, 'Judy Doe');
INSERT INTO score (score, player_name) VALUES (200, 'Abraham Lincoln');
INSERT INTO score (score, player_name) VALUES (300, 'Barack Obama');
INSERT INTO score (score, player_name) VALUES (310, 'Bill Clinton');
INSERT INTO score (score, player_name) VALUES (500, 'George Washington');