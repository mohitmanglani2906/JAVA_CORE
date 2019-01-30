
package com.mohit.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class SelectFromTable 
{
    String mobile;
    String pass;
    
    String url="jdbc:mysql://localhost:3306/loginmodule";
    String uname="root";
    String password="";

    String query="select mobile_no,password from signup_info"; 
    public SelectFromTable(String mobile, String pass) 
    {
        this.mobile =mobile;
        this.pass = pass;
    }
    
    public boolean checkCredinatial() throws ClassNotFoundException
    {
        try
        {
           Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(url,uname,password);
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);
            
            String userData1="";
            String userData2="";
            while(rs.next())
            {
                 userData1 = rs.getString(1);
                 userData2=rs.getString(2);
                if(userData1.equals(mobile) && userData2.equals(pass))
                {
                    return true; 
                }
            }
             System.out.println(userData1 + " : " + userData2 + " : ");   
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
        return false;
    }
    
   
}
