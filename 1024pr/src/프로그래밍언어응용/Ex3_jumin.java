package ���α׷��־������;

import java.util.Scanner;

public class Ex3_jumin {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�ֹε�Ϲ�ȣ�� �Է��ϼ���.(000000-0000000) >> ");
		String str = sc.nextLine();
		char gender = str.charAt(7);
		
		if (gender % 2 == 0) 
			System.out.println("�����Դϴ�.");
		else
		System.out.println("�����Դϴ�.");
		
		
	}

}
