
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Validating Updates</title>
    </head>
    <body>
        <%
            
            String first_name=request.getParameter("ufirst_name");
            String last_name=request.getParameter("ulast_name");
            String email_id=request.getParameter("uemail_id");
            String phone=request.getParameter("umobile_no");
            String dob=request.getParameter("udob");
            String password=request.getParameter("upwd");
            String repassword=request.getParameter("reupwd");
            String gender=request.getParameter("rd1");
            
            System.out.println("we are in validateUpdate.jsp");
            System.out.println(first_name);
            System.out.println(password);
            System.out.println(repassword);
                
            String regex = "(.*)@gmail.com";
            
           if(request.getParameter("ufirst_name")==null ||request.getParameter("ulast_name")==null || request.getParameter("uemail_id")==null || request.getParameter("umobile_no")==null || request.getParameter("udob")==null || request.getParameter("upwd")==null || request.getParameter("rd1")==null)
           {
                //System.out.println("In first if") // This is for Debugging of code if you want you can skip!!!!;
               response.sendRedirect("update.jsp");
              
           }
           else if(first_name=="" || last_name=="" || email_id=="" || phone=="" || dob=="" || password=="" || repassword=="" )
           {
               //System.out.println("In 2nd if");  // This is for Debugging of code if you want you can skip!!!!;
               response.sendRedirect("update.jsp");
           }
           else if(!password.equals(repassword))
           {
               //System.out.println("in passswpprd"); // This is for Debugging of code if you want you can skip!!!!;
               response.sendRedirect("update.jsp");
           }
           else if((phone.length())!=10)
           {
              // System.out.println("in phone"); // This is for Debugging of code if you want you can skip!!!!;
               response.sendRedirect("update.jsp");
           }
           else if(!email_id.matches(regex))
           {
               //System.out.println("in email"); // This is for Debugging of code if you want you can skip!!!!;
               response.sendRedirect("update.jsp");
           }
           
           else 
           {
               RequestDispatcher rd = request.getRequestDispatcher("updatedata");
               rd.forward(request, response);
           }
           
            
            
            
            
        %>
    </body>
</html>
