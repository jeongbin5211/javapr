package tut05;

import java.util.Scanner;

public class LoopEx7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// �ܾ�, Ŀ�ǰ�, ������ ������ �ݺ��� �ۿ� �ۼ��ؾ��Ѵ�.
		// �ݺ��� �ȿ� �ۼ��ϸ� ��� �ʱ�ȭ�Ǳ� �����̴�.
		
		int money = 10000;
		int coffee = 3000;
		int cnt = 10;
		
		boolean run = true;
		while (run) {
			System.out.println("=====================");
			System.out.println("��Ÿ���� Ŀ�� �ڵ� �Ǹű�");
			System.out.println("=====================");
			System.out.println("1. ����(P/p) | 2. �ܾ�(B/b) | 3. ����(Q/q)");
			System.out.print("�޴� ���� >> ");
			
			
			String input = sc.next();
			System.out.println("");
			
			switch (input) {
			case "P" :
			case "p" :
				System.out.println("���Ÿ� �����մϴ�.");
				System.out.println("");
				
				if(money < coffee) {
					System.out.println("�ܾ��� �����մϴ�.");
					System.out.println("");
				}else if(cnt <= 0) {
					System.out.println("Ŀ�� ��� �����ϴ�.");
					System.out.println("");
				}else {
					money = money - coffee;
					cnt = cnt - 1; 
					System.out.println("�����Ͽ����ϴ�.");
					System.out.println("");
					System.out.println("���� Ŀ�� ��� : " + cnt);
					System.out.println("");
				}
				
				break;
				
			case "B" :
			case "b" :
				System.out.println("���� ���� �ܾ��� " + money + "�Դϴ�.");
				System.out.println("");
				break;
				
			case "Q" :
			case "q" :
				System.out.println("���α׷��� �����մϴ�.");
				System.exit(0);
				break;
				
			default :
				System.out.println("�޴��� �ٽ� �Է����ּ���.");
				System.out.println("");
				continue; // �ݺ����� �ǳʶٰ� �ٽ� ���ư�����.
			}
		}
			

	}

}

