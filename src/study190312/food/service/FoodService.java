package study190312.food.service;

import java.util.List;

import study190312.food.vo.FoodVO;

public interface FoodService {
	public List<FoodVO> selectFoodList(FoodVO food);
	public FoodVO selectFood(Integer foodNum);
	public int insertFood(FoodVO food);
	public int updateFood(FoodVO food);
	public int deleteFood(FoodVO food);
}
