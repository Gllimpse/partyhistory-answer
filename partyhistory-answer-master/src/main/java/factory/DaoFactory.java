package factory;

import dao.QuestionDAO;
import dao.ScoreDAO;
import dao.UserDAO;
import dao.impl.QuestionDAOImpl;
import dao.impl.ScoreDAOImpl;
import dao.impl.UserDAOImpl;

public class DaoFactory {
    public static QuestionDAO getQuestionDAO(){
        return new QuestionDAOImpl();
    }

    public static ScoreDAO getScoreDAO(){
        return new ScoreDAOImpl();
    }

    public static UserDAO getUserDAO(){
        return new UserDAOImpl();
    }
}
