package ex2;

import java.util.Scanner;

public class ToUpperCaseEx {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		boolean run = true;
		
		System.out.println("---------------------------");
		System.out.println("소문자를 대문자로 변환하는 프로그램");
		System.out.println("---------------------------\n");
		
		do {
			System.out.println("=================================");
			System.out.println("1. 소문자를 대문자로 변환하기 | 2. 종료");
			System.out.println("=================================");
			System.out.print("메뉴를 선택해주세요. >> ");
			int menu = sc.nextInt();
			
			switch (menu) {
			case 1 :
				System.out.print("변환하실 영문 소문자를 입력하세요. >> ");
				String str = sc.next();
				String upper = str.toUpperCase();
				System.out.println(upper);
				break;
				
			case 2 : 
				System.out.println("프로그램을 종료합니다.");
				System.exit(0);
				break;
				
			default :
				System.out.println("메뉴를 다시 선택해주세요.");
			}
			
			
		} while (run);
		
		
		
	}

}
