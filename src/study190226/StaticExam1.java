package study190226;

public class StaticExam1 {
	
	public static String name = "이초롱";
	public String name1 = "시우";
	
	public static void test() {
		System.out.println(StaticExam1.name);
	}
	
	public static void main(String[] args) {
//		StaticExam1.name = "시리";
		StaticExam1 se = new StaticExam1();
		se.name = "하하";
		se.name1 = "히히히";
		StaticExam1 se1 = new StaticExam1();
		System.out.println(se1.name);
		System.out.println(se1.name1);
//		System.out.println(StaticExam1.name);
	}

}
