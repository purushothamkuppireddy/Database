package employeeDb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import java.sql.PreparedStatement;

public class InsertEx {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/kpr","root","root");
			
			PreparedStatement stmt=con.prepareStatement("insert into employee values(?,?,?,?,?,?,?)");
			
			System.out.println("enter Id");
			stmt.setInt(1,sc.nextInt());
			System.out.println("enter name");
			stmt.setString(2,sc.next());
			System.out.println("enter dept");
			stmt.setString(3,sc.next());
			System.out.println("enter phone");
			stmt.setInt(4,sc.nextInt());
			System.out.println("enter address");
			stmt.setString(5,sc.next());
			System.out.println("enter age");
			stmt.setInt(6,sc.nextInt());
			System.out.println("enter salary");
			stmt.setInt(7,sc.nextInt());
			
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
