package employeeDb;

import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;



import java.sql.SQLException;
import java.sql.Connection;

public class Employee {
	

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/kpr","root","root");
			
			Statement stmt=con.createStatement();
			
			ResultSet rs=stmt.executeQuery("select * from employee");
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+ rs.getInt(6));
				
			}
			
			con.close();
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}

}
