package tut0919;

public class LoginEx {

	// 2. �ʵ�(�������) ����
	String userid;
	String userpw;
	
	public static void main(String[] args) {
		
		// 1. �α����� �ʿ��Ѱ�(������Ʈ, �׷����, ��ü) -> ��ü �ϳ� ���� �����ϴ°� ������
		
		// ������Ʈ(web) : ���̵�, ���
		LoginEx web = new LoginEx();
		
		web.userid = "id1";
		web.userpw = "12345";
		
		LoginEx web2 = new LoginEx();
		
		web2.userid = "id2";
		web2.userpw = "1234";
		
		// �׷����(grp) : ���̵�, ���
		
		LoginEx grp = new LoginEx();
		
		grp.userid = "�׷���̵�";
		grp.userpw = "�׷��й�ȣ";
		
		

	}

}
