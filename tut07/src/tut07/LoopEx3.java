package tut07;

public class LoopEx3 {

	public static void main(String[] args) {
		// 1 ~ 100���� ���� ���ϼ���.
		// while
		// ��� ���� : 1 ~ 100���� ���� ~�Դϴ�.
		
		int sum = 0;
		int i = 1;
		while (i < 101) {
			sum += i;
//			System.out.println(sum);
			i++;
		}
		System.out.println("1 ~ 100 ���� ���� " + sum + "�Դϴ�."); // 5050
		
		// ��¿��� : 5050�Դϴ�.
		// ��¿��� : ���� 5050
		
		System.out.println("��¿��� : " + sum + "�Դϴ�.");
		System.out.println("���� " + sum);
		
	}

}
