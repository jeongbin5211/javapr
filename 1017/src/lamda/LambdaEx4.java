package lamda;

interface Cals2 {
	int add(int a, int b);
}

public class LambdaEx4 {

	public static void main(String[] args) {
		// 두 변수의 합을 구하는 람다식
		
		Cals2 c2 = (a, b) -> {
			return a + b;
		};
		
		int result = c2.add(10, 10);
		
		System.out.println(result);

	}

}
