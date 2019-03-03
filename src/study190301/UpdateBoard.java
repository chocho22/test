package study190301;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateBoard {
	public static void main(String[] args) {
		String url = "jdbc:oracle:thin:@localhost:1521:TestDB";
		String id = "CHORONG";
		String pwd = "DLTGLD23";
		
		Connection con = null;
		
		try {
			con = DriverManager.getConnection(url, id, pwd);
			String sql = "Update cat set title=?," +
					" content=? where num=?";
			PreparedStatement ps = con.prepareStatement(sql);
			String title = "제목 1번~";
			String content = "내용 1번~~";
			int num = 1;
			ps.setString(1, title);
			ps.setString(2, content);
			ps.setInt(3, num);
			int cnt = ps.executeUpdate();
			if(cnt==1) {
				System.out.println(num+"번 게시글이 정상적으로 수정되었습니다.");
			} else if (cnt==0) {
				System.out.println("게시글 번호를 다시 확인해주세요.");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} if(con!=null) {
			try {
			con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
