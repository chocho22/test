package study190305;

public class Test extends Test2{
	public int sum(String str) {
		return 0;
	}
	private int hour;

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		if(hour<=0 || hour>23) return;
		this.hour = hour;
	}

}
