package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Delete { 

	public static void main(String[] args)
	{
		Connection con = null;
		Statement s = null;
		{
			try 
			
		{
				// 1)Load the driver class
				
				Class.forName("com.mysql.cj.jdbc.Driver");
				
				// step 2)Establish connection
				
				con =DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","admin");
				
				// step 3)Prepare SQL statement
				
				s= con.createStatement();
				
				//step 4)Execute sql query
				
				
				s.executeUpdate("delete from emp1  where ename = 'jaga'");
			}
			catch (ClassNotFoundException e)
			{

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