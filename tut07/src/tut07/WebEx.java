package tut07;

public class WebEx {
	
	// �޼ҵ��̸�(�ҹ���, ī��ǥ��� ���) : welcome, void(sysout����ϱ� ���� ���)
	// ���������� void �޼ҵ��() {
	//    System.out.println("");
	// }
	
	public void welcome() {
		System.out.println("�ڸ��ƾ���Ƽ ��ī���� �� ����Ʈ�� ���� ���� ȯ���մϴ�.");
	}

	public static void main(String[] args) {
		// �ڸ��ƾ���Ƽ ��ī���� �� ����Ʈ�� ���� ���� ȯ���մϴ�.
		// �ڸ��ƾ���Ƽ ��ī���� �� ����Ʈ�� ���� ���� ȯ���մϴ�.
		
		WebEx web = new WebEx();
		
		web.welcome();
		web.welcome();

	}

}
