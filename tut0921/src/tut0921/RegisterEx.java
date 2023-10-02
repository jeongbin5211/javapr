package tut0921;

import java.util.Scanner;

public class RegisterEx {

	public static void main(String[] args) {
		// 필드에 직접 값 입력
//		Register[] r = new Register[3];
//		
//		r[0] = new Register(); // 초기화
//		
//		r[0].setEmail("email");
//		r[0].setUserpw("123");
//		r[0].setUsername("jeong bin");
//		
//		System.out.println(r[0].getEmail());
//		System.out.println(r[0].getUserpw());
//		System.out.println(r[0].getUsername());
		
		// 생성자에 직접 값 입력
//		Register r = new Register("email.com", "1234", "name");
//		
//		System.out.println(r.getEmail()); // email.com
//		
//		r.setEmail("naver.com");
//		
//		System.out.println(r.getEmail()); // naver.com
		
		// Scanner를 이용해서 배열 생성 : 3
		// 입력 Scanner
		// for
		
		Scanner sc = new Scanner(System.in);
		System.out.print("가입할 회원 수 >> ");
		int count = sc.nextInt();
		
		Register[] r = new Register[count]; // count수만큼 저장할 배열 생성
		
		for (int i = 0; i < r.length; i++) {
			System.out.print("이메일 >> ");
			String email = sc.next();
			
			System.out.print("비밀번호 >> ");
			String userpw = sc.next();

			System.out.print("이름 >> ");
			String username = sc.next();
			
			r[i] = new Register(email, userpw, username); // 초기화
			
			System.out.println((i + 1) + "번째 회원이 등록되었습니다.");
			
		}
		System.out.println("회원가입이 완료되었습니다.");
		
		System.out.println("\n-----" + r.length + "명 회원출력-----");
		
		// 향상된 for
		
		for (Register reg : r) {
			System.out.println(reg.disp());
		}
		
		
	}

}
