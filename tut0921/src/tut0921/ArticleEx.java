package tut0921;

import java.util.Scanner;

public class ArticleEx {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("게시물 개수 >> ");
		int count = sc.nextInt();
		
		Article[] art = new Article[count];
		
		// set입력
		for (int i = 0; i < art.length; i++) {
			art[i] = new Article(); // 초기화
			
			art[i].setNum(i + 1);
			art[i].setSubject(i + 1 + "번째 게시물");
			art[i].setVisit(i + 1);
			
			System.out.println(i + "번째 게시물이 생성되었습니다.");
			
		}
		System.out.println(art.length + "개의 게시물 등록이 완료되었습니다.");
		
		// get 출력
		
//		for (int i = 0; i < art.length; i++) {
//			System.out.println(art[i].getNum());
//			System.out.println(art[i].getSubject());
//			System.out.println(art[i].getVisit());
//			System.out.println(art[i].getRegist());
//		}
		
		// 향상된 for로 get출력
		// 별명에 메소드를 이용해서 출력
		
		for (Article a : art) {
			System.out.println(a.toString());
		}
		
	}

}
