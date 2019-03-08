package study190308.dao;

import java.util.List;

import study190308.vo.FoodVO;

public interface FoodDAO {
	public List<FoodVO> selectFoodList(FoodVO food);
	public FoodVO selectFood(Integer foodNum);
	public int insertFood(FoodVO food);
	public int updateFood(FoodVO food);
	public int deleteFood(FoodVO food);
}
