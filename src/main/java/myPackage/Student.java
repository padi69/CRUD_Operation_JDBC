package myPackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Student {

	Scanner sc = new Scanner(System.in);

	public void createDatabse() {
		try {
			String url = "jdbc:mysql://localhost:3306/crud_jdbc";
			String username = "root";
			String pass = "vishnu@1234";

			Connection conn = DriverManager.getConnection(url, username, pass);
			Statement stm = conn.createStatement();

			String query = "create database DB2";
			stm.execute(query);
			System.out.println("Database created successfully..");

			conn.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void createTable() {

		try {
			String url = "jdbc:mysql://localhost:3306/crud_jdbc";
			String username = "root";
			String pass = "vishnu@1234";

			Connection conn = DriverManager.getConnection(url, username, pass);
			Statement stm = conn.createStatement();

			String query = "create table student(rollno int(3),sname varchar(200),semail varchar(200))";
			stm.execute(query);
			System.out.println("Table created successfully..");

			conn.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void insertData() {

		try {
			String url = "jdbc:mysql://localhost:3306/";
			String db = "crud_jdbc";
			String username = "root";
			String pass = "vishnu@1234";

			Connection conn = DriverManager.getConnection(url + db, username, pass);
			String query = "insert into student (rollno,sname,semail) values (?,?,?)";
			PreparedStatement pstm = conn.prepareStatement(query);
			pstm.setInt(1, 68);
			pstm.setString(2, "mahesh");
			pstm.setString(3, "maheshb@gmail.com");

			pstm.executeUpdate();
			System.out.println("Data inserted successfully..");

			conn.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void updateData() {
		try {
			String url = "jdbc:mysql://localhost:3306/";
			String db = "crud_jdbc";
			String username = "root";
			String pass = "vishnu@1234";

			Connection conn = DriverManager.getConnection(url + db, username, pass);
			String query = "update student set sname=?, semail=? where rollno=?";
			PreparedStatement pstm = conn.prepareStatement(query);
			pstm.setString(1, "vishnub");
			pstm.setString(2, "vishnub@gmail.com");
			pstm.setInt(3, 67);

			pstm.executeUpdate();
			System.out.println("Data updated successfully..");

			conn.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void readData() {
		try {
			String url = "jdbc:mysql://localhost:3306/";
			String db = "crud_jdbc";
			String username = "root";
			String pass = "vishnu@1234";

			Connection conn = DriverManager.getConnection(url + db, username, pass);
			String query = "select * from student";
			Statement stm = conn.createStatement();

			ResultSet rs = stm.executeQuery(query);
			while(rs.next())
			{
				System.out.print("RollNO:"+rs.getInt(1)+" Name:"+rs.getString(2)+" Email:"+rs.getString(3));
				System.out.println();
			}

			System.out.println("Data read successfully.." + rs);

			conn.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void deleteData() {
		try {
			String url = "jdbc:mysql://localhost:3306/";
			String db = "crud_jdbc";
			String username = "root";
			String pass = "vishnu@1234";

			Connection conn = DriverManager.getConnection(url + db, username, pass);
			String query = "delete from student where rollno=? && semail=?";
			PreparedStatement pstm = conn.prepareStatement(query);
			pstm.setInt(1, 68);
			pstm.setString(2, "mahesh@gmail.com");
			

			pstm.executeUpdate();
			System.out.println("Data deleted successfully..");

			conn.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
	}

}
