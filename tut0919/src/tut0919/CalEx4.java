package tut0919;

// 3. class �ϳ� �� �����

class Cal {
	public boolean isOdd(int a) {
		return (a % 2 == 1) ? true : false;
	}
}

public class CalEx4 {

	public boolean isOdd(int a) {
		// ù��° ���
//		if (a % 2 == 1) {
//			return true;
//		}else {
//			return false;
//		}
		
		boolean isOdd = (a % 2 == 1) ? true : false;
		return isOdd;
	}
	
	public static void main(String[] args) {
		// ������ �̿��Ͽ� Ȧ���� true, ¦���� false�� ����ϼ���.

		CalEx4 cal4 = new CalEx4();
		cal4.isOdd(3);
		System.out.println(cal4.isOdd(3)); // true
		
		// 3. �ٸ� Ŭ�������� �޼ҵ� ��������
		
		Cal c = new Cal();
		c.isOdd(5);
		System.out.println(c.isOdd(5)); // true
		
		// 4. Cal2.java ���� ��ü ��������
		Cal2 c2 = new Cal2();
		c2.isEven(2);
		
		System.out.println(c2.isEven(2)); // true
		
		
	}

}
