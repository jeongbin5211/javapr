package 프로그래밍언어응용;

import java.util.Scanner;

public class Ex1_PassEx {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("점수를 입력해주세요. >> ");
		int score = sc.nextInt();
		
		if (score >= 60) {
			System.out.println("합격입니다.");
		} else {
			System.out.println("불합격입니다.");
		}
		
	}

}
