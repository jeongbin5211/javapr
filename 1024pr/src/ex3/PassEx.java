package ex3;

import java.util.Scanner;

public class PassEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("===============");
		System.out.println("성적 관리 프로그램");
		System.out.println("===============");
		
		
		boolean run = true;
		
		while(run) {
			System.out.print("\n점수를 입력해주세요. >> ");
			int score = sc.nextInt();
			System.out.println("");
			
			if (score >= 60) {
				System.out.println("pass");
			}else {
				System.out.println("NonPass");
			}
		}

	}

}
