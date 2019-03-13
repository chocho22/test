package study190312.food.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	private static final String URL = "jdbc:oracle:thin:@localhost:1521:TestDB";
	private static final String USER = "CHORONG";
	private static final String PASSWORD = "DLTGLD23";
	private static final String CLASS_NAME = "oracle.jdbc.OracleDriver";

	private static Connection con;

	private static boolean open() {
		try {
			Class.forName(CLASS_NAME);
			con = DriverManager.getConnection(URL, USER, PASSWORD);
			return true;
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}
	
	public static Connection getCon() {
		if(con==null) {
			if(open()) {
				return con;
			}
		}
		return null;
	}
	
	public static void close() {
		if(con!=null) {
			try {
				if(!con.isClosed() ) {
					con.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		con = null;
	}
}
