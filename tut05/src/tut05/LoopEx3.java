package tut05;

public class LoopEx3 {

	public static void main(String[] args) {
		// 도끼로 나무를 100번까지 찍는 for문
		// 도끼를 20번째 찍으면 "나무가 쓰러집니다." 라는 메시지 출력 후 프로그램 종료

		for (int hit = 0; hit <= 100; hit++) {
			System.out.println("in"); // 구동 순서 확인용으로 출력
			if (hit > 20) {
				System.out.println("나무가 쓰러집니다.");
				break; // for 문을 벗어남 -> for문 밖에 프로그램 종료 작성
			}
			System.out.println(hit + "hit");
		}
		System.out.println("프로그램 종료");
//		System.exit(0);
		
		System.out.println("--------------");
		
		// 위 예제를 while문으로 출력
		
		int hit = 0;
		while (hit < 101) {
			System.out.println("first");
			if (hit > 20) {
				System.out.println("나무가 쓰러집니다.");
				break;
			}
			System.out.println(hit + "hit");
			hit++;
		}
		System.out.println("프로그램 종료");
		System.exit(0);
	}

}
