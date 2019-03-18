package study190312.food;

import java.util.HashMap;
import java.util.Map;

import study190312.food.controller.FoodController;
import study190312.food.dao.FoodDAO;
import study190312.food.dao.impl.FoodDAOImpl;

public class Execute {
	private FoodController fc = new FoodController();
	
	public static void main(String[] args) {
		FoodDAO fdao = new FoodDAOImpl();
		Map<String,String> req = new HashMap<>();
		Map<String,Object> res = new HashMap<>();
		Execute e = new Execute();
		
		
		try {
			//selectFoodList
//			req.put("cmd","list");
//			e.fc.doGet(req, res);
//			System.out.println(res);
			
			
			//selectFood
//			req = new HashMap<>();
//			res = new HashMap<>();
//			req.put("cmd","food");
//			req.put("foodNum","1");
//			e.fc.doGet(req, res);
//			System.out.println(res);
			
			
			//insertFood
//			req = new HashMap<>();
//			res = new HashMap<>();
//			req.put("cmd","insert");
//			req.put("foodName","타코야끼");
//			req.put("foodPrice","3000");
//			e.fc.doPost(req, res);
			
//			req = new HashMap<>();
//			res = new HashMap<>();
//			req.put("cmd","list");
//			e.fc.doGet(req, res);
//			System.out.println(res);
			
			
			//updateFood
//			req = new HashMap<>();
//			res = new HashMap<>();
//			req.put("cmd","update");
//			req.put("foodNum","4");
//			req.put("foodName","오코노미야끼");
//			req.put("foodPrice","20000");
//			e.fc.doPost(req, res);
//			System.out.println(res);
//			
//			req = new HashMap<>();
//			res = new HashMap<>();
//			req.put("cmd","list");
//			e.fc.doGet(req, res);
//			System.out.println(res);
			
			
			//deleteFood
			req = new HashMap<>();
			res = new HashMap<>();
			req.put("cmd","delete");
			req.put("foodNum","4");
			e.fc.doPost(req, res);
			
			req = new HashMap<>();
			res = new HashMap<>();
			req.put("cmd","list");
			e.fc.doGet(req, res);
			System.out.println(res);
			
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		
	}
}
