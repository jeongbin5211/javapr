/* 
1. 프로그램명 : DoubleEx
2. 작 성 일 : 2023.09.08
3. 작 성 자 : 허정빈
4. 내	용 : 실수에 대해 학습하기
*/

package tut01;

public class DoubleEx {

	public static void main(String[] args) {// 단축키 main
		// 실수를 저장하는 변수 -> 값을 지정하지 않았을 때 -> 기본값 0.0설정
		// 값을 1.0으로 바꿀 때
		double d = 0.0;
		d = 1.0;
		System.out.println(d);
		
		// d2 추가하고 d와 d2 더하기
		double d2 = 2.0;
		System.out.println(d + d2);
		
		// 소수점을 없애고 싶을 때는 타입변환
		// (바꿀타입)변수명
		
		double d3, d4;
		d3 = 1.214124;
		d4 = 3.234324;
		
		System.out.println("total" + ":" + " " + (int)(d3 + d4) + "$");
		
		// 연산자 우선순위
		// 특별히 지정하지 않으면 가까운 쪽 먼저 처리
		// ()소괄호가 우선순위가 가장 높음
		
		
		// % : 몫이 아니고 나머지를 의미합니다.
		System.out.println(3 % 2); // 1
		System.out.println(3 % 4); // 3

		// 0012345-1234567 주민번호의 8번째 숫자를 이용하여 남자 여자를 표시하세요.
		// 단 %, if 사용
		
		// 1이면 남자 2면 여자 표시
		int jumin = 2;
		
		if (jumin % 2 == 1) {
			System.out.println("Male");
		} else
			System.out.println("Female");
		
		// 삼항연산자 : (조건) ? "참일 때" : "거짓일 때";
		String result = (jumin % 2 == 1) ? "Male" : "Female";
		System.out.println(result);
	}

}
