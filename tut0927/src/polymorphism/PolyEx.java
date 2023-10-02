package polymorphism;

class Os {
	void run() {
		System.out.println("�ü���� �����մϴ�.");
	}
}

class Linux extends Os {

	@Override
	void run() {
		System.out.println("Linux start");
	}
	
}

class Apple extends Os {

	@Override
	void run() {
		System.out.println("Apple start");
	}
	
}

class Ms extends Os {

	@Override
	void run() {
		System.out.println("Ms start");
	}
	
}

class OsStart {
	// �θ�(os)�� �ڽ�(linux, apple, ms) �� ����(����) �� �ִ�.
	void start(Os o) {
		o.run();
	}
}

public class PolyEx {

	public static void main(String[] args) {
		Linux linux = new Linux();
		linux.run();
		System.out.println("----------------------");
		
		Apple apple = new Apple();
		apple.run();
		System.out.println("----------------------");
		
		Ms ms = new Ms();
		ms.run();
		System.out.println("----------------------");
		
		OsStart o = new OsStart();
		
		o.start(new Linux());
		
		o.start(new Apple());
		
		o.start(ms);
		
		
	}

}