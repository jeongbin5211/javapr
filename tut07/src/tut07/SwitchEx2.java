package tut07;

import java.util.Scanner;

public class SwitchEx2 {

	public static void main(String[] args) {
		
		// ��, �ҹ��� ���� ó��
		// char
		// A/a -> ���ȸ��, B/b -> �ǹ�ȸ��, C/c -> �Ϲ�ȸ��, �� �ܿ��� �Խ�Ʈ
		
		Scanner sc = new Scanner(System.in);
		System.out.println("A/a = ���ȸ��, B/b = �ǹ�ȸ��, C/c = �Ϲ�ȸ��");
		System.out.print("ȸ�� ����� �������ּ���. >> ");
		String grade = sc.next();
		
		switch(grade) {
		case "A" :
		case "a" :
			System.out.println("���ȸ���Դϴ�.");
			break;
			
		case "B" :
		case "b" :
			System.out.println("�ǹ�ȸ���Դϴ�.");
			break;
			
		case "C" :
		case "c" :
			System.out.println("�Ϲ�ȸ���Դϴ�.");
			break;
			
		default :
			System.out.println("Guest �Դϴ�.");
		}
		
		

	}

}
