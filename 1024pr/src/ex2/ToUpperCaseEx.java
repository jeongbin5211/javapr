package ex2;

import java.util.Scanner;

public class ToUpperCaseEx {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		boolean run = true;
		
		System.out.println("---------------------------");
		System.out.println("�ҹ��ڸ� �빮�ڷ� ��ȯ�ϴ� ���α׷�");
		System.out.println("---------------------------\n");
		
		do {
			System.out.println("=================================");
			System.out.println("1. �ҹ��ڸ� �빮�ڷ� ��ȯ�ϱ� | 2. ����");
			System.out.println("=================================");
			System.out.print("�޴��� �������ּ���. >> ");
			int menu = sc.nextInt();
			
			switch (menu) {
			case 1 :
				System.out.print("��ȯ�Ͻ� ���� �ҹ��ڸ� �Է��ϼ���. >> ");
				String str = sc.next();
				String upper = str.toUpperCase();
				System.out.println(upper);
				break;
				
			case 2 : 
				System.out.println("���α׷��� �����մϴ�.");
				System.exit(0);
				break;
				
			default :
				System.out.println("�޴��� �ٽ� �������ּ���.");
			}
			
			
		} while (run);
		
		
		
	}

}
