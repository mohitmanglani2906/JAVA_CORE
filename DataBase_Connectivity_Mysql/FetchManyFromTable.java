// Here we will that how to fetch more than one row value from a table in jdbc
package database2;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author mohit2906
 */
public class FetchManyFromTable
{
     public static void main(String[] args) 
    {
        
        String url="jdbc:mysql://localhost:3306/student";
        String uname="root";
        String pass="";
        String query="SELECT * FROM `student_info`";
        
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Class found");
              
        }
        catch(ClassNotFoundException ce)
        {
            System.out.println("Class not Found Exception " + ce);
            System.out.println("Class Not Found");
        }
          try
            {
                
                try
                {
                 Connection con= DriverManager.getConnection(url,uname,pass);
                 Statement st=con.createStatement(); // To create a statement that we will send to mysql database
                 ResultSet rs=st.executeQuery(query);  // Resultset is an interface that collects the tha in tabular format
                 
                 String userdata="";  // here rs.next() function gives the boolean value if next record is availble than it goes to
                 while(rs.next())     // next record and performs the task
                 {
                     userdata= rs.getString(1) + ":" + rs.getString(2) + " " + rs.getString(3);
                     System.out.println(userdata);
                 }                     // here getString(int column_number) gets the column number and return the String value
                 
                 st.close();
                 con.close();
                 
                }
                catch(SQLException sql)
                {
                    System.out.println("SQLException :" + sql);
                }
                
            }
          
          catch(Exception e)
          {
              System.out.println("Exception :" + e);
          }
    }       
    
}
