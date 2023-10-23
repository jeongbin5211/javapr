package singleton;

class SingletonTest {
	
	// ������
//	public SingletonTest() {}
	
	// �̱��� ������
	private SingletonTest() {
		
	}
	
	private static SingletonTest st = new SingletonTest();
	
	public static SingletonTest getInstance() {
		return st;
	}
	
	public void Hello() {
		System.out.println("hello");
	}
}

public class SingletonEx01 {

	public static void main(String[] args) {
		// �����ڸ� ȣ���ϸ� ȣ���ϴ� ���� ��ü
		
		// A
//		SingletonTest st1 = new SingletonTest();
//		
//		// B
//		SingletonTest st2 = new SingletonTest();
//		
//		System.out.println(st1);
//		System.out.println(st2);
//		
//		System.out.println(st1 == st2); // �ּ� �� false
		
		SingletonTest st3 = SingletonTest.getInstance();
		
		SingletonTest st4 = SingletonTest.getInstance();
		
		System.out.println(st3 == st4);
		
		st3.Hello();
		
		

	}

}
