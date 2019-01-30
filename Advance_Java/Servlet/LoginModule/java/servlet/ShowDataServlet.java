
package com.mohit.servlets;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class ShowDataServlet extends HttpServlet 
{
    public void doGet(HttpServletRequest request,HttpServletResponse reponse)
    {
        String phone_number= request.getParameter("phone");
        String pass = request.getParameter("pwd");
        
        System.out.println(phone_number + "Heeeeeeeeeeeeeeeeeeeeeeeee");
        System.out.println(pass + "Heeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee");
    }
}
