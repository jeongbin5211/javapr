package tut04;

public class ContEx {

	public static void main(String[] args) {
		// if
		// �񱳿����� > < , ����� true, false
		int num1 = 3;
		int num2 = 5;
		
//		if (����) {
//			������ ���ϰ�� ���๮
//		} else {
//			������ ������ ��� ���๮
//		}
		
		if (num1 > num2) {
			System.out.println("�α���");
			System.out.println("�ý����� �����մϴ�.");
		} else {
			System.out.println("�α׾ƿ�");
			System.out.println("�ý����� �����մϴ�.");
		}
		
		// �� �ڵ带 �����丵 (����ȭ)
		if (num1 > num2) 
			System.out.println("�α���");

		else 
			System.out.println("�α׾ƿ�");
		
		System.out.println("�ý����� �����մϴ�.");
		
		// ����� Level 0�̸�(�մ�), 1�̸�(ȸ��), 2�̸�(������) ���
		// else if ���
		int level = 1;
		
		if (level == 1) {
			System.out.println("guest�� �α��� �ϼ̽��ϴ�.");
			System.out.println("�����ڰ� ���� �� ����Ʈ �̿��� �����մϴ�.");
		}else if (level == 2) {
			System.out.println("ȸ������ �α��� �ϼ̽��ϴ�.");
			System.out.println("������������ �̵��մϴ�.");
		}else {
			System.out.println("�����ڷ� �α����ϼ̽��ϴ�.\n������ �������� �̵��մϴ�.");
		}

	}

}
