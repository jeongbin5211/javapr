package tut04;

import java.util.Scanner;

public class ContEx2 {

	public static void main(String[] args) {
		/*
		  	���� 91 ~ 100 A��� 
		  	���� 81 ~ 90 B��� 
		  	���� 71 ~ 80 C���
		 */
		
		int score = 0;
		
		if (score > 100 || score < 0) {
			System.out.println("������ �ٽ� �Է����ּ���.");
		}else if (score >= 91) {
			System.out.println("A");
		}else if (score >= 81) {
			System.out.println("B");
		}else if (score >= 71) {
			System.out.println("C");
		}else {
			System.out.println("F");
		}
		
		// ��ĳ��
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ �Է����ּ���(���� : 0 ~ 100) >> ");
		// ���� �Է� ���� �� �ְ� sc.next();
		int input = Integer.parseInt(sc.next());
		
//		if (input > 100 || input < 0) {
//			System.out.println("������ �ٽ� �Է����ּ���.");
//		}else if (input >= 91) {
//			System.out.println("A");
//		}else if (input >= 81) {
//			System.out.println("B");
//		}else if (input >= 71) {
//			System.out.println("C");
//		}else {
//			System.out.println("F");
//		}
		
		String str = "";
//		String str = null; -> �Ѵ� ��� ����
		
		if (input > 100 || input < 0) {
			str = "������ �ٽ� �Է����ּ���.";
		}else if (input >= 91) {
			str = "A";
		}else if (input >= 81) {
			str = "B";
		}else if (input >= 71) {
			str = "C";
		}else {
			str = "F";
		}
		
		System.out.println(str);
		
		
		

	}

}
