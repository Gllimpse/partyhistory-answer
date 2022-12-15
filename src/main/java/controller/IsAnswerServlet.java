package controller;

import factory.ServiceFactory;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Objects;


@WebServlet("/isAnswer")
public class IsAnswerServlet extends HttpServlet {
    public IsAnswerServlet() {
        super();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String account=req.getParameter("user");
        if (Objects.equals(account, "")){
            System.out.println("what ??? isAnswer");
            resp.sendRedirect("error.html");
        }

        System.out.println("isAnswer:"+account);

        Boolean hasAnswer=ServiceFactory.getUserService().isTodayAnswered(account);
        req.setAttribute("isTodayAnswered", hasAnswer);
        RequestDispatcher rd = getServletConfig().getServletContext().getRequestDispatcher("home.jsp");
        rd.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {}
}
