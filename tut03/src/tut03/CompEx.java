package tut03;

public class CompEx {

	public static void main(String[] args) {
		// ����� true, false
		// 1. ũ��� : >= , <=, >, <
		int num1 = 3;
		int num2 = 5;
		boolean result1 = (num1 >= num2);
		
		System.out.println(result1); // false
		
		
		// 2. ��� : ==, !=  
		boolean result2 = (num1 == num2);
		System.out.println(result2); // false
		
		boolean result3 = (num1 != num2);
		System.out.println(result3); // true
		
		// 3. ������ : �޸��ּҸ� ��
		// new Ű����(�ڹٿ��� ����ϴ� ����)�� ����ϸ� �ٸ� �޸𸮿� ����
		// ()�� ������ Ű������ ����
		// ���ڿ� : ����Ÿ������ ����
		
		String s1 = new String("Hello");
		String s2 = new String("Hello");
		
		// ���ڿ� ��(equals) => ������ �Ȱ�����
		boolean result4 = s1.equals(s2);
		System.out.println(result4); // true
		
		// �޸� �ּ� ��(==)
		boolean result5 = (s1 == s2);
		System.out.println(result5); // false

	}

}
