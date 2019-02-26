package study190226;

public class Tmps {
	
	public static void main(String[] args) {
		int[] nums = new int[5];
		for(int i=0;i<nums.length;i++) {
			nums[i]=i;
		}
		for(int i=0;i<nums.length;i++) {
			System.out.println(nums[i]);
		}
		
		int[] tmps = nums;
		nums = new int[10];
		for(int i=0;i<nums.length;i++) {
			if(i<tmps.length) {
				nums[i] = tmps[i];
			}
			nums[i] = i;
		}
		for(int i=0;i<nums.length;i++) {
			System.out.println(nums[i]);
		}
	}
}
