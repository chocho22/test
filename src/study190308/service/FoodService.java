package study190308.service;

import java.util.List;

import study190308.vo.FoodVO;

public interface FoodService {
	public List<FoodVO> selectFoodList(FoodVO food);
	public FoodVO selectFood(Integer foodNum);
	public int insertFood(FoodVO food) throws Exception;
	public int updateFood(FoodVO food);
	public int deleteFood(FoodVO food);
}
