import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class exp2 
{
public static void main(String args[])throws Exception
{
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/a","root","Bharath");
	PreparedStatement ps=c.prepareStatement("insert into a values(?,?,?,?)");
	ps.setInt(1,7);
	ps.setString(2,"rajesh");
	ps.setString(3,"ctr");
	ps.setInt(4,532475);
	ps.execute();
	PreparedStatement ps1=c.prepareStatement("update a set id=? where name=?");
	ps1.setInt(1,6);
	ps1.setString(2,"rajesh");
	ps1.execute();
	PreparedStatement ps2=c.prepareStatement("select * from a");
	ResultSet rs=ps2.executeQuery();
	while(rs.next())
	{
		System.out.println("id"+rs.getInt(1)+"name"+rs.getString(2)+"city"+rs.getString(3)+"pin"+rs.getInt(4));
	}
	System.out.println("done");
}
}
