package com.example.servlet;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class SqrServlet extends HttpServlet {
    public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {

        Integer sum = (Integer)
                req.getAttribute("sum");

        PrintWriter out = res.getWriter();
        out.println(sum*sum);
        res.setHeader("Ceva", req.getRequestURI());


    }
}
