package tut0919;

public class CalEx {

	// 2.
	
	// �Ű����� ������ ����
	
//	���������� ����Ÿ�� �޼ҵ��(�Ű�����) {
//		
//	}
	
	public void disp(String local) {
//		System.out.println("�ڸ��ƾ���Ƽ ����");
		// ���⸦ ����� �ٲٰ� �����̸� ������
//		System.out.println("�λ� �ڸ��ƾ���Ƽ Calculator");
		
		System.out.println(local + "�ڸ��ƾ���Ƽ Calculator");
	}
	
	// 3. ���α׷� ����޼ҵ�
	
	public void close() {
		System.out.println("���α׷��� �����մϴ�.");
	}
	
	public static void main(String[] args) {
		
		// 1.
		
		// ���� ���ɼ��� �׻� ����ؾ� �մϴ�.
		// �ݺ� ���� �޼ҵ� ���
		
		// �ڸ��ƾ���Ƽ ����
		// ���� + ���� = ����� ����ϴ� ���α׷�
		// ���α׷�����
		
		// 4.
		CalEx c = new CalEx();
//		c.disp();
//		c.close();
		
		// 5. �Ű����� �̿�
		c.disp("�λ�");
		c.close();
	}

}
