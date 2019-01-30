
package com.mohit.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class InsertValues
{
   
    String fname;
    String lname;
    String email_id;
    String phone;
    String date;
    String pwd;
    String repwd;
    String gender;
    
    String url="jdbc:mysql://localhost:3306/loginmodule";
    String uname="root";
    String pass="";
    String query="INSERT INTO `signup_info`(`first_name`, `last_name`, `email_id`, `mobile_no`, `date`, `password`, `repassword`, `gender`) VALUES (?,?,?,?,?,?,?,?)";

    public InsertValues(String fname, String lname, String email_id, String phone, String date, String pwd, String repwd, String gender) {
        this.fname = fname;
        this.lname = lname;
        this.email_id = email_id;
        this.phone = phone;
        this.date = date;
        this.pwd = pwd;
        this.repwd = repwd;
        this.gender = gender;
    }
    
    
    public int addData() throws ClassNotFoundException, SQLException
    {
        
        
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection(url,uname,pass);
        PreparedStatement ps = con.prepareStatement(query);
        ps.setString(1,fname);
        ps.setString(2,lname);
        ps.setString(3,email_id);
        ps.setString(4,phone);
        ps.setString(5,date);
        ps.setString(6,pwd);
        ps.setString(7,repwd);
        ps.setString(8, gender);
        int count = ps.executeUpdate();
        System.out.println("Rows added : " + count);
        
        ps.close();
        con.close();
        
        
        
       return count;
        
        
    }
}

