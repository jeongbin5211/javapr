package tut06;

public class PrintEx {

	public static void main(String[] args) {
		// 정수 10을 출력 : 10진수, 8진수, 16진수로 출력
//						  d       o     x
		
		int num = 10;
		int num2 = 10;
		// 출력값은 10입니다.
		// System.out.printf(출력예시, 변수);
		System.out.printf("출력값은 %d입니다.\n", num);
		System.out.println(String.format("출력값은 %d입니다.", num));
		System.out.println("");
		
		// 10을 8진수로 표현한 값은 12입니다.
		System.out.printf("%d을 8진수로 출력한 값은 %o입니다.\n", num, num);
		System.out.println(String.format("%d를 8진수로 출력한 값은 %o입니다.", num, num2));
		
		// 10을 16진수로 표현한 값은 a입니다.
		System.out.printf("%d을 16진수로 출력한 값은 %x입니다.\n", num, num);
		System.out.println(String.format("%d을 16진수로 출력한 값은 %x입니다.", num, num));
		System.out.println("");
		
		// 실수 출력
		double d = 1.2345; // 상수 -> %f
		System.out.printf("실수 값은 %f입니다.\n", d);
		
		// %.xf => 소수점 x자리만큼 출력할 때
		System.out.printf("실수 값은 %.2f입니다.\n", d); // 1.23
		
		// 문자열 출력 %s
		// 부산 코리아아이티 아카데미 입니다.
		String str = "Koreait";
		
		System.out.printf("부산 %s 아카데미 입니다.\n", str);
		
		System.out.println(String.format("부산 %s 아카데미 입니다.", str));
		
		System.out.println("----------------------------------------");
		
		// 타입이 다른 연산 -> 형변환(캐스팅)
		// 메모리 공간이 적은 값을 큰 값에 넣으면 자동 형변환 -> 묵시적 형변환 == 업캐스팅
		// 메모리 공간이 큰 값을 작은 값에 넣으면 강제 형변환 -> 명시적 형변환 == 다운캐스팅
		
		// 정수 + 실수 = 실수
		int num1 = 1;
		double d2 = 0.5;
		
		double add = num1 + d2;
		System.out.println(add); // 1.5
		
		// 정수 + 실수 = 정수 (형변환 필요)
		int add2 = num1 + (int)d2;
		System.out.println(add2); // 1
		
		
		
	}

}
