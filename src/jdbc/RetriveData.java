package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class RetriveData {

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
				
				con =DriverManager.getConnection("jdbc:mysql://:3306/jdbc","root","admin");
				// step 3)
				
				s= con.createStatement();
				
				//step 4)
				
				String qry = "select * from emp1";
				ResultSet rs = s.executeQuery(qry);
				
				while(rs.next()==true)
				{ 
				System.out.println("eno1"+rs.getInt(1));
				System.out.println("ename"+rs.getString(2));
				System.out.println("-------------");
				
				}
				
				
				
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



	