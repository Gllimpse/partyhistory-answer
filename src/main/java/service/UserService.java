package service;

import entity.Score;
import entity.User;

public interface UserService {
    String Login(String account,String password);
    void Register(User user);
    boolean isTodayAnswered(User user);
    void submitScore(User user, int totalScore);
}
