package tut04;

public class VarEx {

	public static void main(String[] args) {
		// ����(decimal) -> printf()
		int num = 100;
		
		// ���� ���� 100�Դϴ�.
		System.out.println("�������� " + num + "�Դϴ�.");
		
		System.out.printf("�������� %d�Դϴ�.", num); // printf -> ������ �����ؼ� ����ҰԿ�~
		
		System.out.println(String.format("\n�������� %d�Դϴ�.", num)); // �� �ΰ��� ���ļ� ���
		
		// Koreait ��ī�����Դϴ�. ����ϱ�
		String str = "Koreait";
		System.out.println(String.format("%s ��ī�����Դϴ�.", str)); // %s
		
		
	}
	

}
