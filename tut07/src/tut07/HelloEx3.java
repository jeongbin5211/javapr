package tut07;

public class HelloEx3 {

	// ���������� ����Ÿ�� �޼ҵ�(�Ű�����) { // �̰͸����δ� ȭ����� �ȵ�
	// 	  return;
	// }
	
	public String title(String local) {
		return local + " �ڸ��ƾ���Ƽ ��ī����";
	}
	
	public static void main(String[] args) {
		
		// �ڸ��ƾ���Ƽ ��ī����
		// ��ȭ��ȣ, �ּ�
		// �ڸ��ƾ���Ƽ ��ī���� 
		
		// Ŭ�����ȿ� �޼ҵ带 ������������ �ۼ�
		HelloEx3 he = new HelloEx3();
//		he.title(); // ��¾ȵ�
		
		// ����Ϸ���
		System.out.println(he.title("�λ�")); // �λ� �ڸ��ƾ���Ƽ ��ī����
		
		// ����� ����
		System.out.println(he.title("����")); // ���� �ڸ��ƾ���Ƽ ��ī����
		
		// ���ַ� ����
		System.out.println(he.title("����")); // ���� �ڸ��ƾ���Ƽ ��ī����

	}

}
