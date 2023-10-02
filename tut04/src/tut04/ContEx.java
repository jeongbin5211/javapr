package tut04;

public class ContEx {

	public static void main(String[] args) {
		// if
		// 비교연산자 > < , 결과는 true, false
		int num1 = 3;
		int num2 = 5;
		
//		if (조건) {
//			조건이 참일경우 실행문
//		} else {
//			조건이 거짓인 경우 실행문
//		}
		
		if (num1 > num2) {
			System.out.println("로그인");
			System.out.println("시스템을 종료합니다.");
		} else {
			System.out.println("로그아웃");
			System.out.println("시스템을 종료합니다.");
		}
		
		// 위 코드를 리팩토링 (간략화)
		if (num1 > num2) 
			System.out.println("로그인");

		else 
			System.out.println("로그아웃");
		
		System.out.println("시스템을 종료합니다.");
		
		// 사용자 Level 0이면(손님), 1이면(회원), 2이면(관리자) 출력
		// else if 사용
		int level = 1;
		
		if (level == 1) {
			System.out.println("guest로 로그인 하셨습니다.");
			System.out.println("관리자가 승인 후 사이트 이용이 가능합니다.");
		}else if (level == 2) {
			System.out.println("회원으로 로그인 하셨습니다.");
			System.out.println("메인페이지로 이동합니다.");
		}else {
			System.out.println("관리자로 로그인하셨습니다.\n관리자 페이지로 이동합니다.");
		}

	}

}
