package controller;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

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
        boolean isGoToAnswer = true;
        RequestDispatcher dispatcher;
        if (isGoToAnswer) {
            dispatcher = req.getRequestDispatcher("/answer.jsp");
        }else {
            dispatcher = req.getRequestDispatcher("/rank.jsp");
        }
        dispatcher.forward(req,resp);
    }
}
