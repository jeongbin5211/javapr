package tut05;

public class LoopEx {

	public static void main(String[] args) {
		// 1. for �� �⺻�� 0 ~ 4���� ����ϴ� �ݺ��� �ۼ�
		
//		for (�ʱⰪ; ����; ������) {
//			����ڵ�
//		}
		
//		���� ���� : �ʱⰪ -> ���� -> ����ڵ� -> ������
		
		for (int i = 0; i <= 4; i++) {
			System.out.println(i);
		}
		
		// 0���� 100�̸� ���� ����ϴ� for�� �ۼ�
		for (int i = 0; i < 100; i++) {
			System.out.println(i);
		}
		
		// 1���� 10���ϱ��� ����ϴ� for�� �ۼ�
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
		
		// 2. while���� for�� ��
		
		// 0 ~ 10 �̸� ����ϴ� for��
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}
		
		System.out.println("------------------------");
		
		// 0 ~ 10 �̸� ����ϴ� while��
		
//		�ʱⰪ;
//		while (����) {
//			����ڵ�;
//			������;
//		}
		
		int i = 0;
		
		while (i < 10) {
			System.out.println(i);
			i++;
		}
		
		System.out.println("------------------------");
		
		// 10 ���� ���� 1���� ����ϴ� for��
		
		for (int j = 10; j > 0; j--) {
			System.out.println(j);
		}

		System.out.println("------------------------");
		
		// 0 ~ 10 ¦�� ����ϱ� for ��
		
		for (int j = 2; j <= 10; j += 2) {
			System.out.println(j);
		}
	}

}
