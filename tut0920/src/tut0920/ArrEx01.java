package tut0920;

public class ArrEx01 {

	public static void main(String[] args) {
		// �迭�� �ݺ����� ���� ����մϴ�.
		// (for - �迭��ȣ�� �ʿ��� ��, ���� for - �迭��ȣ �ʿ���� ���� �ʿ��� ��)
//		for (int i = 0; i < �迭��.length; i++) {
//			����ڵ�(����);
//		}
		
		// ���� for
//		for(���Ÿ�� ���� : �迭��) {
//			����ڵ�(����);
//		}
		
		// �迭��ȣ(index)�� 0���� ����
		// �����̸��� i, idx, index �� �ִٸ� �迭�� ó��
		
		// ���� 100���� �����ϴ� ���α׷��� �ϼ��ϼ���.
		
//		������Ÿ�� ������ = new ������Ÿ��;
		
//		int[] values = new int[100]; // 4byte¥�� �� ������ 100�� ������ -> �ʱ�ȭ�� �ƴմϴ�.
		
		// ������ : �ʱ�ȭ
//		Member m = new Menber(); // �ʱ�ȭ �Ȱ��Դϴ�.
		
		int[] value = new int[3]; // ���� �ʱ�ȭ �ȵ�
		value[0] = 100; // �ʱ�ȭ
		value[1] = 200; // �ʱ�ȭ
		value[2] = 300; // �ʱ�ȭ
		
		// �迭 0 ~ 2������ ����ϼ���.
		
		System.out.println(value[0]); // 100
		System.out.println(value[1]); // 200
		System.out.println(value[2]); // 300
		
		System.out.println("-------------------------------");
		
		// �迭 0 ~ 2������ ����ϼ���.
		// �迭��[index]
		// for���
		
		for (int i = 0; i < value.length; i++) {
			System.out.println("value[" + i + "] = " + value[i]);
		}
		
		System.out.println("-------------------------------");
		
		// value[0]�� ���� 0�Դϴ�. ����ϱ�
		
		for (int i = 0; i < value.length; i++) {
			System.out.println("value[" + i + "]�� ���� " + value[i] + "�Դϴ�.");
		}
		
		System.out.println("-------------------------------");
		
		// 1�� ���� 100�Դϴ�. ����ϱ�
		
		for (int i = 0; i < value.length; i++) {
			System.out.println(i + "�� ���� " + value[i] + "�Դϴ�.");
		}

//		int[] num = {1, 2, 3, 4, 5}; // ���� ���� �Է��ؼ� �ִ� ����Դϴ�.
		// �ʱⰪ�� �����ϸ� �ڵ����� �迭 ������ �����˴ϴ�.
		
		// �л� 3�� ������ �ʱⰪ���� ���� �� ȭ�鿡 ����ϼ���.
		// �հ� ���
		// ��� ���
		
		System.out.println("\nȭ�鿡 ����ϱ�\n");
		int[] scores = {20, 70, 80};
		for (int i = 0; i < scores.length; i++) {
			System.out.println(scores[i]);
		}
		
		System.out.println("-------------------------------");
		
		int sum = 0;
		for (int i = 0; i < scores.length; i++) {
			sum = sum + scores[i];
		}
		System.out.println(sum);
		
		System.out.println("-------------------------------");
		
		System.out.println("���� ��� ���");
		
		// �հ� / �迭���� = ���
		
		// ���� �Ǽ� ���ɼ��� Ȯ���ϱ�
		double avg = (double)(sum / scores.length);
		System.out.println(String.format("%.2f", avg)); // 56.00;
		System.out.printf("����� %.2f �Դϴ�.\n", avg);
	}

}
