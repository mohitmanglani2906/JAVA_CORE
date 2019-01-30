
package com.mohit.servlets;

import com.mohit.dao.InsertValues;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class AddData extends HttpServlet
{
    public void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException
    {   
            String first_name = request.getParameter("fname");
            String last_name=request.getParameter("lname");
            String email_id = request.getParameter("email");
            String phone  = request.getParameter("phone");
            String dob = request.getParameter("dob");
            String pwd= request.getParameter("pwd");
            String pwd2 = request.getParameter("repwd");
            String gender = request.getParameter("rd1");
            InsertValues iv = new InsertValues(first_name, last_name, email_id, phone, dob, pwd, pwd2, gender);
           try
           {
               int i =iv.addData();
               if(i==1)
                {
                    System.out.println("Data Inserted......");
                    RequestDispatcher rd = request.getRequestDispatcher("welcome.jsp");
                    rd.forward(request,response);
                }
               else{
                   System.out.println("Data not Inserted.....");
                  /* HttpSession session = request.getSession();
                   session.setAttribute("first_name", first_name);
                   session.setAttribute("last_name", last_name);
                   session.setAttribute("email_id",email_id);
                   session.setAttribute("phone",phone);
                   session.setAttribute("dob",dob);
                   session.setAttribute("pwd",pwd);
                   session.setAttribute("pwd2",pwd2);
                   session.setAttribute*/
                   response.sendRedirect("index.jsp");
               }
           }
           
           catch(Exception e)
           {
               System.out.println(e.getMessage() + "Here is a error!!!!!!!");
           }
           
           
            
    }
}
