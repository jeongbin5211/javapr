package tut03;

public class FinalEx {

	public static void main(String[] args) {
		// ���̵�� ��й�ȣ�� ��� ��ġ�ϸ� "������������ �̵��մϴ�."
		// ��ġ���� ������ "ȸ�������� Ȯ���ϼ���."
		// ȸ������ ����(���̵�, ���) = �α��� ����(���̵�, ���)
		// database ���� ���ϴ� ���� �̸��� �ܾ�� �ܾ �̾��� �� _ ���
		
		// ȸ����������(db) : ����
		String db_userid = "koreait";
		String db_userpw = "12345";
		int point = 1000;
		
		// �α������� : �Է�
		String userid = "koreait";
		String userpw = "12345";
		
		boolean result = db_userid.equals(userid) && db_userpw.equals(userpw);
		
		if(result) {
			point += 100;
			System.out.println(db_userid + " ȸ���� �ȳ��ϼ���. ������������ �̵��մϴ�.");
			System.out.println("������ ����Ʈ : " + point + "��");
		} else {
			System.out.println("�α��� ������ Ȯ���ϼ���.\nȸ������ �������� �̵��մϴ�.");
			System.out.println("������ ����Ʈ : " + point + "��");
		}
		
		// ���׿����� ���
		
		String login = result ? db_userid + " ȸ���� �ȳ��ϼ���. ������������ �̵��մϴ�." : "�α��� ������ Ȯ���ϼ���.\nȸ������ �������� �̵��մϴ�.";
		System.out.println(login);
		
		
		
	}

}
