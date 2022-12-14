package dao;

import entity.Question;

import java.util.List;

public interface QuestionDAO {
    void save(Question question);
    void update(Question question);
    void delete(Question question);
    List<Question> getQuestions(int[] ids);
}
