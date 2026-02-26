<%@ page import="java.io.PrintWriter" %><%--
  Created by IntelliJ IDEA.
  User: madalin.ghergut
  Date: 26.02.2026
  Time: 15:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body bgcolor="#f5f5dc">
<%--Cod care ruleaza JAVA -> HTML--%>
<%--Acest code intra in service() SecondServlet--%>
    <%
        int i = Integer.parseInt(request.getParameter("firstNumber"));
        int j = Integer.parseInt(request.getParameter("secondNumber"));

        int k = i + j;
        session.setAttribute("k", k);
        response.sendRedirect("third");
        //Merge
    %>
</body>
</html>
