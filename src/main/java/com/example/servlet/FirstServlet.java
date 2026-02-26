package com.example.servlet;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class FirstServlet extends HttpServlet {
    //http://localhost:8080/servlet/first
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        out.print("De la: \n");

        ServletContext servletContext = getServletContext();
        String servletContextName = servletContext.getInitParameter("name");
        out.println("-Servlet Context : " + servletContextName);

        ServletConfig servletConfig = getServletConfig();
        String servletName = servletConfig.getInitParameter("name");
        out.println("-Servlet Config : " + servletName);


    }
}
