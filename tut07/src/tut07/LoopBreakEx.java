package tut07;

public class LoopBreakEx {

	public static void main(String[] args) {
		// break
		// 0 ~ 10 ����ϼ���.
		// �� ������ 7������ ���
		
		for (int i = 0; i <= 10; i++) {
			if (i > 7) {
				break;
			}
			System.out.println(i);
		}
		
		System.out.println("-------------------------");
		
		// 1 ~ 20 ���� Ȧ���� ����ϱ�
		
		// ���� ���� �ڵ�
		
		for (int odd = 1; odd < 21; odd++) {
			if (odd % 2 == 1) {
				System.out.println(odd);
			}
		}
		
		System.out.println("-------------------------");
		
		// ����� �ڵ�
		
		for (int odd2 = 1; odd2 < 21; odd2++) {
			if (odd2 % 2 == 0) {
				continue;
			}
			System.out.println(odd2);
		}
				
	}

}
