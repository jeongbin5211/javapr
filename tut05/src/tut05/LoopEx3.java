package tut05;

public class LoopEx3 {

	public static void main(String[] args) {
		// ������ ������ 100������ ��� for��
		// ������ 20��° ������ "������ �������ϴ�." ��� �޽��� ��� �� ���α׷� ����

		for (int hit = 0; hit <= 100; hit++) {
			System.out.println("in"); // ���� ���� Ȯ�ο����� ���
			if (hit > 20) {
				System.out.println("������ �������ϴ�.");
				break; // for ���� ��� -> for�� �ۿ� ���α׷� ���� �ۼ�
			}
			System.out.println(hit + "hit");
		}
		System.out.println("���α׷� ����");
//		System.exit(0);
		
		System.out.println("--------------");
		
		// �� ������ while������ ���
		
		int hit = 0;
		while (hit < 101) {
			System.out.println("first");
			if (hit > 20) {
				System.out.println("������ �������ϴ�.");
				break;
			}
			System.out.println(hit + "hit");
			hit++;
		}
		System.out.println("���α׷� ����");
		System.exit(0);
	}

}
