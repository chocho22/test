package study190304;

import java.util.List;
import java.util.Scanner;

public class Execute {

	public static void main(String[] args) {
		System.out.println("안녕하세요. 로그인을 해주세요.");
		Scanner scan = new Scanner(System.in);
		String cmd = null;
		do {
			System.out.print("ID : ");
			String id = scan.nextLine();
			if ("CHORONG".equals(id)) {
				System.out.print("PW : ");
				String pw = scan.nextLine();
<<<<<<< HEAD
				if ("DLTGLD23".equals(pw)) {
					System.out.println("CHORONG님 안녕하세요" + 
				"\n원하시는 번호를 선택해주세요.");
=======
				if ("12345".equals(pw)) {
					System.out.println("CHORONG님 안녕하세요" + "\n원하시는 번호를 선택해주세요.");
>>>>>>> refs/remotes/origin/Test1
					System.out.println("1. 목록 조회");
					System.out.println("2. 주문건 등록");
					System.out.println("3. 주문건 수정");
					System.out.println("4. 주문건 삭제");
					System.out.println("q. 종료");
					cmd = scan.nextLine();
					BoardService bs = new BoardService();
					do {
					if ("1".equals(cmd)) {
<<<<<<< HEAD
						
=======
						System.out.println("검색할 대상을 선택해주세요.");
						System.out.println("1. 검색 안함");
						System.out.println("2. 주문자명");
						System.out.println("3. 품목명");
						System.out.print("번호 : ");
						List<OrderBoardVO> obList = null;
						OrderBoardVO ob = new OrderBoardVO();
						String cmd2 = scan.nextLine();
						if("1".equals(cmd2)) {
							obList = bs.selectBoard(ob);
						} else {
							System.out.println("검색할 내용을 입력해주세요.");
							String searchStr = scan.nextLine();
							if("2".equals(cmd2)) {
								ob.setBuyer(cmd2);
							} else if("3".equals(cmd2)) {
								ob.setReqName(cmd2);
							}
							obList = bs.selectBoard(ob);
						}
						for(OrderBoardVO ob3 : obList) {
							System.out.println(ob3);
						}
						// 이전으로 돌아가기??
>>>>>>> refs/remotes/origin/Test1
					} else if ("2".equals(cmd)) {
						System.out.println("주문건을 등록해주세요.");
						System.out.print("주문자명 : ");
						String buyer = scan.nextLine();
						System.out.print("주소 : ");
						String buyAdr = scan.nextLine();
						System.out.print("품목명 : ");
						String reqName = scan.nextLine();
						System.out.print("수량 : ");
						String strCnt = scan.nextLine();
						int reqCnt = Integer.parseInt(strCnt);
						bs.insertBoard(buyer, buyAdr, reqName, reqCnt);
					} else if ("3".equals(cmd)) {
						System.out.println("주문자명을 먼저 입력한 후 "+
								"주소, 품목명, 수량 중 1개 이상 수정해주세요.");
						System.out.print("주문자명 : ");
						String buyer = scan.nextLine();
						System.out.print("주소 : ");
						String buyAdr = scan.nextLine();
						System.out.print("품목명 : ");
						String reqName = scan.nextLine();
						System.out.print("수량 : ");
						String reqCnt = scan.nextLine();
						bs.updateBoard(buyer, buyAdr, reqName, reqCnt);
					} else if ("4".equals(cmd)) {
						System.out.println("삭제할 주문건의 주문자명 혹은" +
								"품목명을 입력해주세요.");
						System.out.print("주문자명 : ");
						String buyer = scan.nextLine();
						System.out.print("품목명 : ");
						String reqName = scan.nextLine();
						bs.deleteBoard(buyer, reqName);
					}
					}while(!"q".equals(cmd));
				} else {
					System.out.println("비밀번호를 다시 확인해주세요.");
				}
			} else {
				System.out.println("ID를 다시 확인해주세요.");
			}
		} while (!"q".equals(cmd));
		System.out.println("안녕히 가세요.");
		DBCon.close();
	}

}
