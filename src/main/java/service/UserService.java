package service;

import entity.Score;
import entity.User;

public interface UserService {
    String Login(String account,String password);
    String Register(String account,String password);
    boolean isTodayAnswered(String account);
    void submitScore(String account, int totalScore);
}
