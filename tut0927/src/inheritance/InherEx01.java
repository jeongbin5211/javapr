package inheritance;

class Add {
	String title = "���� ���α׷�";
	
	void turnOn() {
		System.out.println("������ �մϴ�.");
	}
	
	void turnOff() {
		System.out.println("������ ���ϴ�.");
	}
	
	// ���� + ���� = ����
	
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
		// ��ü => ��� => ���α׷� Ȯ��(ȸ������ -> �Խ��� -> ���߰Խ��� -> ��������... Ȯ��)
		// C++ -> ���߻�� -> ���(�ڹ�) : ����x -> �������̽�(����) : ������
		// 					������ abstract
		//					extends				implements
		
		DeskTop d = new DeskTop();
		System.out.println("����ũž ��ǻ��");
		System.out.println(d.title);
		d.title = "����ũž";
		System.out.println(d.title);
		d.turnOn();
		d.Os();
		int result = d.add(100, 200);
		System.out.println(result);
		d.turnOff();

		System.out.println("-----------------------------");
		
		LapTop l = new LapTop();
		System.out.println("��ž");
		System.out.println(l.title);
		l.turnOn();
		l.Os();
		int result2 = l.add(200, 400);
		System.out.println(result2);
		l.turnOff();
	}

}