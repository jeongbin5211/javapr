package lamda;

interface Cals {
	void dispNum(int num);
}

public class LambdaEx2 {

	public static void main(String[] args) {
		
		Cals c = (num) -> {
			System.out.println(num);
		};
		
		c.dispNum(5);

		System.out.println("-----------곱하기 * 10 --------------");
		
		Cals c2 = (x) -> {
			System.out.println(x * 10);
		};
		
		c2.dispNum(10);
		
		System.out.println("-----------더하기 + 10 --------------");
		
		Cals c3 = (y) -> {
			int sum = y + 10;
			System.out.println(sum);
		};
		
		c3.dispNum(15);
		
	}

}
