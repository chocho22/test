package study190226;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MapExam1 {
	
	public static void main(String[] args) {
		HashMap<String,String> hm = new HashMap<>();
		hm.put("이름1","이초롱");
		hm.put("이름2","시리");
		hm.put("이름3","시우");
		
		System.out.println(hm);
		System.out.println(hm.get("이름2"));
		
		List<String> ll = new ArrayList<>();
		ll.add("이름1");
		ll.add("이름2");
		ll.add("이름3");
		
		System.out.println(ll);
	}

}
