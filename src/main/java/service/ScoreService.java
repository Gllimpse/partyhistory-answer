package service;

import entity.Score;
import entity.User;

import java.util.List;

public interface ScoreService {
    List<Score> getRankList();
    Score getUserScore(User user);
}
