package com.example.servlet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class AddServlet extends HttpServlet {


//    @PostRequest
    public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
        int num1 = Integer.parseInt(req.getParameter("firstNumber"));
        int num2 = Integer.parseInt(req.getParameter("secondNumber"));

        int sum = num1 + num2;

        PrintWriter out = res.getWriter();
        out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);

        req.setAttribute("sum", sum);

        RequestDispatcher rd = req.getRequestDispatcher("sqr" );
        rd.forward(req,res);

    }

//    @GetRequest
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

        PrintWriter out = res.getWriter();
        out.println("This is a get Method");
    }

}
