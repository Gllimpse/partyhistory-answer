package service;

import entity.Score;
import entity.User;

public interface UserService {
    boolean login(User user);
    boolean isTodayAnswered(User user);
}
