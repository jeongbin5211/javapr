package tut06;

public class ScopeEx {

	public static void main(String[] args) {
		// ������ ��ġ�� ���� {}
		
		int num = 10; // ��������
		
		{
			int num2 = 5; // ��������
			num = num + 1;
			System.out.println(num); // 11
		}

		System.out.println(num); // 11
//		System.out.println(num2); // num2�� ���������� ����� �Ұ���
		
		int num3 = 10; // ��������
		
		for (int i = 0; i < 10; i++) {
			System.out.println(num3);
			System.out.println(i);
		}
		
		System.out.println("num3 : " + num3);
//		System.out.println(i); // ��� �Ұ���
		
		int a; // ��������
		for (a = 0; a < 10; a++) {
			System.out.println(a);
			System.out.println(num3);
		}
		System.out.println(a); // a �� ���������� ��� ����
		
		System.out.println("-------------------------------");
		
		// 1 ~ 10���� ���ؼ� ������ ����ϼ���.(�ѹ���)
		// �����Ǵ� ���� ó���Ϸ��� �ݺ��� ���̳� static �޼ҵ带 ����ؾ� �մϴ�.
		
		for (int b = 1; b < 11; b++) {
			int sum = 0;
			sum += b;
			System.out.println(sum);
		}
//		System.out.println(sum); // sum�� ���������� ����� �Ұ���
		
		System.out.println("-------------------------------");
		
		int sum = 0;
		
		for (int b = 1; b < 11; b++) {
			sum += b;
		}
		
		System.out.println(sum); // 55
		
		System.out.println("-------------------------------");
		
		int i = 0;
		while (i < 11) {
			System.out.println(i);
			i++;
		}
		System.out.println(i);
		
//		for(int i = 0; i < 10; i ++) {
//			=> i �� ���� ������ ����Ǿ �����߻�
//		}
		
		System.out.println("-------------------------------");
		
		// ���� ���� �ٷ� �� �߰�ȣ ���������� ���� ���
		// ��, for()���� ������ {} �ȿ����� ���� ����� �� �ִ�.
		
		// ���� ������ ���� ���������� ������ ���·� ����ϰų�
		// ���� �տ� static�� ������ ���
		
		
		
		
	}

}
