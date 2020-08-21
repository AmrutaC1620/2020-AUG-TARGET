<html>
<body>
<h2>Hello World!</h2>

<%
    for(int i=1; i<=6; i++){
        out.println("<h" + i + ">Hello, from JSP!</h" + i + ">");
    }
%>
</body>
</html>
