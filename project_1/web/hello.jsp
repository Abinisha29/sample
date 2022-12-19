<%-- 
    Document   : hello
    Created on : 07-Dec-2022, 3:28:55 pm
    Author     : Abi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
           <%@page import="java.sql.*,java.util.*"%>
<%
//String first_name=request.getParameter("first_name");
try
{
         Class.forName("com.mysql.jdbc.Driver");
           Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/project2", "root", "");
           Statement st=conn.createStatement();
           int i=st.executeUpdate("insert into table1(user_name,password,email)values('g@gmail.com','admin','welcome')");
        out.println("Data is successfully inserted!");
        }
        catch(Exception e)
        {
        out.println(e.getMessage());
        //e.printStackTrace();
        }
 %>
    </body>
</html>