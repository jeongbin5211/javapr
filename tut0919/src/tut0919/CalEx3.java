package tut0919;

public class CalEx3 {

	public boolean isCheck(int a, int b) {
		
		// 1. if문 사용
//		if (a + b > 200) 
//			return true;
//		else 
//			return false;
		
		// 2. 삼항연산자
		return (a + b) > 200 ? true : false;
	}
	
	public static void main(String[] args) {
		// 100 + 100의 결과가 200보다 크면 true를 출력하세요.
		
		CalEx3 cal3 = new CalEx3();
		
		// 1. 스스로 해보기
		cal3.isCheck(200, 100);
		System.out.println(cal3.isCheck(200, 100)); // true
		
		// 2. 
		cal3.isCheck(100, 100);
		System.out.println(cal3.isCheck(100, 100)); // false
		

	}

}
