package tut06;

public class OperEx {

	public static void main(String[] args) {
		int num1 = 5;
		int num2 = 10;
		
		String s1 = "koreait";
		String s2 = "Koreait";
		
		// ��
		System.out.println(num1 > num2);   	// false
		System.out.println(num1 == num2);	// false
		System.out.println(s1.equals(s2));	// false
		System.out.println(!s1.equals(s2));	// true
		
//		A = B (b�� a�� ����)
//		Ÿ�Կ� ����
		
		boolean b = (num1 == num2);
		
		// ���ǹ� : if
//		if (����) {
//			����ڵ�
//		}else {
//			����ڵ�
//		}
		
		// ���α׷����� �ߺ��ǰų� ���ʿ��� ������ ���̷��� �մϴ�.
		
		if (b) // b == (b == true)
			System.out.println("�� ���� ���� �����ϴ�.");
		else
			System.out.println("�� ���� ���� �ٸ��ϴ�.");
		
//		Ÿ�� ���� = (����) ? "���� ��" : "������ ��";
		
		String result = (!b) ? "�� ���� ���� �ٸ��ϴ�." : "�� ���� ���� �����ϴ�.";
		
		// ���� Ȧ��, ¦�� �����ϼ���.
//		Ȧ��,¦�� => ���� % 2 == 1 Ȧ��
		
		int num3 = 3;
		// System.out.println(num3 % 2); // 1
		
		if (num3 % 2 == 1)
			System.out.println("Odd");
		else
			System.out.println("Even");
		
		String result2 = (num3 % 2 == 1) ? "Odd" : "Even";
		System.out.println(result2);
		
		
		
	}

}
