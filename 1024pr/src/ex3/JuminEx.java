package ex3;

import java.util.Scanner;

public class JuminEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�ֹε�Ϲ�ȣ�� �Է��ϼ���. ex) 000000-0000000");
		System.out.print(">> ");
		String jumin = sc.next();
		
		System.out.println(jumin);
		char input = jumin.charAt(7);
		System.out.println(input);
		
		if(input % 2 == 0) {
			System.out.println("�����Դϴ�.");
		}else {
			System.out.println("�����Դϴ�.");
		}
		
	}

}
