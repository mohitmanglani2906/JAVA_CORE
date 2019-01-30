<%-- 
    Document   : validate.jsp
    Created on : Jan 1, 2019, 10:33:00 AM
    Author     : mohit2906
--%>

<%@page import="org.apache.catalina.filters.RequestDumperFilter"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Validating</title>
    </head>
    <body>
       
        <%
            
            String first_name = request.getParameter("fname");
            String last_name=request.getParameter("lname");
            String email_id = request.getParameter("email");
            String phone  = request.getParameter("phone");
            String dob = request.getParameter("dob");
            String pwd= request.getParameter("pwd");
            String pwd2 = request.getParameter("repwd");
            String gender = request.getParameter("rd1");

            String regex = "(.*)@gmail.com";
            
            request.setAttribute("phone",phone);
            
           if(request.getParameter("fname")==null || request.getParameter("lname")==null || request.getParameter("email")==null || request.getParameter("phone")==null || request.getParameter("dob")== null || request.getParameter("pwd")==null || request.getParameter("repwd")==null || request.getParameter("rd1")==null )
           {
               out.println("All the value should be filled");
               response.sendRedirect("index.jsp");
           } 
            
           else if(first_name=="" || last_name=="" || email_id=="" || phone=="" || dob=="" || pwd=="" || pwd2=="")
            {
                    try
                    {
                        System.out.println("All the value should be filled");
                        response.sendRedirect("index.jsp");
                    }
                    catch(Exception e)
                    {
                        out.println("Sorry Unautorized User!!!!");
                    }
                
            }
           
          else if(!pwd.equals(pwd2))
           {
               try{
                    System.out.println("Password and Repassword should be same!!");
                    response.sendRedirect("index.jsp");
               }
               catch(Exception e)
               {
                   out.println("Sorry Unautorized User!!!!");
               }
               
           }
           
           else if(!email_id.matches(regex))
            {
                try{
                    System.out.println("Enter valid emai id : ");
                    response.sendRedirect("index.jsp");
                }
                catch(Exception e)
                {
                    out.println("Sorry Unautorized User!!!!");
                }
                
            }
           else if((phone.length())!=10)
           {
               try
                {
                    System.out.println("Phone Should have length 10");
                    response.sendRedirect("index.jsp");
                }
                catch(Exception e)
                {
                    out.println("Sorry Unautorized User!!!!");
                }
           }
            
            else
           {
                try
                    {
                         RequestDispatcher rd = request.getRequestDispatcher("adddata");
                         rd.forward(request,response);
                   }
                   catch(Exception e)
                   {
                       out.println("Sorry Unautorized User!!!!");
                   }
           }
           
                
                  
                          
           
        
           %>
           
    </body>
</html>
