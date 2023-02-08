package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class insert 
{

	public static void main(String[] args)
	{
	Connection con = null;
	Statement s = null;
	{
		try 
		
	{
			// 1)
			Class.forName("com.mysql.cj.jdbc.Driver");
			// step 2)
			con =DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","admin");
			// step 3)
			s= con.createStatement();
			//step 4)
			String qry = "insert into emp1 values(2,'raju')";
			s.executeUpdate(qry);
		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				if(s!=null)
				{
					s.close();
				}
				if(con!=null)
				{
				con.close();	
				}
				
			}
			catch(SQLException e )
			{
				e.printStackTrace();
			}
		}

	}
	}
}
