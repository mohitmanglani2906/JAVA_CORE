// Here we will see how to insert values into a table using jdbc

package database2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author mohit2906
 */
public class InsertIntotable
{
    public static void main(String[] args) 
    {  
        String url="jdbc:mysql://localhost:3306/student";
        String uname="root";
        String pass="";
        String query="insert into `student_info` values(?,?,?)";  // here no of columns are fixed so that I have taken 3 ? marks!!!
        try{
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Class Found");
        }
        catch(ClassNotFoundException cnf)
        {
            System.out.println("Class Not found exception :" + cnf);
                
        }
        
        try
        {
           try
           {
                Connection con= DriverManager.getConnection(url,uname,pass);
                PreparedStatement st=con.prepareStatement(query); // query type is fixed so that we can insert with changing the query
                
                st.setString(1,"16it031");  // Here we have to enter values and their column number
                st.setString(2, "Meet");
                st.setString(3,"Parekh");
                int count=st.executeUpdate(); // It is a DML statement you cannot use executeQuery
                System.out.println(count +" row/s affected");
                st.close();
                con.close();
                
           }
           catch(SQLException sql)
           {
               System.out.println("SQL exception : " +sql);
           }
        }
        catch(Exception e)
        {
            System.out.println("Exception :" + e);
        }
    }
}
