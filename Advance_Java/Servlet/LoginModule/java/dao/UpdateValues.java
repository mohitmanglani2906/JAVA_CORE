
package com.mohit.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;


public class UpdateValues
{
    String first_name;
    String last_name;
    String email_id;
    String dob;
    String mobile_no;
    String password;
    String repassword;
    String gender;
    String url="jdbc:mysql://localhost:3306/loginmodule";
    String username="root";
    String pas="";
    
    
    public UpdateValues(String first_name,String last_name,String email_id,String mobile_no,String dob,String password,String repassword,String gender)
    {
        this.first_name=first_name;
        this.last_name=last_name;
        this.email_id=email_id;
        this.dob=dob;
        this.mobile_no=mobile_no;
        this.password=password;
        this.repassword=repassword;
        this.gender=gender;
    }
    
    public boolean updateMyTable(String phone_no) throws ClassNotFoundException, SQLException
    {
        String query="UPDATE `signup_info` SET `first_name`=?,`last_name`=?,`email_id`=?,`mobile_no`=?,`date`=?,`password`=?,`repassword`=?,`gender`=? WHERE `mobile_no`=?";
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection(url, username, pas);
        PreparedStatement ps = con.prepareStatement(query);
        
        ps.setString(1,first_name);
        ps.setString(2,last_name);
        ps.setString(3,email_id);
        ps.setString(4,mobile_no);
        ps.setString(5,dob);
        ps.setString(6,password);
        ps.setString(7,password);
        ps.setString(8,gender);
        ps.setString(9,phone_no);
        
        int i = ps.executeUpdate();
        System.out.println(phone_no +  "hereeeeeeee");
        System.out.println("No of rows Updated : " + i);
        
        if(i==1)
        {
            return true;
        }
        
        
        return false;
    }
    
}
