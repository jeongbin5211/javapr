package tut05;

import java.util.Scanner;

public class ContEx5 {

	public static void main(String[] args) {
//		������ �Է� �޾Ƽ�
//		3 ~ 5 ���� ���Դϴ�.
//		6 ~ 8 ���� �����Դϴ�.
//		9 ~ 11 ���� �����Դϴ�.
//		12 ~ 2 ���� �ܿ��Դϴ�.
		
//		Scanner sc = null;
//		sc = new Scanner(System.in);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ �Է����ּ���. >> ");
		
		int input = Integer.parseInt(sc.next());
//		int input = sc.nextInt();
		
//		System.out.println(input); -> ��� �׽�Ʈ
//		System.out.println(sc.nextInt()); -> ��� �׽�Ʈ
		
		switch (input) {
		case 3 :
		case 4 :
		case 5 :
			System.out.println(input + "���� ���Դϴ�.");
			break;
			
		case 6 :
		case 7 :
		case 8 :
			System.out.println(input + "���� �����Դϴ�.");
			break;
			
		case 9 : 
		case 10 : 
		case 11 :
			System.out.println(input + "���� �����Դϴ�.");
			break;
			
		case 12 :
		case 1 :
		case 2 :
			System.out.println(input + "���� �ܿ��Դϴ�.");
			break;
			
		default :
			System.out.println(input + "���� �����ϴ�. �ٽ� �Է����ּ���.");
			
		}

	}

}
