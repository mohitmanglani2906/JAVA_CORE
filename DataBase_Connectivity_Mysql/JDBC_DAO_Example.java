// Here we will see Data Access Object that is used to perform task that can be used in future more than one time
package database2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author mohit2906
 */
public class JDBC_DAO_Example 
{
    public static void main(String[] args) throws Exception
    {
        DAO_Student dao=new DAO_Student();
        Student s1=dao.getStudent("16it153");
        System.out.println(s1.fname);   
    }  
}
class DAO_Student
{
    public Student getStudent(String roll_no) 
    {
        Student s=new Student();
        String url="jdbc:mysql://localhost:3306/student";
        String uname="root";
        String pass="";
        String query="Select  * from student_info where roll_no='16it151'";
        try
        {
            Class.forName("com.mysql.jdbc.Driver"); 
        }
        catch(ClassNotFoundException cnf)
        {
            System.out.println("Class Not Found Exception :" + cnf);
        }
        try
        {
            try
            {
                Connection con= DriverManager.getConnection(url, uname, pass);
                Statement st=con.createStatement();
                ResultSet rs=st.executeQuery(query);
                rs.next();
                String name=rs.getString(2);
                s.fname=name;
                
                rs.close();
                con.close();
                
            }
            catch(SQLException sql)
            {
                System.out.println("SQL EXception:" + sql);
            }
        }
        catch(Exception e)
        {
            System.out.println("Exceptipn :" + e);
        }
       return s;
        
        
    }
}
class Student      // Here variables are columns that are in our table
{
    String roll_no,fname,lname;
}
