package lamda;

interface MyLambda {
	void disp();
}

public class LambdaEx {

	public static void main(String[] args) {
		
		MyLambda m = () -> {
			System.out.println("람다입니다.");
		};
		
		m.disp();
		
		System.out.println("---------------------");
		
		MyLambda m2 = () -> {
			System.out.println("람다 2 입니다.");
		};

		m2.disp();
		
		System.out.println("---------------------");
		
		MyLambda m3 = () -> {
			String str = "람다 3 입니다.";
			System.out.println(str);
		};
		
		m3.disp();
	}

}
