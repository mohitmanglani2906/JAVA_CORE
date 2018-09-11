// Here we will see how to insert into table using Data Access object
package database2;

import com.mysql.jdbc.exceptions.MySQLSyntaxErrorException;
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
public class JDBC_DAO_Example2
{
    
    public static void main(String[] args) throws Exception
    {
        StudentDao dao=new StudentDao();
        Student1 s2=new Student1();
        s2.fname="Archana";
        s2.roll_no="16it123";
        s2.lname="Kanchana";
        dao.connect();
        dao.addStudent(s2);
    }
}
class StudentDao
{
    String url="jdbc:mysql://localhost:3306/student";
    String uname="root";
    String pass="";
    Connection con=null;
    public void connect() throws SQLException
    {
       try
        {
            Class.forName("com.mysql.jdbc.Driver"); 
            con= DriverManager.getConnection(url, uname, pass);
        }
        catch(ClassNotFoundException cnf)
        {
            System.out.println("Class Not Found Exception :" + cnf);
        } 
    }
 
    public void addStudent(Student1 s) 
    {
        
        String query="insert into student_info values (?,?,?)";  
        try
        {
            PreparedStatement pst=con.prepareStatement(query);
            pst.setString(1,s.roll_no);
            pst.setString(2,s.fname);
            pst.setString(3,s.lname);
            pst.executeUpdate();
        }
        catch(SQLException sql)
        {
            System.out.println("SQL Exception :" +sql);
        }    
    }
       
}
class Student1
{
    String roll_no,fname,lname;
}
