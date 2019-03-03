package study190301;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConTest2 {
	
	public static void main(String[] args) {
		String url = "jdbc:oracle:thin:@localhost:1521:TestDB";
		String id = "CHORONG";
		String pwd = "DLTGLD23";
		Connection con = null;
		
		try {
			con = DriverManager.getConnection(url, id, pwd);
			String sql = "select * from cat";
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getString("content"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		if(con!=null) {
			try {
				con.close();
			} catch(SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
