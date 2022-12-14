package daoimp;

import dao.QuestionDAO;
import model.Question;

import java.util.ArrayList;
import java.util.List;

public class QuestionDAOImp implements QuestionDAO {
    @Override
    public void save(Question question) {

    }

    @Override
    public void update(Question question) {
        // 建立数据库连接，更新数据，关闭连接
    }

    @Override
    public void delete(Question question) {
        // 建立数据库连接，删除数据，关闭连接
    }

    @Override
    public List<Question> getAll() {
        // 建立数据库连接，查询数据，关闭连接，返回查询结果
        return new ArrayList<>();
    }
}
