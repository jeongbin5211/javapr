package tut07;

public class HelloEx {
	
	// �޼ҵ带 ����ϴ� ������ ���������� �����ϱ� �����̴�.
	
			// �Ű������� ���� ���� �ְ� ���� ���� �ִ�.
			// ���������� public, private
			// public(����), private(���� : ĸ��ȭ)
			
			// sysout ���� void, sysout��� ���� �� ���ϴ� Ÿ��
			// ���������� ����Ÿ�� �޼ҵ��(�Ű�����) {
			//    return ������;
			// }
	
	public void display(String title) {
//		System.out.println(title + "��ī����");
		
		// ���ɵ��̸� ����� 
		System.out.println(title + "Academy");
	}
	
	public static void main(String[] args) {
		
		// �޼ҵ带 ������ ������
		// �޼ҵ尡 �ִ� Ŭ�������� ����Ѵ�.
		// Ŭ���� �̸� = new Ŭ������();
		
		HelloEx he = new HelloEx();
		// �Ű��������� ���� ���� ���̰� ���� ���� Ÿ�� ������ �޾ƾ���
		// �޼ҵ带 �������� ó���ϱ� ���ؼ� (���� : ���� �׶��׶� �ٸ��� ó��)
		he.display("�λ�"); // �Ű��������� ������
		
		he.display("����");
		
		}

	

}
