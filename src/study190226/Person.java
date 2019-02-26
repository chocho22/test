package study190226;

public class Person {
	public String name;
	public int age;
	
	public static void main(String[] args) {
		Person[] p = new Person[3];
		for(int i=0;i<p.length;i++) {
			p[i] = new Person();
			p[i].name = "이름" +i;
			p[i].age = i;
		}
		for(int i=0;i<p.length;i++) {
			System.out.println(i + "번의 이름은 " + p[i].name + "이고, 나이는 " + i + "살 입니다.");
		}
		
	}

}
