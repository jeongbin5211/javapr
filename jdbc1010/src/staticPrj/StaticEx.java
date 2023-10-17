package staticPrj;

class Member {
	int price = 10000;
	static double tax = 0.1;
	
	void method() {
		System.out.println("�ν��Ͻ�(new) �޼ҵ�");
	}
	
	static void staticMethod() {
		System.out.println("Static �޼ҵ�");
	}
}

public class StaticEx {

	public static void main(String[] args) {
		// static -> new(�ν��Ͻ�ȭ)�� �� ������ -> Ŭ������.�޼ҵ��();
		
		// �ν��Ͻ�
		Member m = new Member();
		System.out.println(m.price);

		// �ν��Ͻ� x
		System.out.println(m.tax);
		System.out.println(Member.tax);
		
		m.method();
		m.staticMethod();
		Member.staticMethod();
	}

}
