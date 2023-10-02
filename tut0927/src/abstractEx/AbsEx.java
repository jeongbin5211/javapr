package abstractEx;

// �̸� ���ϰ� ������ ��Ȳ�� �°� ����
// �߻�ȭ, interface => ǥ��ȭ��ų�� ���

abstract class Computer {
	
	abstract void powerOn();
	abstract void powerOff();
	
	void timeCheck() {
		System.out.println("�ð�üũ");
	}
}

abstract class OS {
	// �ü�� ��, ����
	
	abstract void startOS();
	
	abstract void endOS();
	
}

class IBM extends Computer {

	@Override
	void powerOn() {
		System.out.println("IBM ��ǻ�� ����");
	}

	@Override
	void powerOff() {
		System.out.println("IBM ��ǻ�� ����");
	}
	
}

public class AbsEx {

	public static void main(String[] args) {
//		Computer c = new Computer(); // abstract�� ���� ��� �Ұ���
	}

}