package tut06;

public class PrintEx {

	public static void main(String[] args) {
		// ���� 10�� ��� : 10����, 8����, 16������ ���
//						  d       o     x
		
		int num = 10;
		int num2 = 10;
		// ��°��� 10�Դϴ�.
		// System.out.printf(��¿���, ����);
		System.out.printf("��°��� %d�Դϴ�.\n", num);
		System.out.println(String.format("��°��� %d�Դϴ�.", num));
		System.out.println("");
		
		// 10�� 8������ ǥ���� ���� 12�Դϴ�.
		System.out.printf("%d�� 8������ ����� ���� %o�Դϴ�.\n", num, num);
		System.out.println(String.format("%d�� 8������ ����� ���� %o�Դϴ�.", num, num2));
		
		// 10�� 16������ ǥ���� ���� a�Դϴ�.
		System.out.printf("%d�� 16������ ����� ���� %x�Դϴ�.\n", num, num);
		System.out.println(String.format("%d�� 16������ ����� ���� %x�Դϴ�.", num, num));
		System.out.println("");
		
		// �Ǽ� ���
		double d = 1.2345; // ��� -> %f
		System.out.printf("�Ǽ� ���� %f�Դϴ�.\n", d);
		
		// %.xf => �Ҽ��� x�ڸ���ŭ ����� ��
		System.out.printf("�Ǽ� ���� %.2f�Դϴ�.\n", d); // 1.23
		
		// ���ڿ� ��� %s
		// �λ� �ڸ��ƾ���Ƽ ��ī���� �Դϴ�.
		String str = "Koreait";
		
		System.out.printf("�λ� %s ��ī���� �Դϴ�.\n", str);
		
		System.out.println(String.format("�λ� %s ��ī���� �Դϴ�.", str));
		
		System.out.println("----------------------------------------");
		
		// Ÿ���� �ٸ� ���� -> ����ȯ(ĳ����)
		// �޸� ������ ���� ���� ū ���� ������ �ڵ� ����ȯ -> ������ ����ȯ == ��ĳ����
		// �޸� ������ ū ���� ���� ���� ������ ���� ����ȯ -> ����� ����ȯ == �ٿ�ĳ����
		
		// ���� + �Ǽ� = �Ǽ�
		int num1 = 1;
		double d2 = 0.5;
		
		double add = num1 + d2;
		System.out.println(add); // 1.5
		
		// ���� + �Ǽ� = ���� (����ȯ �ʿ�)
		int add2 = num1 + (int)d2;
		System.out.println(add2); // 1
		
		
		
	}

}
