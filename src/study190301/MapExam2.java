package study190301;

import java.util.HashMap;
import java.util.Set;

public class MapExam2 {

	public static void main(String[] args) {
		HashMap<String,String> map = new HashMap<>();
		map.put("이름", "이초롱");
		map.put("나이", "31");
		map.put("주소", "부천");
		map.put("직업", "사람");
		System.out.println(map);
		
		Set<String> keys = map.keySet();
		System.out.println(keys.size());
		System.out.println(map.keySet());
		for(String key : keys) {
			System.out.println(key + " : " + map.get(key));
		}
	}
}
