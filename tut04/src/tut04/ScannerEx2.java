package tut04;

import java.util.Scanner;

public class ScannerEx2 {

	public static void main(String[] args) {
		// 1. ���ڿ� -> ���ڷ�
		// 2. ���� -> ���ڿ�
		// 3. Scanner -> �� ��ȯ
		
		int add = 10;
		String age = "100";
		System.out.println(add + age); // 10100
		
		// add + age�� �ϱ����ؼ��� �� ��ȯ�� �ʿ��մϴ�.
		// Integer.parseInt(������);
		int tmp = Integer.parseInt(age);
		int total = tmp + add;
		System.out.println("��ȯ�Ͽ� ���� ���̴� " + total + "�Դϴ�.");
		
		System.out.println("----------------------");
		
		int num = 1000;
		int value = 1000;
		
		System.out.println(num + value); // 2000
		
		String s = String.valueOf(value);
		
		System.out.println(num + s); // 10001000
		
		// Scanner
		System.out.println("----------------------");
		// �Է�â : Scanner ��ü
		// �Է³��� : ��ǻ�ͷ� �Է��ϴ� ���� System.in
		// .next(); -> ���ڿ�
		// Integer.parseInt();
		// �Է� �޽����� "������ �Է��ϼ���." ��� ���
		
//		Ÿ�� �̸� ��ü�� = new Ÿ��();
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է� >> ");
//		String input = sc.next();
//		System.out.println(100 + input); // 100100
		
		int input = Integer.parseInt(sc.next());
		System.out.println(100 + input); // 200
		

	}

}
