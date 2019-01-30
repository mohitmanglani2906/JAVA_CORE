
package com.mohit.servlets;

import com.mohit.dao.UpdateValues;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class UpdateData extends HttpServlet
{
    @Override
    public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException
    {
            PrintWriter out = response.getWriter();
            System.out.println("In update.java");
            String first_name=request.getParameter("ufirst_name");
            String last_name=request.getParameter("ulast_name");
            String email_id=request.getParameter("uemail_id");
            String phone=request.getParameter("umobile_no");
            String dob=request.getParameter("udob");
            String password=request.getParameter("upwd");
            String repassword=request.getParameter("urepwd");
            String gender=request.getParameter("rd1");
            
            UpdateValues uv =  new UpdateValues(first_name,last_name,email_id,phone,dob,password,repassword,gender);
            
            Cookie cookies[] = request.getCookies();
            String pho = cookies[2].getValue();
            System.out.println(pho);
            System.out.println("");
            
            try
            {
                if(uv.updateMyTable(pho))
                {
                    response.sendRedirect("showUpdate.jsp");
                }
                else
                {
                    response.sendRedirect("update.jsp");
                }
            }
           catch(Exception e)
           {
               System.out.println(e.getMessage());
           }
            
            
    }
}
