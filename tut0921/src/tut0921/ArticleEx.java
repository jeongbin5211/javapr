package tut0921;

import java.util.Scanner;

public class ArticleEx {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�Խù� ���� >> ");
		int count = sc.nextInt();
		
		Article[] art = new Article[count];
		
		// set�Է�
		for (int i = 0; i < art.length; i++) {
			art[i] = new Article(); // �ʱ�ȭ
			
			art[i].setNum(i + 1);
			art[i].setSubject(i + 1 + "��° �Խù�");
			art[i].setVisit(i + 1);
			
			System.out.println(i + "��° �Խù��� �����Ǿ����ϴ�.");
			
		}
		System.out.println(art.length + "���� �Խù� ����� �Ϸ�Ǿ����ϴ�.");
		
		// get ���
		
//		for (int i = 0; i < art.length; i++) {
//			System.out.println(art[i].getNum());
//			System.out.println(art[i].getSubject());
//			System.out.println(art[i].getVisit());
//			System.out.println(art[i].getRegist());
//		}
		
		// ���� for�� get���
		// ���� �޼ҵ带 �̿��ؼ� ���
		
		for (Article a : art) {
			System.out.println(a.toString());
		}
		
	}

}
