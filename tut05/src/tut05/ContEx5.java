package tut05;

import java.util.Scanner;

public class ContEx5 {

	public static void main(String[] args) {
//		정수를 입력 받아서
//		3 ~ 5 월은 봄입니다.
//		6 ~ 8 월은 여름입니다.
//		9 ~ 11 월은 가을입니다.
//		12 ~ 2 월은 겨울입니다.
		
//		Scanner sc = null;
//		sc = new Scanner(System.in);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력해주세요. >> ");
		
		int input = Integer.parseInt(sc.next());
//		int input = sc.nextInt();
		
//		System.out.println(input); -> 출력 테스트
//		System.out.println(sc.nextInt()); -> 출력 테스트
		
		switch (input) {
		case 3 :
		case 4 :
		case 5 :
			System.out.println(input + "월은 봄입니다.");
			break;
			
		case 6 :
		case 7 :
		case 8 :
			System.out.println(input + "월은 여름입니다.");
			break;
			
		case 9 : 
		case 10 : 
		case 11 :
			System.out.println(input + "월은 가을입니다.");
			break;
			
		case 12 :
		case 1 :
		case 2 :
			System.out.println(input + "월은 겨울입니다.");
			break;
			
		default :
			System.out.println(input + "월은 없습니다. 다시 입력해주세요.");
			
		}

	}

}
