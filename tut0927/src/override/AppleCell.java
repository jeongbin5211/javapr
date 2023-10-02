package override;

public class AppleCell extends Cell {

	@Override
	void On() {
		System.out.println("IOS 시작");
	}

	@Override
	void Off() {
		System.out.println("IOS 종료");
	}
	
}
