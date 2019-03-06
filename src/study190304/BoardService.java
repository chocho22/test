package study190304;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BoardService {

	public List<OrderBoardVO> selectBoard(OrderBoardVO ob) {
		// package db.user.UserService 참고하기
		// package db.user2.UserService 참고하기
		String sql = "select * from order_board where 1=1";
		if (ob.getBuyer() != null) {
			sql += " and buyer=?";
		}
		if (ob.getReqName() != null) {
			sql += " and req_name=?";
		}
		Connection con = DBCon.getCon();
		try {
			PreparedStatement ps = DBCon.getCon().prepareStatement(sql);
			if (ob != null) {
				if (ob.getBuyer() != null) {
					ps.setString(1, ob.getBuyer());
				}
				if (ob.getReqName() != null) {
					int i = 1;
					if(ob.getBuyer()==null) {
						ps.setString(i++, ob.getReqName());
					} else {
						ps.setString(i++, ob.getReqName());
					}
				}
			}
			ResultSet rs = ps.executeQuery();
			List<OrderBoardVO> obList = new ArrayList<>();
			while (rs.next()) {
				OrderBoardVO ob2 = new OrderBoardVO();
				ob2.setOrderNum(rs.getInt("order_num"));
				ob2.setBuyer(rs.getString("buyer"));
				ob2.setBuyAdr(rs.getString("buy_adr"));
				ob2.setReqName(rs.getString("req_name"));
				ob2.setReqCnt(rs.getInt("req_cnt"));
				ob2.setReqDat(rs.getString("req_dat"));
				ob2.setReqTim(rs.getString("req_tim"));
				obList.add(ob2);
			}
			return obList;
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBCon.close();
		}
		return null;
	}

	public void insertBoard(String buyer, String buyAdr, String reqName, Integer reqCnt) {
		String sql = "insert into order_board(buyer,buy_adr,req_name,req_cnt)" + " values(?,?,?,?)";
		Connection con = DBCon.getCon();
		try {
			PreparedStatement ps = DBCon.getCon().prepareStatement(sql);
			ps.setString(1, buyer);
			ps.setString(2, buyAdr);
			ps.setString(3, reqName);
			ps.setInt(4, reqCnt);
			int cnt = ps.executeUpdate();
			if (cnt == 1) {
				System.out.println("게시글이 등록되었습니다.");
			} else if (cnt == 0) {
				System.out.println("오류");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBCon.close();
		}
	}

	public void updateBoard(String buyer, String buyAdr, String reqName, String reqCnt1) {
		String sql = "update order_board set ";
		if (!"\n".equals(buyAdr)) {
			sql += " buy_adr =?";
		}
		if (!"\n".equals(reqName)) {
			sql += " , req_name =?";
		}
		if (!"\n".equals(reqCnt1)) {
			sql += " , req_cnt=?";
		}
		sql += " where buyer=?";
		Connection con = DBCon.getCon();
		try {
			PreparedStatement ps = DBCon.getCon().prepareStatement(sql);
			int i = 1;
			if (!"\n".equals(buyAdr)) {
				ps.setString(i++, buyAdr);
			}
			if (!"\n".equals(reqName)) {
				ps.setString(i++, reqName);
			}
			if (!"\n".equals(reqCnt1)) {
				int reqCnt = Integer.parseInt(reqCnt1);
				ps.setInt(i++, reqCnt);
			}
			sql += " where buyer=?";
			ps.setString(i, buyer);
			int cnt = ps.executeUpdate();
			if (cnt == 1) {
				System.out.println(buyer + "님의 주문건이 정상적으로" + "수정되었습니다.");
			} else if (cnt == 0) {
				System.out.println(buyer + "님의 주문건이 오류로 수정되지" + "않았습니다.");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBCon.close();
		}
	}

	public void deleteBoard(String buyer, String reqName) {
		String sql = "delete from order_board where 1=1";
		if (!"\n".equals(buyer)) {
			sql += " and buyer=?";
		}
		if (!"\n".equals(reqName)) {
			sql += " and req_name=?";
		}
		Connection con = DBCon.getCon();
		try {
			PreparedStatement ps = DBCon.getCon().prepareStatement(sql);
			int i = 1;
			if (!"\n".equals(buyer)) {
				ps.setString(i++, buyer);
			}
			if (!"\n".equals(reqName)) {
				ps.setString(i++, reqName);
			}
			int cnt = ps.executeUpdate();
			if (cnt == 1) {
				System.out.println("주문건이 정상적으로 삭제되었습니다.");
			}
			if (cnt == 0) {
				System.out.println("이미 삭제된 주문건입니다.");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBCon.close();
		}
	}
}
