package daoimp;

import dao.ScoreDAO;
import model.Score;
import java.sql.ResultSet;
import java.util.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;

public class ScoreDAOImp implements ScoreDAO {
    @Override
    public void save(Score score) {
        String sql = "insert into scores (score,user_id,update_time) values (?,?,?)";
        try {
            PreparedStatement ps = DBConnect.conn.prepareStatement(sql);
            ps.setInt(1, score.score);
            ps.setInt(2, score.userID);
            ps.setString(3, getNowTime());
            ps.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void update(Score score) {
        String sql = "update scores set score=?,update_time=? where user_id=?";
        //生成日期对象
        Date current_date = new Date();
        //设置日期格式化样式为：yyyy-MM-dd
        SimpleDateFormat SimpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        //格式化当前日期
        String dataTime = SimpleDateFormat.format(current_date.getTime());
        try {
            PreparedStatement ps = DBConnect.conn.prepareStatement(sql);
            ps.setInt(1, score.score);
            ps.setString(2, getNowTime());
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
            ps = DBConnect.conn.prepareStatement(sql);
            ps.setInt(1, userID);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                score = new Score(rs.getInt("id"),
                        rs.getInt("score"),
                        rs.getInt("user_id"),
                        rs.getString("update_time"));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return score;
    }


    private String getNowTime() {
        //生成日期对象
        Date current_date = new Date();
        //设置日期格式化样式为：yyyy-MM-dd
        SimpleDateFormat SimpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        //格式化当前日期
        String dataTime = SimpleDateFormat.format(current_date.getTime());
        return dataTime;
    }
}
