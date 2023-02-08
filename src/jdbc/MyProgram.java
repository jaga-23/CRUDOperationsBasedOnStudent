package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class MyProgram {

	public static void main(String[] args) 
	{
		// step 1
				try
				{
					Class.forName("com.mysql.cj.jdbc.Driver");
					// step 2)
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","admin");
					//step 3)
					Statement s=con.createStatement();
		// step 4)
					s.executeUpdate("create table employ(eno int, ename varchar(50))");
					// step 5)
					s.close();
					con.close();
				} 
				catch (ClassNotFoundException e) 
				{
					e.printStackTrace();
				} catch (SQLException e) 
				{
					e.printStackTrace();
				}
			}

	}


