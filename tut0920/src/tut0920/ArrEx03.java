package tut0920;

public class ArrEx03 {

	public static void main(String[] args) {
		// �޼ҵ带 �̿��ؼ� �迭 ����ϱ�
		// ������ 5�� ������ ������ ��
		// �հ� ���
		// ��� ���
		
//		int[] scores = new int[] {1, 2, 3, 4, 5};
		int[] scores = null;
		scores = new int[] {1, 2, 3, 4, 5};
		
		Cal c = new Cal();
		
		System.out.println("���� ��� �޼ҵ� ���");
		System.out.println(c.leng(scores));
		
		c.add(scores);
		
		System.out.println(c.add(scores)); // 15
		
		// ���
		
		System.out.println("��հ� ���");
		System.out.println(c.avg(scores));
		System.out.printf("��հ��� %.2f �Դϴ�.", c.avg(scores));

		System.out.println("---------------");
		
		Disp d = new Disp();
		d.title();
		
		// d.title ������ �ٸ��� ����ϱ� -> �������̵� Ȱ��
		
		d.title("��ǻ�� ���α׷�");
		
		System.out.println("---------------");
		
		d.close();
		
		// d.close()�� ������ �ٸ��� ����ϱ�
		
		d.close("�ý��� ����");
		
		
	}

}
