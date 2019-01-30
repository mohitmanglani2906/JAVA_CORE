
package com.mohit.servlets;

import com.mohit.dao.DeleteValues;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class DeleteData extends HttpServlet
{
    public void doGet(HttpServletRequest request,HttpServletResponse response)
    {
        System.out.println("we are in DeteData.java");
        
        Cookie cookies[] = request.getCookies();
        String pho = cookies[2].getValue();
        System.out.println("Phone  Number : " + cookies[2].getValue() + " " + pho);
        System.out.println("Password : " + cookies[1].getValue());
        
        DeleteValues dv = new DeleteValues();
        try
        {
                System.out.println("In try of delete of java:  ");
                if(dv.deleteFromTable(cookies[2].getValue()))
                {
                    response.sendRedirect("index.jsp");
                }
                else
                {
                    response.sendRedirect("welcome.jsp");
                }
        }
        
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
        
    }
}
