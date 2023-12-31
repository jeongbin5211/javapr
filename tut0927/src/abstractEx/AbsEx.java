package abstractEx;

// 이름 정하고 내용은 상황에 맞게 쓰기
// 추상화, interface => 표준화시킬때 사용

abstract class Computer {
	
	abstract void powerOn();
	abstract void powerOff();
	
	void timeCheck() {
		System.out.println("시간체크");
	}
}

abstract class OS {
	// 운영체제 온, 오프
	
	abstract void startOS();
	
	abstract void endOS();
	
}

class IBM extends Computer {

	@Override
	void powerOn() {
		System.out.println("IBM 컴퓨터 시작");
	}

	@Override
	void powerOff() {
		System.out.println("IBM 컴퓨터 종료");
	}
	
}

public class AbsEx {

	public static void main(String[] args) {
//		Computer c = new Computer(); // abstract는 직접 사용 불가능
	}

}
