package tut06;

public class LoopEx {

	public static void main(String[] args) {
		// for(�ʱⰪ; ����; ������;) {
		//	����ڵ�
		// }
		
		// 0���� 10 ����ϴ� �ݺ����� �ϼ��ϼ���.
		for (int i = 0; i < 11; i++) {
			System.out.println(i);
		}

		System.out.println("----------------------------");
		
		// 1���� 20���� ����ϴ� for
		for (int i = 1; i < 21; i++) {
			System.out.println(i);
		}
		
		System.out.println("----------------------------");
		
		// for -> while
		
		int i = 1;
		while (i < 21) {
			System.out.println(i);
			i++;
		}
		
		System.out.println("----------------------------");
		
		// 1. for�� �� ����ϱ�
		// 0 ~ 10 ���� ����ϴ� for
		// ¦���� ����ϼ���
		
		for (int i2 = 0; i2 < 11; i2 += 2) {
			System.out.print(i2 + " ");
		}
		
		System.out.println("");
		System.out.println("----------------------------");
		
		// 2. for + if ��
		
		for (int j = 0; j < 11; j++) {
			if (j % 2 == 0) {
				System.out.println(j);
			}
		}
		
		System.out.println("----------------------------");
		
		// 3. continue ���
		
		for (int j = 0; j < 11; j++) {
			if (j % 2 == 1) {
				continue;
			}
			System.out.println(j);
		}
		
		System.out.println("----------------------------");
		
		int a = 1;
		while (a < 11) {
			if (a % 2 == 0) {
				System.out.println(a);
			}
			a++;
		}
		
		System.out.println("while");
		
		int c = 1;
		while (c < 11) {
			if (c % 2 == 1) {
				continue;
			}
			System.out.println(c);
			c++;
		}
		
	}

}
