package study190226;

import java.util.ArrayList;
import java.util.List;

class Person1 {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person1 [name=" + name + "]";
	}
	
}
public class PersonList {

	public static void main(String[] args) {
		Person1 p = new Person1();
		p.setName("이초롱");
		System.out.println(p.getName());
		
		List<Person1> pList = new ArrayList<>();
		for(int i=0;i<10;i++) {
			Person1 p1=new Person1();
			pList.add(p1);
			p1.setName("이름"+(i+1));
		}
		System.out.println(pList);
	}

}
