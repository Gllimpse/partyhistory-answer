package service.impl;

import dao.QuestionDAO;
import entity.Question;
import factory.DaoFactory;
import service.QuestionService;

import java.util.List;

public class QuestionServiceImpl implements QuestionService {
    @Override
    public List<Question> getQuestions() {
        QuestionDAO qDao = DaoFactory.getQuestionDAO();
        return qDao.getAll();
    }
}
