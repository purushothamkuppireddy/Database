package employeeDb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class UpdateEx {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/kpr","root","root");
			
			PreparedStatement stmt=con.prepareStatement("update employee set name=? where id=?");
			
			System.out.println("enter Id");
			stmt.setInt(2,sc.nextInt());
		
			System.out.println("enter name");
			String name= sc.next();
			stmt.setString(1,name);
			
			
			int i=stmt.executeUpdate();

			if(i==1)
				System.out.println("DONE");
			else
				System.out.println("ERROR");
		
//			PreparedStatement stmt2=con.prepareStatement("select * from employee where id=?");
//			System.out.println("enter Id");
//			stmt.setInt(1,sc.nextInt());
//			ResultSet rs=stmt2.executeQuery();
//			while(rs.next())
//			{
//				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+ rs.getInt(6));
//				
//			}
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
