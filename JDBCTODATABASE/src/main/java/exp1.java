import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class exp1 
{
public static void main(String args[])throws Exception
{
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/a","root","Bharath");
	Statement s=c.createStatement();
	String sql="select * from a";
	ResultSet rs=s.executeQuery(sql);
	while(rs.next())
	{
		System.out.println("id"+rs.getInt(1)+ "name"+rs.getString(2)+ "city"+rs.getString(3)+ "pin"+rs.getInt(4));
	}
	
}
}
