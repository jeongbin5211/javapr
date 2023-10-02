package tut05;

import java.util.Scanner;

public class LoopEx5 {

	public static void main(String[] args) {
		
		// q 를 입력하기 전에는 프로그램 계속실행 (무한루프)
		// q/Q 입력하면 프로그램 종료
		// ui : a 입력하면 더하기, q 종료
		// a를 입력하면 두 정수를 입력 받아 더하기 한 후 출력
		
		Scanner sc = new Scanner(System.in);
		

		
		boolean run = true;
		
		while (run) {
			System.out.println("=====================");
			System.out.println("1. 더하기(a) 2. 종료(q)");
			System.out.println("=====================");
			System.out.print("작업 내용을 입력하세요. >> ");
			String input = sc.next();
//			System.out.println(input); -> 출력 테스트
			
			switch (input) {
			case "a" :
				System.out.print("첫번째 정수를 입력하세요. >> ");
				int num1 = sc.nextInt();
				
				System.out.print("두번째 정수를 입력하세요. >> ");
				int num2 = sc.nextInt();
				
				int result = num1 + num2;
				System.out.println("두 정수의 합은 " + result + "입니다.");
				System.out.println("");
				break;
				
			case "q" :
			case "Q" :
				System.out.println("프로그램을 종료합니다.");
				System.exit(0); // 무한루프를 종료하고 프로그램을 빠져 나옵니다.
				break;
				
			default :
				System.out.println("유효하지 않은 명령어입니다.\n다시 입력해주세요.");
			
			}
			
		}
		
		
		
		
		

	}

}
