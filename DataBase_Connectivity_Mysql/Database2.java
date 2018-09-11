// Here we will see how to connect database with java
package database2;
import java.rmi.ConnectException;
import java.sql.*;

 
public class Database2 {

    
    public static void main(String[] args) throws Exception
    {
        String url="jdbc:mysql://localhost:3306/student";  // here I have given mysql server and its port number hosting is localhost and database name is student
        String uname="root"; // bydefault username  is root in mysql
        String pass="";  // password is blank
        String query="SELECT `roll_no`, `fname`, `lname` FROM `student_info` WHERE roll_no='16it153'";  // query that you want to perform on ur database
            try
		{
			Class.forName("com.mysql.jdbc.Driver");  // this will call Driver class from the library // which you have to include in ur libraries
			System.out.println("Class found");
		}
		catch(ClassNotFoundException e)
		{
			System.out.println("Classnot found");
		}
           
            try
            {
                
                try
                {
                 Connection con= DriverManager.getConnection(url,uname,pass);  // Connection is an interface to connect database to java DriverManager by getConnection function
                 Statement st=con.createStatement(); // To create a statement that we will send to mysql database
                 ResultSet rs=st.executeQuery(query);  // Resultset is an interface that collects the tha in tabular format
                                                        //executeQuery is used for passing arguments as query
                 rs.next();  // to move ur pointer to first record of the database table
                 String first_name=rs.getString("fname"); 
                 String last_name=rs.getString("lname"); // here getString(String column_name) gets the value from a column and returns the strinf
                 System.out.println(first_name + " " + last_name);
                 st.close();  // to close the query
                 con.close(); // to close the database
                }
                catch(SQLException sq)
                {
                    System.out.println("SQLEXception :" + sq);
                }
            }
                catch(Exception e)
                {
                    System.out.println("Exception :" +e);
                }
            
            
    }
    
}
