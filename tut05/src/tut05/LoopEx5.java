package tut05;

import java.util.Scanner;

public class LoopEx5 {

	public static void main(String[] args) {
		
		// q �� �Է��ϱ� ������ ���α׷� ��ӽ��� (���ѷ���)
		// q/Q �Է��ϸ� ���α׷� ����
		// ui : a �Է��ϸ� ���ϱ�, q ����
		// a�� �Է��ϸ� �� ������ �Է� �޾� ���ϱ� �� �� ���
		
		Scanner sc = new Scanner(System.in);
		

		
		boolean run = true;
		
		while (run) {
			System.out.println("=====================");
			System.out.println("1. ���ϱ�(a) 2. ����(q)");
			System.out.println("=====================");
			System.out.print("�۾� ������ �Է��ϼ���. >> ");
			String input = sc.next();
//			System.out.println(input); -> ��� �׽�Ʈ
			
			switch (input) {
			case "a" :
				System.out.print("ù��° ������ �Է��ϼ���. >> ");
				int num1 = sc.nextInt();
				
				System.out.print("�ι�° ������ �Է��ϼ���. >> ");
				int num2 = sc.nextInt();
				
				int result = num1 + num2;
				System.out.println("�� ������ ���� " + result + "�Դϴ�.");
				System.out.println("");
				break;
				
			case "q" :
			case "Q" :
				System.out.println("���α׷��� �����մϴ�.");
				System.exit(0); // ���ѷ����� �����ϰ� ���α׷��� ���� ���ɴϴ�.
				break;
				
			default :
				System.out.println("��ȿ���� ���� ��ɾ��Դϴ�.\n�ٽ� �Է����ּ���.");
			
			}
			
		}
		
		
		
		
		

	}

}
