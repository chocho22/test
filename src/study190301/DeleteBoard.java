package study190301;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeleteBoard {
	public static void main(String[] args) {
		String url = "jdbc:oracle:thin:@localhost:1521:TestDB";
		String id = "CHORONG";
		String pwd = "12345";
		Connection con = null;
		
		try {
			con = DriverManager.getConnection(url, id, pwd);
			String sql = "delete from cat where num=?";
			PreparedStatement ps = con.prepareStatement(sql);
			int num = 3;
			ps.setInt(1, num);
			int cnt = ps.executeUpdate();
			if(cnt==1) {
				System.out.println(num+"번 게시글이 정상적으로 삭제되었습니다.");
			} else {
				System.out.println("이미 삭제된 게시글입니다.");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}if(con!=null) {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
