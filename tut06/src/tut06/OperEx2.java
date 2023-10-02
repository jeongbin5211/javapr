package tut06;

import java.util.Scanner;

public class OperEx2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int std1 = 80;
		int std2 = 70;
		int avg = 75;
		// AND : 이고, 이면서
		// OR : 이거나, 또는
		// 학생1 점수가 평균점수보다 높고 학생2 점수가 평균보다 높으면
		// 통과, 아니면 재평가
		
//		if(조건) {
//		출력코드(참)
//		}else {
//		출력코드(거짓)
//		}
		
		if (std1 > avg && std2 > avg)
			System.out.println("pass");
		else 
			System.out.println("재평가");
		
		// 학생 점수가 90이상 100이하이면 최우수
		// 80이상 89이하 우수
		// 나머지는 보통
		
		while (true) {
			System.out.print("점수를 입력해 주세요. >> ");
			int score = sc.nextInt();
			System.out.println("");
//			System.out.println(score);
			
			if (score > 100 || score < 0)
				System.out.println("점수를 다시 입력해주세요.");
			else if (score >= 90)
				System.out.println("최우수");
			else if (score >= 80)
				System.out.println("우수");
			else
				System.out.println("보통");
		}
		
		
	}
		


}
