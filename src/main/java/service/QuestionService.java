package service;

import entity.Question;

import java.util.List;

public interface QuestionService {
    List<Question> getQuestions();
    void submitAnswers(List<String> answers);
}
