package tut07;

public class LoopEx2 {

	public static void main(String[] args) {
		
		// ���� ������ �� �������� ó�� �Ǵ� static �޼ҵ� ���
		// 1 ~ 100 ���ϱ�
		
//		for (int i = 1; i <= 100; i++) {
//			int sum = 0; // -> ���������� ��� 0���� �ʱ�ȭ��
//			sum += i;
//		}
//		System.out.println(sum); // -> sum�� ���������� for�� �ۿ��� ���Ұ���
		
		int sum = 0;
		
		for (int i = 0; i <= 100; i ++) {
			sum += i;
		}
		System.out.println(sum); // 5050
		
		System.out.println("----------------------------------");
		
		// 1 ~ 100 ���� ���� �� ¦���� �� ���ϱ�
		
		sum = 0;
		
		for (int i = 0; i <= 100; i += 2) {
			sum += i;
		}
		System.out.println(sum); // 2550
		

	}

}
