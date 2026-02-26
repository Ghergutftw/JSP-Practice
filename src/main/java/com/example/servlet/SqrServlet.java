package com.example.servlet;

import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

public class SqrServlet extends HttpServlet {
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
        int num1 = 0;
        int num2 = 0;
        int num4 = 0;
        try {
            num1 = Integer.parseInt(req.getParameter("firstNumber"));
            num2 = Integer.parseInt(req.getParameter("secondNumber"));
        }catch (NumberFormatException e){
            System.out.println("NumberFormatException");
        }catch (NullPointerException e){
            System.out.println("NullPointerException");
        }

        //HTTP Session sharing
        HttpSession session = req.getSession();
        int num3 = (int) session.getAttribute("num3");
        session.removeAttribute("num3");

        //Cookie
        Cookie[] cookies = req.getCookies();
        for(Cookie c : cookies){
            if(c.getName().equals("num4")){
                num4 = Integer.parseInt(c.getValue());
            }
        }

        int sum = num1 + num2;

        PrintWriter out = res.getWriter();
        out.println("URL Params sum^2" + sum*sum);
        out.println("HttpSession num3 = " + num3 );
        out.println("Cookie num4 = " + num4 );
        res.setHeader("Ceva", req.getRequestURI());
        System.out.println("SqrServlet doGet");
    }

    public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {

        Integer sum = (Integer)
                req.getAttribute("sum");

        PrintWriter out = res.getWriter();
        out.println(sum*sum);
        res.setHeader("Ceva", req.getRequestURI());


    }
}
