package dao;

import entity.User;

public interface UserDAO {
    void save(User user);
    void update(User user);
    void delete(User user);
    public User getUserByAccount(String account);
}
