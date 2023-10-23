package 프로그래밍언어응용;

import java.util.Scanner;

public class Ex3_jumin {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("주민등록번호를 입력하세요.(000000-0000000) >> ");
		String str = sc.nextLine();
		char gender = str.charAt(7);
		
		if (gender % 2 == 0) 
			System.out.println("여자입니다.");
		else
		System.out.println("남자입니다.");
		
		
	}

}
