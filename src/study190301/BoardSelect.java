package study190301;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BoardSelect {
		public List<BoardInfoVO> selectBoard() {
		String sql = "select * from cat";
		Connection con = DBCon.getCon();
		System.out.println("연결성공");
		
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			List<BoardInfoVO> biList = new ArrayList<>();
			while(rs.next()) {
				BoardInfoVO bi = new BoardInfoVO();
				bi.setTitle(rs.getString("title"));
				bi.setNum(rs.getInt("num"));
				bi.setContent(rs.getString("content"));
				bi.setCredat(rs.getString("credat"));
				bi.setCretim(rs.getString("cretim"));
				bi.setCnt(rs.getInt("cnt"));
				bi.setIsactive(rs.getString("isactive"));
				biList.add(bi);
			}
			return biList;
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
		DBCon.close();
		}
		return null;
	}
}
