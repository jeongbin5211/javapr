package tut07;

public class IfEx {

	public static void main(String[] args) {
		
		int num; // ������ ���� -> �޸� ���� -> ���� ���� -> �ʱ�ȭ
		num = 0;
		
		int[] arr; // ��ü(�迭) ����
		arr = new int[3]; // �迭 �ʱ�ȭ
		
		int[] arr2 = new int[4];
		
		System.out.println(num);
		System.out.println(arr);
		System.out.println(arr2);
		
		// ������ ����(����) ����
		// ������ 90���� ũ�� A����
		// 80���� ũ�� B����
		
		int score = 90;
		
		if (score >= 90) {
			System.out.println("100�� ���ٴ� �����ϴ�.");
			System.out.println("A���� �Դϴ�.");
		}else {
			System.out.println("100�� ���ٴ� �����ϴ�.");
			System.out.println("B���� �Դϴ�.");
		}
		
		// ����ڵ尡 �� �� �̻��� �� {}�ʼ�
	}

}
