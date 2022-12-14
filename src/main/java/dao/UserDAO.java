package dao;

import model.Question;
import model.User;

import java.util.List;

public interface UserDAO {
    void save(User user);
    void update(User user);
    void delete(User user);
    public User getUserByAccount(String account);
}
