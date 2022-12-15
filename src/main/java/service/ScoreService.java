package service;

import entity.Rank;
import entity.Score;
import entity.User;

import java.util.List;

public interface ScoreService {
    List<Rank> getRankList();
    Score getUserScore(User user);
}
