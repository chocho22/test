package study190301;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Connection1 {

	public static void main(String[] args) {
		String url = "jdbc:oracle:thin:@localhost:1521:TestDB";
		String id = "CHORONG";
		String pwd = "DLTGLD23";
		Connection con = null;
		
		try {
			con = DriverManager.getConnection(url,id,pwd);
			Statement stmt = con.createStatement();
			String sql = "select * from cat";
			ResultSet rs = stmt.executeQuery(sql);
			while (rs.next()) {
				System.out.println(rs.getString("title"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		if(con!=null) {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
