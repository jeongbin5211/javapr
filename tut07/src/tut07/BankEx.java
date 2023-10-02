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
			System.out.println("1. 입금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("===============================");
			System.out.print("메뉴를 선택해주세요. >> ");
			int menu = sc.nextInt();
			
			switch (menu) {
			case 1: 
				System.out.print("\n입금하실 금액을 입력해주세요. >> ");
				in = sc.nextInt();
				money += in;
				System.out.println("");
				System.out.println(in + "원 입금하셨습니다.");
				System.out.println("");
				System.out.println("잔고는 " + money + "입니다.");
				System.out.println("");
				
				break;
				
			case 2 :
				System.out.print("\n출금하실 금액을 입력해주세요. >> ");
				out = sc.nextInt();
				System.out.println("");
				
				if(money < out) {
					System.out.println("잔액이 부족합니다.\n");
				}else {
					System.out.println(out + "원 출금하셨습니다.\n");
					System.out.println("잔고는 " + money + "원 입니다." );
				}
				break;
				
			case 3 :
				System.out.println("\n잔고는 " + money + "원 입니다.\n");
				
				break;
				
			case 4 : 
				System.out.println("\n프로그램을 종료합니다.\n");
				System.exit(0);
				break;
				
			default :
				System.out.println("\n메뉴를 다시 선택해주세요.\n");
				
			}
		}
		
		
		
		
		

	}

}
