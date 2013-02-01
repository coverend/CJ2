import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.PreparedStatement;

public class Main
{
public static void main (String[] args)throws Exception 
{
//Accessing driver from the Jar file
 Class.forName("com.mysql.jdbc.Driver");
 
 //Creating a variable for the connection called "con"
 Connection con = DriverManager.getConnection("jdbc:mysql://www.savianconsultants.com:3306/savianconsultants_com","a0000a6f","newlife2010" );
 //jdbc:mysql://localhost:3306/
 //root is the database user
 //RicSpring13 is password 
 
 //Here we create our query
 PreparedStatement statement = con.prepareStatement(" SELECT * FROM names");
 
 
 //Creating a variable to execute query
 ResultSet result = statement.executeQuery();
 
 while(result.next())
 {System.out.println(result.getString(1) + " " + result.getString(2));
 //getString returns the data
 //1 is the first field in the table
 //2 is the second field
 }

}
}