package tut0919;

public class CalEx3 {

	public boolean isCheck(int a, int b) {
		
		// 1. if�� ���
//		if (a + b > 200) 
//			return true;
//		else 
//			return false;
		
		// 2. ���׿�����
		return (a + b) > 200 ? true : false;
	}
	
	public static void main(String[] args) {
		// 100 + 100�� ����� 200���� ũ�� true�� ����ϼ���.
		
		CalEx3 cal3 = new CalEx3();
		
		// 1. ������ �غ���
		cal3.isCheck(200, 100);
		System.out.println(cal3.isCheck(200, 100)); // true
		
		// 2. 
		cal3.isCheck(100, 100);
		System.out.println(cal3.isCheck(100, 100)); // false
		

	}

}
