package tut03;

public class StringEx {

	public static void main(String[] args) {
		// �⺻Ÿ�� koreait ���ڿ� ����
		// ��üŸ�� koreait ���ڿ� ����
		// ���� ���ϴ� ����
		String str = "koreait"; // stack �޸𸮿� �����
		String str2 = new String("koreait"); // heap �޸𸮿� �����
		
		// .equals �� ���ϱ�
		
		boolean result = str.equals(str2);
		System.out.println(result); // true
		
		if (str.equals(str2)) {
			System.out.println("������ġ�� �ٸ����� ���� �����մϴ�.");
		}
		
		// == �����ڸ� ���� �޸� �ּҰ� ��
		if (str == str2) {
			System.out.println("����� �޸� �ּҰ� �����ϴ�.");
		}else {
			System.out.println("������ġ�� �ٸ��ϴ�.");
		}
		
		boolean result2 = (str == str2);
		System.out.println(result2); // false
		
		//** ���ڿ��� �����ϸ� �񱳴� == �����ڸ� ����ϸ� �ȴ�.
		
		int num1 = 1;
		int num2 = 2;
		
//		num1.equals(num2); -> �߸��� ����Դϴ�.
		boolean result3 = (num1 == num2); // false
		
//		public boolean resultCheck() {
//			return (num1 == num2);
//		}
		
		
		
	}

}
