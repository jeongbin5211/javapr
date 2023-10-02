package tut07;

import java.util.Scanner;

public class SwitchEx2 {

	public static void main(String[] args) {
		
		// 대, 소문자 값을 처리
		// char
		// A/a -> 골드회원, B/b -> 실버회원, C/c -> 일반회원, 그 외에는 게스트
		
		Scanner sc = new Scanner(System.in);
		System.out.println("A/a = 골드회원, B/b = 실버회원, C/c = 일반회원");
		System.out.print("회원 등급을 선택해주세요. >> ");
		String grade = sc.next();
		
		switch(grade) {
		case "A" :
		case "a" :
			System.out.println("골드회원입니다.");
			break;
			
		case "B" :
		case "b" :
			System.out.println("실버회원입니다.");
			break;
			
		case "C" :
		case "c" :
			System.out.println("일반회원입니다.");
			break;
			
		default :
			System.out.println("Guest 입니다.");
		}
		
		

	}

}
