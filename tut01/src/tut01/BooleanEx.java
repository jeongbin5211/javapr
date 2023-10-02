/* 
1. 프로그램명 : BooleanEx
2. 작 성 일 : 2023.09.08
3. 작 성 자 : 허정빈
4. 내	용 : boolean예제
*/

package tut01;

public class BooleanEx {

	public static void main(String[] args) {
		// 컴퓨터는 0, 1만 읽는다 => false는 0, true는 0을 제외한 양수
		
		// 기본타입의 초기값 설정(임의 값을 무조건 넣어줘야 한다.)
		// ex) int i = 0; double d = 0; boolean b = false String str = "";
		
		boolean b = false;
		
		// 참이면 pass, 아니면 retry
		// A.equals("B") : String값
		// 그 외 같은 걸 비교할 때는 ==
		if (b == true)
			System.out.println("pass");
		else
			System.out.println("retry");
		
		// 삼항연산자로 변환하기
		// (조건) ? "참일 때" : "거짓일 떄";
		String result = (b == true) ? "pass" : "retry";
		System.out.println(result);
		
		// 조건이 참이면 1, 아니면 0 출력
		int i = (b) ? 1 : 0;
		System.out.println(i);
		
		// 조건이 참이면 1.0, 아니면 0.0 출력
		double d = (b) ? 1.0 : 0.0;
		System.out.println(d);
		
		// 조건이 참이면 true, 아니면 false 출력
		boolean b2 = (b) ? true : false;
		System.out.println(b2);
		
		int i2 = 1;
		boolean b3 = (i2 > 10);
		System.out.println(b3); // => false출력
	}

}
