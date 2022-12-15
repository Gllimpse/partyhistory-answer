package controller;

import entity.User;
import factory.ServiceFactory;
import service.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author Glimpse
 * @date 2022/12/13 10:40
 * 提交答题结果
 */
@WebServlet("/AnswerServlet")
public class AnswerServlet extends HttpServlet {
    public AnswerServlet() {
        super();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int totalScore = 0;
        for (int i = 1;i<=10;i++){
            String answerName = "q"+i;
            String correctName = answerName+"_answer";
            String answer = req.getParameter(answerName);
            String correct = req.getParameter(correctName);
            if (answer.equals(correct)){
                totalScore++;
            }
        }
        UserService userService = ServiceFactory.getUserService();
//        userService.submitScore((User)req.getSession().getAttribute("user"),totalScore);
        req.setAttribute("score",totalScore);
        req.getRequestDispatcher("/result.jsp").forward(req,resp);
    }
}
