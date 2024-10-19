package myPackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Main {

	public static void main(String[] args) {

		//Step of CRUD_OPERATION 
		// 1.Driver load Class.forName("com.mysql.cj.jdbc.Driver");
		// 2.connection
		// 3.statement
		// 4.statement execute
		// 5.close the connection
		
		Student st=new Student();
		//st.createDatabse();
		//st.createTable();
		//st.insertData();
		//st.readData();
		//st.updateData();
		st.deleteData();
		st.readData();

		

	}

}
