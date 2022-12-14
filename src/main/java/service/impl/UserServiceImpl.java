package service.impl;

import dao.ScoreDAO;
import entity.Score;
import entity.User;
import factory.DaoFactory;
import service.UserService;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class UserServiceImpl implements UserService {
    @Override
    public boolean login(User user) {
        return false;
    }

    @Override
    public boolean isTodayAnswered(User user) {
        ScoreDAO scoreDAO = DaoFactory.getScoreDAO();
        String time = scoreDAO.getScore(user.id).update_time;
        Date date = null;
        try {
            date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS").parse(time);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        assert date != null;
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return calendar.get(Calendar.DAY_OF_MONTH) == Calendar.getInstance().get(Calendar.DAY_OF_MONTH);
    }

    @Override
    public void submitScore(User user, int totalScore) {
        ScoreDAO scoreDAO = DaoFactory.getScoreDAO();
        int newScore = scoreDAO.getScore(user.id).score+totalScore;
        String currTime = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS").format(new Date());
        scoreDAO.save(new Score(0,newScore,user.id,currTime));
    }
}
