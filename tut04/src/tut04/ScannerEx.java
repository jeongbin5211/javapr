package tut04;

import java.util.Scanner;

public class ScannerEx {

	public static void main(String[] args) {
		// Scanner : ���� �Է� �޾Ƽ� ó���մϴ�. + System.in -> ��ü�̴�.
		// ��ü �ʱ�ȭ (������ �ʱ�ȭ) new�� ���
		// ���ڿ��� �Է� �޾Ƽ� printf()�� ȭ�鿡 ���
		
		// ��ü ��ü�� = new ��ü();
		Scanner sc = new Scanner(System.in);
//		ȭ��â�� �̿��ؼ�           ����������Դϴ�.
		
		// �ܼ� ȭ�� ǥ��
		System.out.print("����� ���ڿ� �Է� >> ");
//		sc.next();
		String str = sc.next();
//		System.out.println("�Է��� ���ڿ� : " + str);
		
//		����� ���ڿ��� �ڸ��ƾ���Ƽ �Դϴ�.
		System.out.printf(String.format("����� ���ڿ��� %s �Դϴ�.", str));
		
	}

}
