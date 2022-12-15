package dao;

import entity.Score;

import java.util.List;


public interface ScoreDAO {
    void save(Score score);
    void update(Score score);
    void delete(Score score);
    Score getScore(int userID);

    List<Score> getScores();
}
