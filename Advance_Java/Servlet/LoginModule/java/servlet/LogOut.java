
package com.mohit.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.apache.tomcat.util.http.Cookies;


@WebServlet(name = "LogOut", urlPatterns = {"/LogOut"})
public class LogOut extends HttpServlet {

   
   


   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
    {
        HttpSession session = request.getSession();
        session.removeAttribute("fname");
        session.removeAttribute("pwd");
        session.invalidate();
        Cookie cookies[] = request.getCookies();
        cookies[1].setValue(null);
        cookies[2].setValue(null);
        
        response.sendRedirect("index.jsp");
        
    }

    
}
