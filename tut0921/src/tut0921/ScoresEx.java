package tut0921;

import java.util.Scanner;

public class ScoresEx {

	public static void main(String[] args) {
		// <���ȭ��>
		// 1. �л��� | 2. �����Է� | 3. ������� | 4. ��� | 5. �ְ����� | 6. ����
		// ��������, ������ü ����
		Scanner sc = new Scanner(System.in);
		boolean run = true;
		int[] scores = null;
		
		int sum = 0;
		
		while(run) {
			System.out.println("1. ����� �л��� | 2. �����Է� | 3. ������� | 4. ��� | 5. �ְ����� | 6. ����");
			System.out.print("�޴��� ������ �ּ���. >> ");
			int menu = sc.nextInt();
			
			switch (menu) {
			case 1 :
				
				if (scores == null) {
					System.out.print("\n����� �л� ���� �Է��ϼ���. >> ");
					int student = sc.nextInt();
					scores = new int[student];
					System.out.println("\n" + scores.length + "���� �л��� ��ϵǾ����ϴ�.\n");
				}
				System.out.println("\n2. �����Է� �޴��� �̵��ϼ���.\n");
				
				break;
				
			case 2 :
				
				for (int i = 0; i < scores.length; i++) {
					System.out.println((i + 1) + "��° �л��� ������ �Է����ּ���.");
					int score = sc.nextInt();
					scores[i] = score;
					
				}
				System.out.println("\n�л� ���� �Է��� �Ϸ�Ǿ����ϴ�.\n");
				System.out.println("3. ������� �޴����� Ȯ���ϼ���.");
				
				break;
				
			case 3 :
				
				System.out.println("\n�л� ���� ���\n");
				System.out.println(scores.length + "���� �л� ���� ���\n");
				
				for (int i = 0; i < scores.length; i++) {
					System.out.println((i + 1) + "��° �л��� ������ "+ scores[i] + "�� �Դϴ�.\n");
				}
				
				break;
				
			case 4 :
				System.out.println("\n�л����� ��������� ����մϴ�.\n");
				for(int i = 0; i < scores.length; i++) {
					sum = sum + scores[i];
				}
				double avg = (double) sum / scores.length;
				System.out.printf("�л����� ��������� %.2f�� �Դϴ�.", avg);
				
				break;
				
			case 5 :
				// �ִ밪, �ּҰ� ���ϱ� = �񱳰�
				// �ִ밪 = �񱳰�(���� ���� ���� ���� => 0)
				// �ּҰ� = �񱳰�(���� ���� ū ���� => 9)
				int max = 0;
				int min = 100;
				
				for (int i = 0; i < scores.length; i++) {
					if (max < scores[i]) {
						max = scores[i];
						
					}
				}
				
				for (int i = 0; i < scores.length; i++) {
					if (min > scores[i]) {
						min = scores[i];
					}
				}
				System.out.println("\n�ִ밪�� " + max + "�Դϴ�." );
				System.out.println("�ּҰ��� " + min + "�Դϴ�.\n" );
				
				break;
				
			case 6 :
				System.out.println("���α׷� ����");
				System.exit(0);
				break;
				
			default :
				System.out.println("�޴��� �ٽ� �����ϼ���.");
				break;
			}
		}
		
		

	}

}
