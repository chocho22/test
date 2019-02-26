package study190226;

import java.util.HashMap;
import java.util.Set;

public class MapExam2 {
	
	public static void main(String[] args) {
		HashMap<String,String> map = new HashMap<>();
		map.put("이름","홍길동");
		map.put("나이","33");
		map.put("주소","광주");
		map.put("직업","개발자");
		System.out.println(map);
		
		Set<String> keys = map.keySet();
		System.out.println(keys.size());
		for(String key:keys) {
			System.out.println(key + " : " + map.get(key));
		}
	}

}
