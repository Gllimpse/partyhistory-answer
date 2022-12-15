package service.impl;

import dao.ScoreDAO;
import dao.UserDAO;
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
    public String Login(String account,String password) {
        //查询账号密码正确性
        User findUser=DaoFactory.getUserDAO().getUserByAccount(account);
        if(findUser==null ||!findUser.password.equals(password)){
            return "#密码错误";
        }

        User user=DaoFactory.getUserDAO().getUserByAccount(account);
        return user.account;
    }


    @Override
    public void Register(User user) {
        //查询用户名是否存在
        User findUser=DaoFactory.getUserDAO().getUserByAccount(user.account);
        if (findUser!=null){
            System.out.println("用户已经注册");
            return;
        }

        DaoFactory.getUserDAO().save(user);
    }

    @Override
    public boolean isTodayAnswered(String account) {
        User user=DaoFactory.getUserDAO().getUserByAccount(account);
        ScoreDAO scoreDAO = DaoFactory.getScoreDAO();

        Score score =scoreDAO.getScore(user.id);
        if (score==null){
            return false;
        }

        String time = score.update_time;
        Date date = null;
        try {
            date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS").parse(time);
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
        String currTime = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS").format(new Date());
        scoreDAO.save(new Score(0,newScore,user.id,currTime));
    }
}
