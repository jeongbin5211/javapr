package tut07;

public class LoopEx {

	public static void main(String[] args) {
		
		// ���� �������� 0�ε� 0�� ��� ���� ��
		
		for (int i = 0; i < 0; i++) {
			System.out.println(i);
		}

		System.out.println("------------------------");
		
		int n = 0;
		while (n < 0) {
			System.out.println("���Ȯ��");
		}
		
		System.out.println("------------------------");
		
		int k = 0;
		
		do {
			System.out.println("������ Ʋ���� �ѹ��� ��µ˴ϴ�.");
		}while (k < 0);
	}

}
