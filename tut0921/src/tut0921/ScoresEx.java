package tut0921;

import java.util.Scanner;

public class ScoresEx {

	public static void main(String[] args) {
		// <출력화면>
		// 1. 학생수 | 2. 점수입력 | 3. 점수출력 | 4. 평균 | 5. 최고점수 | 6. 종료
		// 전역변수, 전역객체 선언
		Scanner sc = new Scanner(System.in);
		boolean run = true;
		int[] scores = null;
		
		int sum = 0;
		
		while(run) {
			System.out.println("1. 등록할 학생수 | 2. 점수입력 | 3. 점수출력 | 4. 평균 | 5. 최고점수 | 6. 종료");
			System.out.print("메뉴를 선택해 주세요. >> ");
			int menu = sc.nextInt();
			
			switch (menu) {
			case 1 :
				
				if (scores == null) {
					System.out.print("\n등록할 학생 수를 입력하세요. >> ");
					int student = sc.nextInt();
					scores = new int[student];
					System.out.println("\n" + scores.length + "명의 학생이 등록되었습니다.\n");
				}
				System.out.println("\n2. 점수입력 메뉴로 이동하세요.\n");
				
				break;
				
			case 2 :
				
				for (int i = 0; i < scores.length; i++) {
					System.out.println((i + 1) + "번째 학생의 점수를 입력해주세요.");
					int score = sc.nextInt();
					scores[i] = score;
					
				}
				System.out.println("\n학생 점수 입력이 완료되었습니다.\n");
				System.out.println("3. 점수출력 메뉴에서 확인하세요.");
				
				break;
				
			case 3 :
				
				System.out.println("\n학생 점수 출력\n");
				System.out.println(scores.length + "명의 학생 점수 출력\n");
				
				for (int i = 0; i < scores.length; i++) {
					System.out.println((i + 1) + "번째 학생의 점수는 "+ scores[i] + "점 입니다.\n");
				}
				
				break;
				
			case 4 :
				System.out.println("\n학생들의 평균점수를 출력합니다.\n");
				for(int i = 0; i < scores.length; i++) {
					sum = sum + scores[i];
				}
				double avg = (double) sum / scores.length;
				System.out.printf("학생들의 평균점수는 %.2f점 입니다.", avg);
				
				break;
				
			case 5 :
				// 최대값, 최소값 구하기 = 비교값
				// 최대값 = 비교값(가장 값이 작은 정수 => 0)
				// 최소값 = 비교값(가장 값이 큰 정수 => 9)
				int max = 0;
				int min = 100;
				
				for (int i = 0; i < scores.length; i++) {
					if (max < scores[i]) {
						max = scores[i];
						
					}
				}
				
				for (int i = 0; i < scores.length; i++) {
					if (min > scores[i]) {
						min = scores[i];
					}
				}
				System.out.println("\n최대값은 " + max + "입니다." );
				System.out.println("최소값은 " + min + "입니다.\n" );
				
				break;
				
			case 6 :
				System.out.println("프로그램 종료");
				System.exit(0);
				break;
				
			default :
				System.out.println("메뉴를 다시 선택하세요.");
				break;
			}
		}
		
		

	}

}
