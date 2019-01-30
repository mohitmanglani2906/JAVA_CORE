<%-- 
    Document   : show
    Created on : Jan 23, 2019, 8:42:54 PM
    Author     : mohit2906
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<%@taglib  prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>All Users</title>
        <style>
            body{
                background-color: coral;
                font-family:arial;
            }
            th,td{
                border-bottom:1px solid black;
                border-right: 1px solid black;
                text-align: left;
                padding:5px;
            }
            #sign1{
                width:150px;
            }
            table{
                width:50%;
                height:auto;
                border-spacing: 0px;
                background-color: white;
                align:center;
            }
           #previouspage
            {
                border:0px solid black;
                background-color: blue;
                color:#f1f1f1;
                margin-top: 20vh;
                margin-left: 100vh;
                width:150px;
                height:50px;
                font-weight: bold;
                box-shadow: 1px 1px 1px 1px grey;
                font-size: 25px;
            }
        </style>
    </head>
    <body>
        
       
        
        <sql:setDataSource var="db" driver="com.mysql.jdbc.Driver" url="jdbc:mysql://localhost:3306/loginmodule" user="root" password="" />
        <sql:query var="rs" dataSource="${db}">select * from signup_info</sql:query>
        <% int i=0; %>
        <table style="border:1px solid black;" align="center">
            <h1 style="text-align: center">All Users</h1>
            <tr>
                <td>Sr No.</td>
                <td>First Name</td>
                <td>Last Name</td>
                <td>Email id</td>
                <td>Mobile no</td>
                <td>Birth Date</td>
                <td>Gender</td>
            </tr>
            <c:forEach var="result" items="${rs.rows}">
            <tr>
                <th><% out.println(++i);%></th>
                <th><c:out value="${result.first_name}"></c:out></th>
                <th><c:out value="${result.last_name}"></c:out></th>
                <th><c:out value="${result.email_id}"></c:out></th>
                <th><c:out value="${result.mobile_no}"></c:out></th>
                <th><c:out value="${result.date}"></c:out></th>
                <th><c:out value="${result.gender}"></c:out></th>
            </tr>
            </c:forEach>
        </table>
        
        
        <% 
            String pho ="";
            String pa ="";
            int i1=0;
            Cookie cookies[]= request.getCookies();
            System.out.println("we are in show.jsp");
            
            for(Cookie c1: cookies)
            {
                i1++;
                if(c1.equals("ph"))
                {
                    pho = c1.getValue().toString();
                    System.out.println(pho);
                }
               else
                {
                    pa = c1.getValue().toString();
                    System.out.println(pa);
                }
            }
            
           System.out.println("total : " + i1);
            
           response.setContentType("text/html");
           out.println("<html>"
                   + "<form action='welcome.jsp' method='post'>"
                   + "<input type='submit' value='Go back' id='previouspage'>"
                   + "</html>");
        
        
        %>
        
        
        
            
        
    </body>
</html>
