package tut04;

import java.util.Scanner;

public class ContEx3 {

	public static void main(String[] args) {
		// grade 0 = Guest, 1 = Member, 2 = Admin �� ����ϱ�
		// switch�� ���
		// ����, ����(char), ���ڿ� ��밡��
		// boolean �Ұ���
		
		int grade = 2;
		
//		switch (��) {
//		case ����:
//			����ڵ�
//			break;
//		}
		
		switch (grade) {
		case 0 : 
			System.out.println("Guest �� �ȳ��ϼ���.");
			break;
		case 1 : 
			System.out.println("Member �� �ȳ��ϼ���.");
			break;
		case 2 : 
			System.out.println("Admin �� �ȳ��ϼ���.");
			break;
		default :
			System.out.println("error!");
			
		}
		
		System.out.println("-------------------------------");
		
//		"I" : �Է�, "S" : ���, "U" : ����, "D" : ����
//		insert      select     update     delete
		
//		CRUD -> Creat Read Update Delete
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�Է�(I/i), ���(S/s), ����(u), ����(d) >> ");
		
		String input = sc.next();
//		System.out.println(input); ��� �Ǵ��� Ȯ���ϴ¿뵵
		
		switch(input) {
		case "I" :
		case "i" :
			System.out.println("�����ͺ��̽��� �����մϴ�.");
			System.out.println("SQL �Է� ��ɾ� : INSERT INTO member VALUES()");
			System.out.println("ȸ������ �Է� �Ϸ�!!");
			break;
			
		case "S" :	
		case "s" : 
			System.out.println("�����ͺ��̽��� �����մϴ�.");
			System.out.println("SELECT * FROM member");
			System.out.println("ȸ������ ��ȸ �Ϸ�!!");
			break;
			
		case "u" : 
			System.out.println("�����ͺ��̽��� �����մϴ�.");
			System.out.println("UPDATE member SET");
			System.out.println("ȸ������ ���� �Ϸ�!!");
			break;
			
		case "d" :
			System.out.println("�����ͺ��̽��� �����մϴ�.");
			System.out.println("DELETE FROM member");
			System.out.println("ȸ������ ���� �Ϸ�!!");
			break;
			
		default :
			System.out.println("�߸��� ��ɾ� �Դϴ�.");
			System.out.println("���α׷��� �����մϴ�.");
			System.exit(0); // ���� �ڵ�
			
		}
		

	}

}
