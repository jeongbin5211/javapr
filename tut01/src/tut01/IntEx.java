/* 
1. 프로그램명 : IntEx
2. 작 성 일 : 2023.09.08
3. 작 성 자 : 허정빈
4. 내	용 : 정수 예제
*/

package tut01;

public class IntEx {

	public static void main(String[] args) {
		// 데이터타입 변수명 = 값;
		// 1. 타입 선언후 나이 20대입하기
		// 2. 20 이상이면 성인, 아니면 미성년자
		
		int age = 20;
		
		if (age >= 20)
			System.out.println("adult");
		else
			System.out.println("Exit");

		// 삼항연산자 : (조건) ? "참일때" : "거짓일 때";
		
		String result = (age >= 20) ? "adult" : "Exit";
		System.out.println(result);
	}

}
