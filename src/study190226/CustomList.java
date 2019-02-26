package study190226;
import java.util.Arrays;

public class CustomList {

	private String[] values;
	public CustomList() {
		values = new String[0];
	}
	
	public void add(String value) {
		String[] tmp = this.values;
		this.values = new String[this.values.length+1];
		for(int i=0;i<tmp.length;i++) {
			this.values[i] = tmp[i];
		}
		this.values[this.values.length-1] = value;
	}
	
	public int size() {
		return this.values.length;
	}
	
	@Override
	public String toString() {
		return "CustomList [values=" + Arrays.toString(values) + "]";
	}

	public static void main(String[] args) {
		CustomList cl = new CustomList();
		System.out.println(cl.size());
		cl.add("str");
		System.out.println(cl.size());
		System.out.println(cl);
	}
}
