package tut04;

import java.util.Scanner;

public class ContEx4 {

	public static void main(String[] args) {
		// ������ ������ �Է� �޾Ƽ� Ȧ��, ¦���� ǥ���ϼ���.
		// �Է��� ���ڷ� �Է� �޾Ƽ� ������ ��ȯ�Ͽ� ����ϼ���.
		// switch
		// �Է� ȭ���� 1�̸� Ȧ�� ¦�� ���, 2 ���α׷� ����
		
		Scanner sc = new Scanner(System.in);
		System.out.print("��� (1), ����(2) >> ");
		
		int input = Integer.parseInt(sc.next());
//		System.out.println(input);
		
		switch (input) {
		case 1 : 
			System.out.println("===========================");
			System.out.println("Ȧ��, ¦���� �����մϴ�.");
			System.out.println("===========================");
			
			System.out.print("������ ������ �Է��ϼ���. >> ");
			int input2 = Integer.parseInt(sc.next());
			
			String result = (input2 % 2 == 1) ? "Ȧ��" : "¦��";
			
			System.out.printf("�Է��Ͻ� ������ %s �Դϴ�.", result);
//			System.out.println("�Է��Ͻ� ������ " + result + "�Դϴ�.");
			break;
			
		case 2 :
			System.out.println("���α׷��� �����մϴ�.");
			System.exit(0);
			break;
			
		default :
			System.out.println("�ٽ� �Է����ּ���.");
		
		}
	}

}
