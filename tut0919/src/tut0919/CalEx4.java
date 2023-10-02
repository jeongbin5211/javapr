package tut0919;

// 3. class 하나 더 만들기

class Cal {
	public boolean isOdd(int a) {
		return (a % 2 == 1) ? true : false;
	}
}

public class CalEx4 {

	public boolean isOdd(int a) {
		// 첫번째 방법
//		if (a % 2 == 1) {
//			return true;
//		}else {
//			return false;
//		}
		
		boolean isOdd = (a % 2 == 1) ? true : false;
		return isOdd;
	}
	
	public static void main(String[] args) {
		// 정수를 이용하여 홀수면 true, 짝수면 false를 출력하세요.

		CalEx4 cal4 = new CalEx4();
		cal4.isOdd(3);
		System.out.println(cal4.isOdd(3)); // true
		
		// 3. 다른 클래스에서 메소드 가져오기
		
		Cal c = new Cal();
		c.isOdd(5);
		System.out.println(c.isOdd(5)); // true
		
		// 4. Cal2.java 에서 객체 가져오기
		Cal2 c2 = new Cal2();
		c2.isEven(2);
		
		System.out.println(c2.isEven(2)); // true
		
		
	}

}
