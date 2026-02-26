package com.example.servlet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

public class AddServlet extends HttpServlet {


//    @PostRequest
    public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
        int num1 = Integer.parseInt(req.getParameter("firstNumber"));
        int num2 = Integer.parseInt(req.getParameter("secondNumber"));
        int num3 =10;
        int num4 = num3 * num3;

        int sum = num1 + num2;

        PrintWriter out = res.getWriter();
        out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);

        req.setAttribute("sum", sum);

        //HTTP Session sharing
        HttpSession session = req.getSession();
        session.setAttribute("num3" , num3);

        //Cookie
        Cookie cookie = new Cookie("num4", num4 + "");
        //Se adauga la respons deoarece sendRedirect, trimite un mesaj la clientul cu faptul
        //ca trebuie sa faca un request spre /sqr, cu acelasi req si res
        res.addCookie(cookie);

        //URL Rewriting
        //res.sendRedirect("sqr"+"?firstNumber=" + num1 + "&secondNumber=" + num2);

//      Go to SQR , si mai fa un request la fel
//        RequestDispatcher rd = req.getRequestDispatcher("sqr" );
//        rd.forward(req,res);

        res.sendRedirect("sqr");
    }

//    @GetRequest
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

        PrintWriter out = res.getWriter();
        out.println("This is a get Method");

        req.setAttribute("sum", 10);

        res.sendRedirect("sqr");
    }

}
