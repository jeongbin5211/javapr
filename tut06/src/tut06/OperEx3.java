package tut06;

public class OperEx3 {

	public static void main(String[] args) {
		// ������ ȸ�������� �̸��ϰ� ��й�ȣ�� ���Ͽ�
		// ��� ��ġ�ϸ� �α��� �Ǿ����ϴ�.
		// �ƴϸ� �α��� ������ ��ġ���� �ʽ��ϴ�.
		// ���Ե� ������ db �̸���, ���
		// �α��� �� �� �Է��ϴ� �̸���, ���
				
		String db_userid = "email@email.com";
		String db_userpw = "12345";
				
		String userid = "email@email.com";
		String userpw = "12345";
				
		boolean idCheck = db_userid.equals(userid);
		boolean pwCheck = db_userpw.equals(userpw);
				
		if (idCheck && pwCheck) {
			System.out.println("�α��� ����");
		}else {
			System.out.println("�α��� ����");
		}
				
		System.out.println(true && true);	// true
		System.out.println(true && false);	// false
		System.out.println(false && false);	// false
				
		System.out.println("");
				
		System.out.println(true || true);	// true
		System.out.println(true || false);	// true
		System.out.println(false || false);	// false
				
		System.out.println("");
				
		boolean result1 = true && true;
		System.out.println(!result1);
				
		if (result1) {
			System.out.println("�� ����� ���Դϴ�.");
		}
			
		boolean result2 = true && false;
		System.out.println(result2);
				
		if (result2) {
			System.out.println("�� ����� ���Դϴ�.");
		}// result2 �� �����̱� ������ �ƹ��͵� ��¾ȵ�

		boolean result3 = false && false;
		System.out.println(result3);
	}

}
