

<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Confirmation</title>
    </head>
    <body>
        
        <% 
            String pho ="";
            String pa="";
            String url = "jdbc:mysql://localhost:3306/loginmodule";
            String uname = "root";
            String pass="";
            Cookie cookies[] = request.getCookies();
            pa= cookies[1].getValue();
            pho = cookies[2].getValue();
            System.out.println("password is : " + pa);
            System.out.println("Phone Number is :" + pho);
            String query = "Delete From signup_info where mobile_no='pho'";
           // response.setContentType("text/script");
            
           
        
        
        %>
        <script>
           var v = confirm("Are you sure??");
           if(v)
           {
               window.location="deletedata";
           }   
           else{
               window.location="welcome.jsp";
           }
          
        </script>
    </body>
</html>
