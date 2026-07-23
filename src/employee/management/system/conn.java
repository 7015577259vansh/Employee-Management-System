package employee.management.system;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;

public class conn {
	Connection connection;
	Statement statement;
	
	public conn()
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/employeemanagementss","root","Vansh@123@a");
		    statement=connection.createStatement();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
