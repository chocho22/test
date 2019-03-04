package study190304;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBCon {
	public final static String URL = "jdbc:oracle:thin:@localhost:1521:TestDB";
	public final static String USER = "CHORONG";
	public final static String PASSWORD = "12345";

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
