package tut07;

import java.util.Scanner;

public class BankEx {

	public static void main(String[] args) {
		
		int money = 0;
		int in = 0;
		int out = 0;
		boolean run = true;
		
		while(run) {
			
			Scanner sc = new Scanner(System.in);
			System.out.println("===============================");
			System.out.println("1. �Ա� | 2.��� | 3.�ܰ� | 4.����");
			System.out.println("===============================");
			System.out.print("�޴��� �������ּ���. >> ");
			int menu = sc.nextInt();
			
			switch (menu) {
			case 1: 
				System.out.print("\n�Ա��Ͻ� �ݾ��� �Է����ּ���. >> ");
				in = sc.nextInt();
				money += in;
				System.out.println("");
				System.out.println(in + "�� �Ա��ϼ̽��ϴ�.");
				System.out.println("");
				System.out.println("�ܰ�� " + money + "�Դϴ�.");
				System.out.println("");
				
				break;
				
			case 2 :
				System.out.print("\n����Ͻ� �ݾ��� �Է����ּ���. >> ");
				out = sc.nextInt();
				System.out.println("");
				
				if(money < out) {
					System.out.println("�ܾ��� �����մϴ�.\n");
				}else {
					System.out.println(out + "�� ����ϼ̽��ϴ�.\n");
					System.out.println("�ܰ�� " + money + "�� �Դϴ�." );
				}
				break;
				
			case 3 :
				System.out.println("\n�ܰ�� " + money + "�� �Դϴ�.\n");
				
				break;
				
			case 4 : 
				System.out.println("\n���α׷��� �����մϴ�.\n");
				System.exit(0);
				break;
				
			default :
				System.out.println("\n�޴��� �ٽ� �������ּ���.\n");
				
			}
		}
		
		
		
		
		

	}

}
