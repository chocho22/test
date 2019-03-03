package study190303;

import java.util.Scanner;

public class View {
	public static void main(String[] args) {
		String num = null;
		do {
			System.out.println("================================================");
			System.out.println(" 환영합니다. 로그인을 해주세요. ");
			System.out.println("================================================");
			Scanner scan = new Scanner(System.in);
			System.out.print("ID : ");
			String id = scan.nextLine();
			if ("CHORONG".equals(id)) {
				System.out.print("PASSWORD : ");
				String pwd = scan.nextLine();
				if ("DLTGLD23".equals(pwd)) {
					do {
						System.out.println(" CHORONG님 안녕하세요~~ ");
						System.out.println(" 원하시는 번호를 선택해주세요. ");
						System.out.println("1. 게시글 조회");
						System.out.println("2. 게시글 등록");
						System.out.println("3. 게시글 수정");
						System.out.println("4. 게시글 삭제");
						System.out.println("q. 종료");
						num = scan.nextLine();
						BoardService bs = new BoardService();
						if ("1".equals(num)) {
							System.out.println(bs.selectBoard());
						} else if ("2".equals(num)) {
							System.out.println(" 제목과 내용을 입력해주세요. ");
							System.out.print(" 제목 : ");
							String title = scan.nextLine();
							System.out.print(" 내용 : ");
							String content = scan.nextLine();
							bs.insertBoard(title, content);
						} else if ("3".equals(num)) {
							System.out.println(" 수정할 게시글 번호를 입력해주세요. ");
							System.out.print(" 게시글 번호 : ");
							String strNum = scan.nextLine();
							System.out.print(" 수정 제목 : ");
							String title = scan.nextLine();
							System.out.print(" 수정 내용 : ");
							String content = scan.nextLine();
							bs.updateBoard(strNum, title, content);
						} else if ("4".equals(num)) {
							System.out.println(" 삭제할 게시글 번호를 입력해주세요. ");
							System.out.print(" 게시글 번호 : ");
							String strNum = scan.nextLine();
							bs.deleteBoard(strNum);
						}
					} while (!"q".equals(num));
				} else {
					System.out.println(" 비밀번호를 다시 확인해주세요. ");
				}
			} else {
				System.out.println(" 아이디를 다시 확인해주세요. ");
			}
		} while (!"q".equals(num));
		System.out.println(" 안녕히 가세요. ");
		DBCon.close();

	}
}
