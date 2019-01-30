
package com.mohit.servlets;

import com.mohit.dao.SelectFromTable;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class LoginAdd extends HttpServlet {
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
        String phone=request.getParameter("phone");
        String pwd =request.getParameter("pwd");
        
        PrintWriter out = response.getWriter();
        request.setAttribute("phone", phone);
        
                   Cookie c1 = new Cookie("ph",phone);
                   Cookie c2 = new Cookie("p",pwd);
                   c1.setMaxAge(60*24*24);
                   c1.setPath("/");
                   c2.setMaxAge(60*24*24);
                   c1.setPath("/");
                   response.addCookie(c1);
                   response.addCookie(c2);
        
       
        
        SelectFromTable sft = new SelectFromTable(phone,pwd);
        try 
        {
            if(sft.checkCredinatial())
            {
                    // HttpSession session = request.getSession();
                     //session.setAttribute("fname", first_name);
                 
                    RequestDispatcher rd = request.getRequestDispatcher("welcome.jsp");
                    rd.forward(request,response);
            }
            else
            {
                out.println("Invalid Credentials!!!");
                response.sendRedirect("index.jsp");
            }
        } 
        catch (ClassNotFoundException ex) 
        {
            System.out.println(ex.getMessage());
        }
        
        
    }

   

}
