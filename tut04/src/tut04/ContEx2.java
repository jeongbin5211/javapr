package tut04;

import java.util.Scanner;

public class ContEx2 {

	public static void main(String[] args) {
		/*
		  	학점 91 ~ 100 A등급 
		  	학점 81 ~ 90 B등급 
		  	학점 71 ~ 80 C등급
		 */
		
		int score = 0;
		
		if (score > 100 || score < 0) {
			System.out.println("점수를 다시 입력해주세요.");
		}else if (score >= 91) {
			System.out.println("A");
		}else if (score >= 81) {
			System.out.println("B");
		}else if (score >= 71) {
			System.out.println("C");
		}else {
			System.out.println("F");
		}
		
		// 스캐너
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수를 입력해주세요(숫자 : 0 ~ 100) >> ");
		// 값을 입력 받을 수 있게 sc.next();
		int input = Integer.parseInt(sc.next());
		
//		if (input > 100 || input < 0) {
//			System.out.println("점수를 다시 입력해주세요.");
//		}else if (input >= 91) {
//			System.out.println("A");
//		}else if (input >= 81) {
//			System.out.println("B");
//		}else if (input >= 71) {
//			System.out.println("C");
//		}else {
//			System.out.println("F");
//		}
		
		String str = "";
//		String str = null; -> 둘다 사용 가능
		
		if (input > 100 || input < 0) {
			str = "점수를 다시 입력해주세요.";
		}else if (input >= 91) {
			str = "A";
		}else if (input >= 81) {
			str = "B";
		}else if (input >= 71) {
			str = "C";
		}else {
			str = "F";
		}
		
		System.out.println(str);
		
		
		

	}

}
