package lamda;

interface MyLambda {
	void disp();
}

public class LambdaEx {

	public static void main(String[] args) {
		
		MyLambda m = () -> {
			System.out.println("�����Դϴ�.");
		};
		
		m.disp();
		
		System.out.println("---------------------");
		
		MyLambda m2 = () -> {
			System.out.println("���� 2 �Դϴ�.");
		};

		m2.disp();
		
		System.out.println("---------------------");
		
		MyLambda m3 = () -> {
			String str = "���� 3 �Դϴ�.";
			System.out.println(str);
		};
		
		m3.disp();
	}

}
