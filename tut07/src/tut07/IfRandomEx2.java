package tut07;

import java.util.Scanner;

public class IfRandomEx2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("����(1), ����(2), ��(3) ���� >> ");
		
		int me = sc.nextInt();
		
		int com = (int)(Math.random() * 3) + 1;
		
		if (me != com) {
			System.out.println("��ǻ�ʹ� " + com + ", ���� " + me + "�Դϴ�." );
			System.out.println("��ǻ�Ͱ� �̰���ϴ�.");
			System.out.println("���α׷��� �����մϴ�.");
		}else {
			System.out.println("��ǻ�ʹ� " + com + ", ���� " + me + "�Դϴ�.");
			System.out.println("����� �̰���ϴ�.");
			System.out.println("���α׷��� �����մϴ�.");
		}

	}

}
