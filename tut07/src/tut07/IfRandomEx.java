package tut07;

public class IfRandomEx {

	public static void main(String[] args) {
		
		// ����(1) ����(2) ��(3)
		// me, com ���� ����
		// ���� ��ǻ�͸� ���ؼ� ��ġ���� ������ �̰���ϴ�. ��ġ�ϸ� �����ϴ�.
		
		int me = 2;
		
		// ����ƽ �޼ҵ�� ���Ⱑ ����� ���·� �Էµȴ�.
		System.out.println(Math.random());
		
		// random �޼ҵ� ����
		// (int)(Math.random() * ��������) + ���۰�
		// ���� ���� �� = 1, 2, 3
		// (int)(Math.random() * 3) + 1
		System.out.println((int)(Math.random() * 3) + 1);
		
		int com = (int)(Math.random() * 3) + 1;
		
		if (me != com) {
			System.out.println("��ǻ�Ͱ� �̰���ϴ�.");
			System.out.println("���α׷��� �����մϴ�.");
		}else {
			System.out.println("����� �̰���ϴ�.");
			System.out.println("���α׷��� �����մϴ�.");
		}
				
	}

}
