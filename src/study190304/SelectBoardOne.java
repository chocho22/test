package study190304;

import java.util.Scanner;

public class SelectBoardOne {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("검색할 대상을 선택해주세요.");
		System.out.print("1. 모든 주문건");
		System.out.print("2. 주문자명");
		System.out.print("3. 품목명");
		String str = scan.nextLine();
		OrderBoardVO ob = new OrderBoardVO();
		if("1".equals(str)) {
			
		}
		if("2".equals(str)) {
			
		}
		if("3".equals(str)) {
			
		}
	}

}
