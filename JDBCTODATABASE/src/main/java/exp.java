import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;

public class exp 
{
public static void main(String args[])throws Exception
{
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/a","root","Bharath");
	Statement s=c.createStatement();
	String sql="create table a(id int,name varchar(40),city varchar(30))";
	String sql1="insert into a values(1,'bharath','hyd'),(2,'tharun','atp'),(3,'charan','tpt'),(4,'vineeth','vyd'),(5,'yuvatej','mpl')";
	String sql2="update a set pin=517328 where city='atp'";
	String sql3="alter table a add column(pin int)";
	String sql4="insert into a values(6,'rajesh','ctr',517352),(7,'hemanth','plmr',517895)";
	String sql5="delete from a where name='rajesh'";
	s.execute(sql5);
	c.close();
	System.out.println("done");
}
}
