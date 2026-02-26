package com.example.servlet.annotations;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/second")
public class SecondServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int i = Integer.parseInt(req.getParameter("firstNumber"));
        int j = Integer.parseInt(req.getParameter("secondNumber"));

        int k = i - j;

        HttpSession session = req.getSession();
        session.setAttribute("k", k);

        resp.sendRedirect("third");

    }
}
