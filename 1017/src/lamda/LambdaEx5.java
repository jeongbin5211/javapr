package lamda;

interface MaxNum {
	int getMaxNum(int a, int b);
}

public class LambdaEx5 {

	public static void main(String[] args) {
		// 두 개의 수중 큰 숫자를 출력하세요.
		// x > y -> return x;
		
		MaxNum mn = (x, y) -> {
			
			if (x > y) {
				return x;
			}else {
				return y;
			}
			
		};
		
		int max = mn.getMaxNum(10, 20);
		
		System.out.println(max);
		
		// 삼항연산자 이용
		
		MaxNum mn2 = (a, b) -> {
			return (a > b) ? a : b;
		};
		
		int max2 = mn2.getMaxNum(5, 10);
		System.out.println(max2);
		
		// 한줄로 만들기 -> return 생략해야함(비추)
		
		MaxNum mn3 = (num1, num2) -> (num1 > num2) ? num1 : num2;
		
		int max3 = mn3.getMaxNum(100, 1000);
		 
		System.out.println(max3); 
	}

}
