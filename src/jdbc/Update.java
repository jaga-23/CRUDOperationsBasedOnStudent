package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Update
{

	public static void main(String[] args)
	{
		Connection con = null;
		Statement s = null;
		{
			try 
			
		{
				// 1)Load the driver class
				
				Class.forName("com.mysql.cj.jdbc.Driver");
				
				// step 2)
				
				con =DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","admin");
				// step 3)
				
				s= con.createStatement();
				
				//step 4)
				
				
				s.executeUpdate("update emp1 set  ename = 'ganga' where eno=1");
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


