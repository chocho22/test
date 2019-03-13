package study190312.food.dao;

import java.util.List;

import study190312.food.vo.FoodVO;

public interface FoodDAO {
	public List<FoodVO> selectFoodList(FoodVO food);
	public FoodVO selectFood(Integer foodNum);
	public int updateFood(FoodVO food);
	public int deleteFood(FoodVO food);
	public int insertFood(FoodVO food);
}
