package controller;

import dao.QuestionDAO;
import entity.Question;
import factory.DaoFactory;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Glimpse
 * @date 2022/12/13 9:40
 * 用于主页跳转答题页、排行页
 */
@WebServlet("/StartServlet")
public class StartServlet extends HttpServlet {
    public StartServlet() {
        super();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String isTodayAnswered = "false";
        RequestDispatcher dispatcher;
        if (!isTodayAnswered.equals("true")) {
            QuestionDAO qDao = DaoFactory.getQuestionDAO();
            List<Question> qList = qDao.getQuestions(new int[]{1,2,3,4,5,6,7,8,9,10});
            List<List<String>> answerList = new ArrayList<>();
            qList.forEach(q -> {
                answerList.add(getAnswer(q));
            });
            req.setAttribute("questions",qList);
            req.setAttribute("answers",answerList);
            dispatcher = req.getRequestDispatcher("/answer.jsp");
        }else {
            dispatcher = req.getRequestDispatcher("/rank.jsp");
        }
        dispatcher.forward(req,resp);
    }

    private List<String> getAnswer(Question q) {
        List<String> aList = new ArrayList<>();
        // 除去首尾的“[”，“]”，再按‘,’切分成字符串数组
        String[] aArray = q.answer.substring(1, q.answer.length() - 1).split(",");
        for (String aStr : aArray){
            // 除去首尾的“ " ”
            aList.add(aStr.substring(1, aStr.length() - 1));
        }
        return aList;
    }
}
