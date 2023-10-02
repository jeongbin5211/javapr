package abstractEx;

interface Boot {
	void powerOn();
	void powerOff();
}

interface OSsystem {
	void msOS();
	void appleOS();
}

class Mac implements Boot, OSsystem {

	@Override
	public void msOS() {
		
	}

	@Override
	public void appleOS() {
		System.out.println("애플 운영체제 시작");
	}

	@Override
	public void powerOn() {
		System.out.println("전원을 켭니다.");
	}

	@Override
	public void powerOff() {
		System.out.println("전원을 끕니다.");
		
	}
	
}



public class interfaceEx {

	public static void main(String[] args) {
		// 부팅, 운영체제 따로 만들어서 다중 상속 처리
		// abstract 상속 - 오버라이드
		
		// interface -> implements : 상속을 받아 구현
		
		Mac m = new Mac();
		
		m.powerOn();
		m.appleOS();
		m.powerOff();
		

	}

}
