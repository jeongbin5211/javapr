package tut03;

public class StringEx3 {

	public static void main(String[] args) {
		// ���� Ÿ���� �̸� �ϳ��� ���� �����͸� �ٷ�� ���� �ʿ� - �迭[] + for
		// �ٸ� Ÿ���� �ٷ�� ���ؼ��� ��ü�� ����մϴ�. - for ���
		
		// �ҹ��� -> �빮�ڷ� �ٲٱ�
		// toUpperCase();
		
		String title = "korea it academy";
//		"korea it academy".toUpperCase(); -> �ϵ��ڵ�, ���� ���� ���
		
		System.out.println(title.toUpperCase()); // KOREA IT ACADEMY
		
		System.out.println("--------------------------");
		
		String menues = "Home,Company,Contact,Help"; // �����ڴ� , : ; �� ���ϴ°ɷ� ��� �����մϴ�.
		
		System.out.println(menues.split(",")); // �޸� �ּҰ� ��µ� -> [Ljava.lang.String;@70177ecd
		
		String[] s = menues.split(",");
		System.out.println(s[0]); // Home
		System.out.println(s[1]); // Company
		System.out.println(s[2]); // Contact
		
//		��� �ε��� �ѹ��� �����ϴ� ��
//		for (������Ÿ�� ���� : �迭�̸�) {
//			����ڵ�
//		}
		
		for (String result : s) {
			System.out.println(result);
		}
//		��� �ε��� ��ҵ��� ��µ�
//		Home
//		Company
//		Contact
//		Help
		
		// �ι�° ���
//		for (int i = 0; i < �迭��.length; i++) {
//			����ڵ�
//		}
		
		for (int i = 0; i < s.length; i++) {
			System.out.println(s[i]);
		}
		
		// for���� ����ϴ� ������ �迭�� �߰��� �� ������ �����ϱ� �����̴�.
		// �׳� �����ϸ� �ϳ��ϳ� ����ؾ���
		
		System.out.println("--------------------------");
		
		// ���� ���� �� �ʱⰪ�� 100
		// ��� : ������ ������ �ʱⰪ�� 100�Դϴ�.
		int num = 100;
		System.out.println("������ ������ �ʱⰪ�� " + num + "�Դϴ�.");
		
		// printf() : C����� ǥ�� ��� �Լ���, ���� ������ �����͸� �پ��� ���Ŀ� ���� ����� �� �ְ� ���ݴϴ�.
		// printf() ���� f�� format
		// %d -> decimal : 10����
		System.out.printf("������ ������ �ʱⰪ�� %d �Դϴ�.", num);
		
		// %s -> string
		String str = "�λ�";
		
		System.out.println();
		System.out.printf("���� ��°��� %s�Դϴ�.", str);
	}

}
