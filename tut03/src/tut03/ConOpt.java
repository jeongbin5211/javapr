package tut03;

public class ConOpt {

	public static void main(String[] args) {
		// ���׿�����
		// ���� �� ���� ���Ͽ� ũ�� 1, ������ 0�� ����ϼ���.
		
		int num1 = 10;
		int num2 = 5;
		
		int result = (num1 > num2) ? 1 : 0;
		System.out.println(result); // 1
		
		// ������ ������ ���� �� �������� 1�̸� Ȧ��, 0�̸� ¦���� ����ϼ���.
		int num3 = 13;
		String result2 = (num3 % 2 == 1) ? "Odd" : "Even";
		System.out.println(result2); // Odd
		
		// 2. if�� ���
		if (num3 % 2 == 1)
			System.out.println("Odd");
		else
			System.out.println("Even");
		
		// 3. if�� ��� 2
		String msg = "";
		if (num3 % 2 == 1)
			msg = "Odd";
		else
			msg = "Even";
		System.out.println(msg); // Odd
	}

}
