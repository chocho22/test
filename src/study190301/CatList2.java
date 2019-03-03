package study190301;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class Cat {
	private String name;
	private int age;

	public Cat() {
		super();
	}

	public Cat(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Cat [name=" + name + ", age=" + age + "]";
	}
}

public class CatList2 {

	public static void main(String[] args) {

		List<Cat> catList = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			Cat c = new Cat();
			c.setName("냥이" + i);
			c.setAge(((int) (Math.random() * 30)) + 1);
			catList.add(c);
		}
		for (Cat cat : catList) {
			System.out.println(cat.toString());
		}
		
		List<HashMap<String, Object>> catList2 = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			HashMap<String, Object> hm = new HashMap<>();
			hm.put("name", "냥이" + i);
			hm.put("age", (int) (Math.random() * 30) + 1);
			catList2.add(hm);
		}
		for (HashMap hm1 : catList2) {
			System.out.println(hm1);
		}

		for (int i = 0; i < 10; i++) {
			HashMap<String, Object> c = catList2.get(i);
			c = new HashMap<>();
			c.put("name", "냥이!!!");
			System.out.println(catList2.get(i));
		}
	}
}
