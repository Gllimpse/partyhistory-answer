package service.impl;

import entity.User;
import service.UserService;

public class UserServiceImpl implements UserService {
    @Override
    public boolean login(User user) {
        return false;
    }

    @Override
    public boolean isTodayAnswered(User user) {
        return false;
    }
}
