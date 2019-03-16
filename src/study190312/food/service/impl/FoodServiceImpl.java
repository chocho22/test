package study190312.food.service.impl;

import java.util.List;

import study190312.food.dao.FoodDAO;
import study190312.food.dao.impl.FoodDAOImpl;
import study190312.food.service.FoodService;
import study190312.food.vo.FoodVO;

public class FoodServiceImpl implements FoodService {
	
	private FoodDAO fdao = new FoodDAOImpl(); 

	@Override
	public List<FoodVO> selectFoodList(FoodVO food) {
		return fdao.selectFoodList(food);
	}

	@Override
	public FoodVO selectFood(Integer foodNum) {
		return fdao.selectFood(foodNum);
	}

	@Override
	public int insertFood(FoodVO food) throws Exception {
		List<FoodVO> tmpFoodList = fdao.selectFoodList(food);
		if(tmpFoodList.size() != 0) {
			throw new Exception("중복");
		}
		return fdao.insertFood(food);
	}

	@Override
	public int updateFood(FoodVO food) throws Exception {
		List<FoodVO> tmpFoodList = fdao.selectFoodList(food);
		for(FoodVO fvo : tmpFoodList) {
			if(fvo.getFoodName().indexOf(food.getFoodName()) != -1) {
				throw new Exception("중복");
			}
		}
		return fdao.updateFood(food);
	}

	@Override
	public int deleteFood(FoodVO food) throws Exception {
		FoodVO tmpFood = fdao.selectFood(food.getFoodNum());
		if(tmpFood==null) {
			throw new Exception("이미 삭제된 음식");
		}
		return fdao.deleteFood(food);
	}
}
