package tut06;

import java.util.Scanner;

public class OperEx2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int std1 = 80;
		int std2 = 70;
		int avg = 75;
		// AND : �̰�, �̸鼭
		// OR : �̰ų�, �Ǵ�
		// �л�1 ������ ����������� ���� �л�2 ������ ��պ��� ������
		// ���, �ƴϸ� ����
		
//		if(����) {
//		����ڵ�(��)
//		}else {
//		����ڵ�(����)
//		}
		
		if (std1 > avg && std2 > avg)
			System.out.println("pass");
		else 
			System.out.println("����");
		
		// �л� ������ 90�̻� 100�����̸� �ֿ��
		// 80�̻� 89���� ���
		// �������� ����
		
		while (true) {
			System.out.print("������ �Է��� �ּ���. >> ");
			int score = sc.nextInt();
			System.out.println("");
//			System.out.println(score);
			
			if (score > 100 || score < 0)
				System.out.println("������ �ٽ� �Է����ּ���.");
			else if (score >= 90)
				System.out.println("�ֿ��");
			else if (score >= 80)
				System.out.println("���");
			else
				System.out.println("����");
		}
		
		
	}
		


}
