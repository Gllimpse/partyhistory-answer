package dao;

import entity.Score;


public interface ScoreDAO {
    void save(Score score);
    void update(Score score);
    void delete(Score score);
    public Score getScore(int userID);
}
