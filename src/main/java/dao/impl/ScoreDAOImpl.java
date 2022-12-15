package dao.impl;

import dao.ScoreDAO;
import entity.Score;
import util.DBHelper;

import java.sql.ResultSet;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ScoreDAOImpl implements ScoreDAO {
    @Override
    public void save(Score score) {
        String sql = "insert into scores (score,user_id,update_time) values (?,?,?)";
        try {
            PreparedStatement ps = DBHelper.getConn().prepareStatement(sql);
            ps.setInt(1, score.score);
            ps.setInt(2, score.userID);
            ps.setTimestamp(3, getNowTimeStamp());
            ps.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void update(Score score) {
        String sql = "update scores set score=?,update_time=? where user_id=?";
        try {
            PreparedStatement ps = DBHelper.getConn().prepareStatement(sql);
            ps.setInt(1, score.score);
            ps.setTimestamp(2, getNowTimeStamp());
            ps.setInt(3, score.userID);
            ps.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void delete(Score score) {
        //暂时没有这个需求
    }

    @Override
    public Score getScore(int userID) {
        String sql = "select * from scores where user_id = ?";
        PreparedStatement ps = null;
        Score score = null;
        try {
            ps = DBHelper.getConn().prepareStatement(sql);
            ps.setInt(1, userID);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Timestamp timestamp=rs.getTimestamp("update_time");
                String time=timestamp.toString().substring(0,19);//截取到毫秒

                score = new Score(rs.getInt("id"),
                        rs.getInt("score"),
                        rs.getInt("user_id"),
                       time);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return score;
    }


    public Timestamp getNowTimeStamp() {
        LocalDateTime now = LocalDateTime.now();

        // Convert the LocalDateTime object to a Timestamp object
        Timestamp timestamp = Timestamp.valueOf(now);
        return  timestamp;
    }
}
