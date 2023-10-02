package tut05;

import java.util.Scanner;

public class LoopEx6 {

	public static void main(String[] args) {
		/*
			========================
			��Ÿ���� Ŀ�� �ڵ� �Ǹű�
			========================
			1. ����(P/p) | 2. �ܾ�(B/b) | 3. ����(Q/q)
			�޴� ���� >
			
			[����]
			*���� �ܾ��� 10000, Ŀ�� ���� ������ 3000, Ŀ�� ����� 10
			*p/P �� �Է��ϸ� ����
			 - ���� �� ���� ���� ���� Ŀ�� ���� ���ݺ��� ���ų�
			   Ŀ�� ����� 0���� ������ "Ŀ�Ǹ� ������ �� �����ϴ�."
			   ��� �� �޴� ȭ������ �̵�
			 - Ŀ�� ���� �� �ܾ� �� Ŀ�� ��� ����
			* B/b �� �Է��ϸ� �ܾ� Ȯ��
			 - ���� ���� �ܾ� ����ϱ�
			
			* ���Ḧ �Է��ϱ� �������� ���ѹݺ�
			 - Q/q�� �Է��ϸ� ���α׷� ����
			
			* �߸��� �Է� ���� �Է��ϸ� ���ᰡ �ƴ� �޴� ȭ������ �̵�
		*/
		
		Scanner sc = new Scanner(System.in);
		
		int money = 10000;
		int coffee = 3000;
		int cnt = 10;
		
		boolean run = true;
		while (run) {
			
			
			System.out.println("========================");
			System.out.println("��Ÿ���� Ŀ�� �ڵ� �Ǹű�");
			System.out.println("========================");
			System.out.println("1. ����(P/p) | 2. �ܾ�(B/b) | 3. ����(Q/q)");
			System.out.print("�޴��� �����Ͽ� �Է����ּ���. >> ");
			String input = sc.next();
			System.out.println("");
			
			
			
			switch (input) {
			
			
			case "P" :
			case "p" :
				if (money < coffee) {
					System.out.println("�ܾ��� �����մϴ�.");
					System.out.println("");
				}else if (cnt <= 0) {
					System.out.println("��� �����ϴ�.\n�޴��� �̵��մϴ�.");
					System.out.println("");
				}else {
					money = money - coffee;
					cnt -= 1;
					System.out.println("�����ϼ̽��ϴ�.");
					System.out.println("���� �ܾ���" + money + "�� �Դϴ�.");
				}
				break;
				
			case "B" :
			case "b" :
				System.out.printf("���� ���� �ܾ��� %d�� �Դϴ�.", money);
				System.out.println("");
				break;
				
			case "Q" :
			case "q" :
				System.out.println("���α׷��� �����մϴ�.");
				System.exit(0);
				break;
				
			default :
				System.out.println("�ٽ� �Է����ּ���.");
				continue; // �ݺ����� �ǳʶٰ� �ٽ� ���ư�����.
			}
			
		}

	}

}
