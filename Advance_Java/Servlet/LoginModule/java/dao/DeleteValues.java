
package com.mohit.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;


public class DeleteValues 
{
    //String phone_no;
    String url="jdbc:mysql://localhost:3306/loginmodule";
    String uname="root";
    String pass="";
    
//    public DeleteValues(String phone_no)
//    {
//        this.phone_no=phone_no;
//    }
    public boolean deleteFromTable(String phone_no) throws ClassNotFoundException, SQLException
    {
        try
        {
            String query = "Delete From `signup_info` where mobile_no = ?";
            System.out.println("In com.mohit.dao.DeleteValues");
            System.out.println(phone_no);
            Class.forName("com.mysql.jdbc.Driver");
            Connection con =DriverManager.getConnection(url,uname,pass);
            PreparedStatement st = con.prepareStatement(query);
            st.setString(1, phone_no);
            int result = st.executeUpdate();
            if(result==1)
            { 
                System.out.println("No of Rows Affceted : " + result);
                return true;
            }
        
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
        
        
        
        return false;
    }
}
