package tut0920;

public class ArrEx01 {

	public static void main(String[] args) {
		// 배열은 반복문과 같이 사용합니다.
		// (for - 배열번호가 필요할 때, 향상된 for - 배열번호 필요없이 값만 필요할 때)
//		for (int i = 0; i < 배열명.length; i++) {
//			출력코드(별명);
//		}
		
		// 향상된 for
//		for(출력타입 별명 : 배열명) {
//			출력코드(별명);
//		}
		
		// 배열번호(index)는 0부터 시작
		// 변수이름중 i, idx, index 가 있다면 배열을 처리
		
		// 정수 100개를 저장하는 프로그램을 완성하세요.
		
//		데이터타입 변수명 = new 데이터타입;
		
//		int[] values = new int[100]; // 4byte짜리 빈 공간이 100개 생성됨 -> 초기화가 아닙니다.
		
		// 생성자 : 초기화
//		Member m = new Menber(); // 초기화 된것입니다.
		
		int[] value = new int[3]; // 아직 초기화 안됨
		value[0] = 100; // 초기화
		value[1] = 200; // 초기화
		value[2] = 300; // 초기화
		
		// 배열 0 ~ 2번까지 출력하세요.
		
		System.out.println(value[0]); // 100
		System.out.println(value[1]); // 200
		System.out.println(value[2]); // 300
		
		System.out.println("-------------------------------");
		
		// 배열 0 ~ 2번까지 출력하세요.
		// 배열명[index]
		// for사용
		
		for (int i = 0; i < value.length; i++) {
			System.out.println("value[" + i + "] = " + value[i]);
		}
		
		System.out.println("-------------------------------");
		
		// value[0]의 값은 0입니다. 출력하기
		
		for (int i = 0; i < value.length; i++) {
			System.out.println("value[" + i + "]의 값은 " + value[i] + "입니다.");
		}
		
		System.out.println("-------------------------------");
		
		// 1번 값은 100입니다. 출력하기
		
		for (int i = 0; i < value.length; i++) {
			System.out.println(i + "번 값은 " + value[i] + "입니다.");
		}

//		int[] num = {1, 2, 3, 4, 5}; // 값을 직접 입력해서 넣는 경우입니다.
		// 초기값을 설정하면 자동으로 배열 개수가 생성됩니다.
		
		// 학생 3명 점수를 초기값으로 설정 후 화면에 출력하세요.
		// 합계 출력
		// 평균 출력
		
		System.out.println("\n화면에 출력하기\n");
		int[] scores = {20, 70, 80};
		for (int i = 0; i < scores.length; i++) {
			System.out.println(scores[i]);
		}
		
		System.out.println("-------------------------------");
		
		int sum = 0;
		for (int i = 0; i < scores.length; i++) {
			sum = sum + scores[i];
		}
		System.out.println(sum);
		
		System.out.println("-------------------------------");
		
		System.out.println("점수 평균 출력");
		
		// 합계 / 배열길이 = 평균
		
		// 먼저 실수 가능성을 확인하기
		double avg = (double)(sum / scores.length);
		System.out.println(String.format("%.2f", avg)); // 56.00;
		System.out.printf("평균은 %.2f 입니다.\n", avg);
	}

}
