package JDBCConnect;

import java.sql.*;
import java.util.Scanner;
import java.net.URL;
import java.net.URLClassLoader;

public class DBOperations {
	private static final String db = "jdbc:mysql://localhost:3306/coolthings";
	private static final String user = "root";
	private static final String pwd = "gates_user";
	
	private static Connection con;
	private static Statement stmt;
	private static ResultSet rs;
	private static PreparedStatement pstmt;
	
	
	public static void main(String args[])  {
		DBOperations d1 = new DBOperations();
		
		/*ClassLoader cl = ClassLoader.getSystemClassLoader();
        URL[] urls = ((URLClassLoader)cl).getURLs();
        for(URL url: urls){
        	System.out.println(url.getFile());
        } */

		
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter the option number:");
		System.out.println("1. Retrieve data");
		System.out.println("2.Insert a new record");
		System.out.println("3.Update a record");
		
		int choice = s1.nextInt();
		
		switch(choice) {
		case 1: d1.retrieveData();
		break;
		
		case 2: d1.insertRecord();
		break;
		
		case 3: d1.updateRecord();
		}
		s1.close();
	}
	
	public void retrieveData() {
		String query1 = "Select * from cars_tbl";
		try {
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
			}
			catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
			
			con=DriverManager.getConnection(db, user, pwd);
			
			stmt = con.createStatement();
			rs = stmt.executeQuery(query1);
			while (rs.next()) {
				System.out.println("");
				System.out.printf("Car Registration: %s, Car Model: %s, Car Color: %s, Kms run: %d", rs.getString("car_regn"), rs.getString("car_model"), rs.getString("car_color"), rs.getInt("car_mileage"));
			}
			}
		catch (SQLException e1) {
			e1.printStackTrace();
		}
		finally {
			try {
			con.close();
			stmt.close();
			rs.close();
			}
			catch (Exception e2) {
				e2.printStackTrace();
			}
			
		}
	
	}
	
	public void insertRecord() {
		//hardcoding - run more than once and see what happens
		//String query2 = "Insert into coolthings.cars_tbl (car_regn, car_model, car_color, car_mileage) \n" +
		//				"values ('GA02 BB 1234','Lotus', 'Black', 2700)";
		
		//Prepared statement
		
		String query2 = "Insert into coolthings.cars_tbl (car_regn, car_model, car_color, car_mileage) values (?,?,?,?)";
		
		Scanner s2 = new Scanner(System.in);
		
		try {
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
			}
			catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
			
			con=DriverManager.getConnection(db, user, pwd);
			
			pstmt = con.prepareStatement(query2);
			System.out.println("Car regn:");
			pstmt.setString(1, s2.nextLine());
			System.out.println("Car model:");
			pstmt.setString(2, s2.nextLine());
			System.out.println("Car color:");
			pstmt.setString(3, s2.nextLine());
			System.out.println("Kms run:");
			pstmt.setInt(4, s2.nextInt());
			
			int ret = pstmt.executeUpdate();
			if (ret == 1) {
				System.out.println("Successfully added a new record");
			}
			else {
				System.out.println("Unable to add a new record");
			}
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		finally {
			try {
			con.close();
			pstmt.close();
			s2.close();
			}
			catch (Exception e2) {
				e2.printStackTrace();
			}
	}
	
	}public void updateRecord() {
		
		//Prepared statement
		String query3 = "Update cars_tbl \n"+
				"SET car_color = ? \n"+
				"WHERE car_regn = ?";
		
		Scanner s3 = new Scanner(System.in);
		
		try {
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
			}
			catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
			
			con=DriverManager.getConnection(db, user, pwd);
			
			pstmt = con.prepareStatement(query3);
			System.out.println("Car regn that you want to update:");
			pstmt.setString(2, s3.nextLine());
			System.out.println("Car color:");
			pstmt.setString(1, s3.nextLine());
			
			int ret = pstmt.executeUpdate();
			if (ret == 1) {
				System.out.println("Successfully updated the record");
			}
			else {
				System.out.println("Unable to update the record. Verify regn number.");
			}
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		finally {
			try {
			con.close();
			pstmt.close();
			s3.close();
			}
			catch (Exception e2) {
				e2.printStackTrace();
			}
	}
	
	}
	
	
}
