package study190226;

public class MethodExam1 {
	public String name = "이초롱";
	
	public static void setTest(MethodExam1 me) {
		me = new MethodExam1();
	}
	
	public static void main(String[] args) {
		MethodExam1 me = new MethodExam1();
		me.name = "시우";
		MethodExam1.setTest(me);
		System.out.println(me.name);
	}

}
