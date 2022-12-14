package factory;

import service.impl.QuestionServiceImpl;
import service.impl.ScoreServiceImpl;
import service.impl.UserServiceImpl;
import service.QuestionService;
import service.ScoreService;
import service.UserService;

public class ServiceFactory {
    public static UserService getUserService(){
        return new UserServiceImpl();
    }

    public static QuestionService getQuestionService(){
        return new QuestionServiceImpl();
    }

    public static ScoreService getScoreService(){
        return new ScoreServiceImpl();
    }
}
