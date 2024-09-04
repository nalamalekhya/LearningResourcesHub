package project;
import java.sql.*;
import java.sql.DriverManager;

public class DBConnect1 {

	public static Connection connect()throws Exception {
		// TODO Auto-generated method stub
Class.forName("oracle.jdbc.driver.OracleDriver");
		
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","alekhya2116");
	
		return con;
	}

}
