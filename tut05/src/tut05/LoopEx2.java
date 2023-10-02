package tut05;

public class LoopEx2 {

	public static void main(String[] args) {
		// 0 ~ 10 �� ¦���� ����ϼ���. ����������
		for (int i = 2; i <= 10; i += 2) {
			System.out.println(i);
		}
		
		System.out.println("------------------------");
		
//		0 ~ 10 �� Ȧ���� ����ϼ���. for if, break
//		���� % 2 == 0 -> ¦��
//		break : ���� ����� '�ݺ���'�� ����� Ű����
//		continue : �ش��ϴ� '�ݺ���'�� ������ �ǳ� �ٴ� Ű����
		
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0) {
				continue;
			}
			System.out.println(i);
		}
		
		System.out.println("------------------------");
		
//		0 ~ 100 ���� ����ϴ� �ݺ����� �ۼ��ϵ�
//		0 ~ 20 ������ ����ϼ���. for
		
		for (int i = 0; i <= 100; i++) {
			if (i > 20) {
				break;
			}
			System.out.println(i);
		}

	}

}
