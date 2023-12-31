package inheritance;

class Add {
	String title = "계산기 프로그램";
	
	void turnOn() {
		System.out.println("전원을 켭니다.");
	}
	
	void turnOff() {
		System.out.println("전원을 끕니다.");
	}
	
	// 정수 + 정수 = 정수
	
	int add(int num1, int num2) {
		return num1 + num2;
	}
	
}

class DeskTop extends Add {
	void Os() {
		System.out.println("Windows Ver 11...");
	}
}

class LapTop extends Add {
	void Os() {
		System.out.println("IOS Ver 16");
	}
}

public class InherEx01 {

	public static void main(String[] args) {
		// 객체 => 상속 => 프로그램 확장(회원가입 -> 게시판 -> 다중게시판 -> 일정관리... 확장)
		// C++ -> 다중상속 -> 상속(자바) : 강제x -> 인터페이스(다중) : 강제성
		// 					강제성 abstract
		//					extends				implements
		
		DeskTop d = new DeskTop();
		System.out.println("데스크탑 컴퓨터");
		System.out.println(d.title);
		d.title = "데스크탑";
		System.out.println(d.title);
		d.turnOn();
		d.Os();
		int result = d.add(100, 200);
		System.out.println(result);
		d.turnOff();

		System.out.println("-----------------------------");
		
		LapTop l = new LapTop();
		System.out.println("랩탑");
		System.out.println(l.title);
		l.turnOn();
		l.Os();
		int result2 = l.add(200, 400);
		System.out.println(result2);
		l.turnOff();
	}

}
