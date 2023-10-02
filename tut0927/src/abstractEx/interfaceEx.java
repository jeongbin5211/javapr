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
		System.out.println("���� �ü�� ����");
	}

	@Override
	public void powerOn() {
		System.out.println("������ �մϴ�.");
	}

	@Override
	public void powerOff() {
		System.out.println("������ ���ϴ�.");
		
	}
	
}



public class interfaceEx {

	public static void main(String[] args) {
		// ����, �ü�� ���� ���� ���� ��� ó��
		// abstract ��� - �������̵�
		
		// interface -> implements : ����� �޾� ����
		
		Mac m = new Mac();
		
		m.powerOn();
		m.appleOS();
		m.powerOff();
		

	}

}