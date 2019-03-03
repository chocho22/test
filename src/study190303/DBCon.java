package study190303;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBCon {
	public static final String URL = "jdbc:oracle:thin:@localhost:1521:TestDB";
	public static final String USER = "CHORONG";
	public static final String PASSWORD = "DLTGLD23";
	public static Connection con = null;

	public static Connection getCon() {
		try {
			con = DriverManager.getConnection(URL, USER, PASSWORD);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return con;
	}

	public static void close() {
		if (con != null) {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
