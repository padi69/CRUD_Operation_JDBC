package myPackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Main {

	public static void main(String[] args) {
		
		// Driver load Class.forName("com.mysql.cj.jdbc.Driver");
		// connection
		// statement
		// statement execute
		// close the connection
		
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
