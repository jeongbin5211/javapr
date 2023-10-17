package exception;

class LoginException extends Exception {
	
	public LoginException() {}
	
	public LoginException(String s) {
		super(s);
	}
	
}

class LoginCheck extends LoginException {
	String dbUserid = "korea";
	String dbUserpw = "1234";
	
	void loginCheck(String userid, String userpw) throws LoginException {
		
		if (userid.isEmpty() || userpw.isEmpty()) {
			
			throw new LoginException("���̵� �Ǵ� ��й�ȣ�� �Է����ּ���.");
			
		}else if(!userid.equals(dbUserid) || !userpw.equals(dbUserpw)) {
			
			throw new LoginException("���̵� �Ǵ� ��й�ȣ�� Ȯ���ϼ���.");
			
		}else {
			System.out.println("�α��� ����");
		}
		
	}
	
}

public class LoginEx {

	public static void main(String[] args) {
		// 1. ���̵� �Ǵ� ��й�ȣ �Է�
		// 2. ���̵�, ��й�ȣ�� ��ġ���� ������...
		// 3. ��ġ�� ���
		
		try {
			
			LoginCheck login = new LoginCheck();
			login.loginCheck("korea", "1234");
			
		}catch (LoginException le) {
			le.printStackTrace();
		}

	}

}
