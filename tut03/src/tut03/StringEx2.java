package tut03;

public class StringEx2 {

	public static void main(String[] args) {
		// �̸��� ������ �´��� üũ�ϴ� charAt("ã�� ���� �ε���")
		String email = "mail@mail.com";
		System.out.println(email.length()); // 13
		
		// . => ~�ȿ� ��� �ǹ�
		System.out.println(email.charAt(4)); // @
		
		if (email.charAt(4) == '@') {
			System.out.println("��밡���� �̸��� �ּ��Դϴ�.");
		}else {
			System.out.println("����� �� ���� �̸��� �ּ��Դϴ�.\n�ٽ� �Է����ּ���.");
		}
		
		System.out.println("---------------------------");
		
		String str = "korea it academy";
		
		System.out.println(str.length()); // 16
		
		// replaceAll("�ٲܰ�", "�ٲﰪ");
		System.out.println(str.replaceAll("it", "IT")); // korea IT academy

		System.out.println("---------------------------");
		
		// �ֹι�ȣ�� �̿��ؼ� 1�̸� ����, 2�� ���ڷ� ȭ�鿡 ǥ���ϼ���.
		String jumin = "001234-1234567";
		
//		������.substring(�ε���) -> �ش� �ε��� �� ���� ������ ���
//		������.substring(�����ε���, ã������ �ε��� + 1)
		System.out.println(jumin.length()); // 16
		System.out.println(jumin.substring(7)); // 1234567 : 7�� �ε������� ��� ������
		System.out.println(jumin.substring(7, 8)); // 1 
		
		int gender = Integer.parseInt(jumin.substring(7, 8));
		
		if (gender % 2 == 1)
			System.out.println("�����Դϴ�.");
		else 
			System.out.println("�����Դϴ�.");
		
		
		
	}

}
