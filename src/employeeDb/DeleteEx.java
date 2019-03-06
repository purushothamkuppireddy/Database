package employeeDb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DeleteEx {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/kpr","root","root");
			
			PreparedStatement stmt=con.prepareStatement("delete from employee where name=?");
			
			System.out.println("enter name");
			String name= sc.next();
			
			stmt.setString(1,name);
			
			
			int i=stmt.executeUpdate();

			if(i==1)
				System.out.println("DONE");
			else
				System.out.println("ERROR");
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
