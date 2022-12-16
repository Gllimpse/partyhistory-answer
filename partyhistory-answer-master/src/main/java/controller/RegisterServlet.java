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

@WebServlet("/register")
public class RegisterServlet extends HttpServlet {
    public RegisterServlet() {
        super();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {}

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String account = req.getParameter("account");
        String password = req.getParameter("password");

        if(account.equals("") || password.equals("")){
            req.setAttribute("errInfo", "用户名或密码不能为空");
            RequestDispatcher rd = getServletConfig().getServletContext().getRequestDispatcher("/index.jsp");
            rd.forward(req, resp);
        }

        String info= ServiceFactory.getUserService().Register(account,password);
        if(info.charAt(0) == '#'){
            req.setAttribute("errInfo", info);
            RequestDispatcher rd = getServletConfig().getServletContext().getRequestDispatcher("/index.jsp");
            rd.forward(req, resp);
        }

        //生成cookie
        Cookie cookie = new Cookie("user",info);
        cookie.setMaxAge(60*60*24);
        resp.addCookie(cookie);
        resp.sendRedirect("/index.jsp");
    }
}
