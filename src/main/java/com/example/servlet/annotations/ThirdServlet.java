package com.example.servlet.annotations;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/third")
public class ThirdServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int k = 0;
        HttpSession session = req.getSession();
        k = (int) session.getAttribute("k");

        PrintWriter out = resp.getWriter();
        out.println("k = " + k);

    }
}
