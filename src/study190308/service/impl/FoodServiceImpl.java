package study190308.service.impl;

import java.util.List;

import study190308.dao.FoodDAO;
import study190308.dao.impl.FoodDAOImpl;
import study190308.service.FoodService;
import study190308.vo.FoodVO;

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
	public int insertFood(FoodVO food) throws Exception{
		List<FoodVO> tmpFoodList = fdao.selectFoodList(food);
		if(tmpFoodList.size()!=0) {
			throw new Exception("중복!!");
		}
		return fdao.insertFood(food);
	}

	@Override
	public int updateFood(FoodVO food) {
		return fdao.updateFood(food);
	}
	@Override
	public int deleteFood(FoodVO food) {
		return fdao.deleteFood(food);
	}
	
	public static void main(String[] args) {
		FoodService fs = new FoodServiceImpl();
		List<FoodVO> foodList = fs.selectFoodList(null);
//		System.out.println(foodList);
//		FoodVO food = new FoodVO();
//		food.setFoodName("훠궈");
//		foodList = fs.selectFoodList(food);
//		System.out.println(foodList);
		
		FoodVO food = new FoodVO();
		food.setFoodName("감바스");
		food.setFoodPrice(40000);
		int cnt = 0;
		try {
			cnt = fs.insertFood(food);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("저장 성공 : " + cnt);
	}
}
