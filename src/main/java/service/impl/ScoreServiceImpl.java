package service.impl;

import entity.Rank;
import entity.Score;
import entity.User;
import factory.DaoFactory;
import service.ScoreService;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class ScoreServiceImpl implements ScoreService {
    @Override
    public List<Rank> getRankList() {
        List<Score> scores=DaoFactory.getScoreDAO().getScores();
        List<Rank> ranks=new ArrayList<>();
        if (scores!=null){
            for (Score score:scores){
                User user=DaoFactory.getUserDAO().getUserById(score.userID);
                Rank rank=new Rank(user.account,score.score);
                ranks.add(rank);
            }
        }
        return ranks;
    }

    @Override
    public Score getUserScore(User user) {
        return null;
    }

}
