package study190301;

import java.util.Scanner;

import study190302.BoardService;

public class View {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String cmd = "";
		do {
			System.out.println("===============================================");
			System.out.println(" 환영합니다. ");
			System.out.println(" 아이디를 입력해주세요. ");
			System.out.println("===============================================");
			System.out.print("아이디 : ");
			String id = scan.nextLine();
			if ("CHORONG".equals(id)) {
				System.out.print("비밀번호 : ");
				String pwd = scan.nextLine();
				if ("DLTGLD23".equals(pwd)) {
					do {
						DBCon.getCon();
						System.out.println(" 환영합니다 CHORONG님 ");
						System.out.println("1. 게시물 등록");
						System.out.println("2. 게시물 조회");
						System.out.println("3. 게시물 수정");
						System.out.println("4. 게시물 삭제");
						System.out.println("q. 종료");
						System.out.println(" 원하시는 번호를 눌러주세요. ");
						System.out.print("번호 : ");
						cmd = scan.nextLine();
						BoardService bs = new BoardService();
						if ("1".equals(cmd)) {
							System.out.print("제목 : ");
							String title = scan.nextLine();
							System.out.print("내용 : ");
							String content = scan.nextLine();
							bs.insertBoard(title, content);
						} else if ("2".equals(cmd)) {
							bs.selectBoard();
						} else if ("3".equals(cmd)) {
							System.out.println("수정할 게시글 번호를 입력해주세요.");
							System.out.print("번호 : ");
							String str = scan.nextLine();
							int num = Integer.parseInt(str);
							System.out.print("수정 제목 : ");
							String title = scan.nextLine();
							System.out.print("수정 내용 : ");
							String content = scan.nextLine();
							bs.updateBoard(title, content, num);
						} else if ("4".equals(cmd)) {
							System.out.println("삭제할 게시글 번호를 입력해주세요.");
							System.out.print("번호 : ");
							String str = scan.nextLine();
							int num = Integer.parseInt(str);
							bs.deleteBoard(num);
						}
					} while (!"q".equals(cmd));
				} else {
					System.out.println(" 비밀번호를 다시 확인해주세요. ");
				}
			} else {
				System.out.println(" 아이디를 다시 확인해주세요. ");
			}
		} while (!"q".equals(cmd));
		System.out.println(" 안녕히가세요. ");
		scan.close();
		DBCon.close();
	}
}
