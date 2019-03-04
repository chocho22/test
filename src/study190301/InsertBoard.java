package study190301;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertBoard {
	public static void main(String[] args) {

		String url = "jdbc:oracle:thin:@localhost:1521:TestDB";
		String id = "CHORONG";
		String pwd = "12345";

		Connection con = null;

		try {
			con = DriverManager.getConnection(url, id, pwd);
			String title = "제목입니다.";
			String content = "내용입니다.";
			String sql = "insert into cat";
			sql += "(num,title,content,credat,cretim)";
			sql += "values(3,?,?,to_char(sysdate,'YYYYMMDD'), " + "to_char(sysdate,'HH24MISS'))";
			System.out.println(sql);
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, title);
			ps.setString(2, content);
			int cnt = ps.executeUpdate();
			System.out.println(cnt);
			if (cnt == 1) {
				System.out.println("정상적으로 1개가 입력되었다.");
			} else if (cnt == 0) {
				System.out.println("오류");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		if (con != null) {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
