package polymorphism;

class Os {
	void run() {
		System.out.println("운영체제를 시작합니다.");
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
	// 부모(os)는 자식(linux, apple, ms) 다 포함(담을) 수 있다.
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
