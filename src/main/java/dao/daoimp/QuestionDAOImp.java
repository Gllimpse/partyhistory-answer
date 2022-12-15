package dao.daoimp;

import dao.QuestionDAO;
import entity.Question;
import entity.User;
import util.DBHelper;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class QuestionDAOImp implements QuestionDAO {
    @Override
    public void save(Question question) {}

    @Override
    public void update(Question question) {}

    @Override
    public void delete(Question question) {}

    @Override
    public List<Question> getQuestions(int[] ids) {
        String sql = "select * from questions where id in (?,?,?,?,?,?,?,?,?,?)";
        PreparedStatement ps =null;
        List<Question> questions=new ArrayList<>();

        try {
            ps = DBHelper.getConn().prepareStatement(sql);
            for (int i=1;i<=10;i++) {
                ps.setInt(i,i); //这里先取前面10个
            }
            ResultSet rs = ps.executeQuery();
            Question question;
            while (rs.next()) {
                 question = new Question(rs.getInt("id"),
                        rs.getString("question"),
                        rs.getString("answer"),
                        rs.getString("right_answer"));
                questions.add(question);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return questions;
    }
}
