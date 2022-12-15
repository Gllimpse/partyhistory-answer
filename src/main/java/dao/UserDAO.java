package dao;

import entity.Score;
import entity.User;

import java.util.List;

public interface UserDAO {
    void save(User user);
    void update(User user);
    void delete(User user);
    User getUserByAccount(String account);

    User getUserById(int userID);
}
