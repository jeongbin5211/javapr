package tut0921;

import java.util.Scanner;

public class RegisterEx {

	public static void main(String[] args) {
		// �ʵ忡 ���� �� �Է�
//		Register[] r = new Register[3];
//		
//		r[0] = new Register(); // �ʱ�ȭ
//		
//		r[0].setEmail("email");
//		r[0].setUserpw("123");
//		r[0].setUsername("jeong bin");
//		
//		System.out.println(r[0].getEmail());
//		System.out.println(r[0].getUserpw());
//		System.out.println(r[0].getUsername());
		
		// �����ڿ� ���� �� �Է�
//		Register r = new Register("email.com", "1234", "name");
//		
//		System.out.println(r.getEmail()); // email.com
//		
//		r.setEmail("naver.com");
//		
//		System.out.println(r.getEmail()); // naver.com
		
		// Scanner�� �̿��ؼ� �迭 ���� : 3
		// �Է� Scanner
		// for
		
		Scanner sc = new Scanner(System.in);
		System.out.print("������ ȸ�� �� >> ");
		int count = sc.nextInt();
		
		Register[] r = new Register[count]; // count����ŭ ������ �迭 ����
		
		for (int i = 0; i < r.length; i++) {
			System.out.print("�̸��� >> ");
			String email = sc.next();
			
			System.out.print("��й�ȣ >> ");
			String userpw = sc.next();

			System.out.print("�̸� >> ");
			String username = sc.next();
			
			r[i] = new Register(email, userpw, username); // �ʱ�ȭ
			
			System.out.println((i + 1) + "��° ȸ���� ��ϵǾ����ϴ�.");
			
		}
		System.out.println("ȸ�������� �Ϸ�Ǿ����ϴ�.");
		
		System.out.println("\n-----" + r.length + "�� ȸ�����-----");
		
		// ���� for
		
		for (Register reg : r) {
			System.out.println(reg.disp());
		}
		
		
	}

}
