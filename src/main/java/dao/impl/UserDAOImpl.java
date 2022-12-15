package dao.impl;

import dao.UserDAO;
import entity.User;
import util.DBHelper;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class UserDAOImpl implements UserDAO {
    @Override
    public void save(User user) {
        String sql = "insert into user (account,password) values (?,?)";
        try {
            PreparedStatement ps = DBHelper.getConn().prepareStatement(sql);
            ps.setString(1, user.account);
            ps.setString(2, user.password);
            ps.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void update(User user) {
        String sql = "update user set account=?,password=? where id=?";
        try {
            PreparedStatement ps = DBHelper.getConn().prepareStatement(sql);
            ps.setString(1, user.account);
            ps.setString(2, user.password);
            ps.setInt(3, user.id);
            ps.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void delete(User user) {
        String sql = "delete from user where account=?";
        try {
            PreparedStatement ps = DBHelper.getConn().prepareStatement(sql);
            ps.setString(1, user.account);
            ps.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public User getUserByAccount(String account) {
        String sql = "select * from user where account = ?";
        PreparedStatement ps = null;
        User user = null;
        try {
            ps = DBHelper.getConn().prepareStatement(sql);
            ps.setString(1,account);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                user = new User(rs.getInt("id"),
                        rs.getString("account"),
                        rs.getString("password"));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return user;
    }
}
