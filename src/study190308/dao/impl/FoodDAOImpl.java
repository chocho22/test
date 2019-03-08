package study190308.dao.impl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import study190308.dao.FoodDAO;
import study190308.db.DBCon;
import study190308.vo.FoodVO;

public class FoodDAOImpl implements FoodDAO {
	public FoodVO selectFood(Integer foodNum) {
		String sql = "select food_num,food_name,food_price from food" +
				" where food_num=?";
		try {
			PreparedStatement ps = DBCon.getCon().prepareStatement(sql);
			ps.setInt(1, foodNum);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				FoodVO food = new FoodVO();
				food.setFoodNum(rs.getInt("food_num"));
				food.setFoodName(rs.getString("food_name"));
				food.setFoodPrice(rs.getInt("food_price"));
				return food;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			DBCon.close();
		}
		return null;
	}

	@Override
	public List<FoodVO> selectFoodList(FoodVO sfood) {
		String sql = "select food_num, food_name, food_price from food";
		try {
			PreparedStatement ps = DBCon.getCon().prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			List<FoodVO> foodList = new ArrayList<>();
			while(rs.next() ) {
				FoodVO food = new FoodVO();
				food.setFoodNum(rs.getInt("food_num"));
				food.setFoodName(rs.getString("food_name"));
				food.setFoodPrice(rs.getInt("food_price"));
				foodList.add(food);
			}
			return foodList;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			DBCon.close();
		}
		return null;
	}

	@Override
	public int insertFood(FoodVO food) {
		String sql = "insert into food(food_num,food_name,food_price)" +
				" values((select nvl(max(food_num),0)+1 from food) ,?,?)";
		try {
			PreparedStatement ps = DBCon.getCon().prepareStatement(sql);
			ps.setString(1, food.getFoodName());
			ps.setInt(2, food.getFoodPrice());
			return ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBCon.close();
		}
		return 0;
	}

	@Override
	public int updateFood(FoodVO food) {
		String sql = "update food set food_name=?, food_price=?" +
				" where food_num=?";
		try {
			PreparedStatement ps = DBCon.getCon().prepareStatement(sql);
			ps.setString(1, food.getFoodName());
			ps.setInt(2, food.getFoodPrice());
			ps.setInt(3, food.getFoodNum());
			return ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			DBCon.close();
		}
		return 0;
	}

	@Override
	public int deleteFood(FoodVO food) {
		String sql = "delete from food where food_num=?";
		try {
			PreparedStatement ps = DBCon.getCon().prepareStatement(sql);
			ps.setInt(1, food.getFoodNum());
			return ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			DBCon.close();
		}
		return 0;
	}
	
	
	public static void main(String[] args) {
		FoodDAO fdao = new FoodDAOImpl();
		FoodVO food = fdao.selectFood(1);
		System.out.println(food);
		
//		List<FoodVO> foodList = fdao.selectFoodList(FoodVO sfood);
//		System.out.println(foodList);
		
		FoodVO iFood = new FoodVO();
		iFood.setFoodNum(5);
		iFood.setFoodName("대하소금구이");
		iFood.setFoodPrice(80000);
//		int cnt = fdao.insertFood(iFood);
//		System.out.println("인서트 건수 : " + cnt);
		int cnt = fdao.updateFood(iFood);
		System.out.println("삭제 건수 : " + cnt);
		
	}
}
