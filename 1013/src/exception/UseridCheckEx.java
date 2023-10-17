package exception;

class UseridCheckException extends Exception {
	
	public UseridCheckException() {}
	
	public UseridCheckException(String message) {
		super(message);
	}
}

// �츮�� ����� ���� Exception�� üũ�ϴ� ������ Ŭ������ ������ ���� Ȯ��
class UseridCheck extends UseridCheckException {
	
	void useridCheck(String userid) throws UseridCheckException {
		if (userid.isEmpty()) {
			
			throw new UseridCheckException("���̵� �Է��ϼ���");
			
		}else if (userid.length() < 8) {
			
			throw new UseridCheckException("���̵� ���̰� ª���ϴ�.\n8�̻� ~ 12���Ϸ� �Է��ϼ���.");
			
		}else if (userid.length() > 12) {
			
			throw new UseridCheckException("���̵� ���̰� ��ϴ�.\n8�̻� ~ 12���Ϸ� �Է��ϼ���.");
			
		}else {
			System.out.println(userid + "��밡��");
		}
	}
}

public class UseridCheckEx {

	public static void main(String[] args) throws UseridCheckException {
		// ���̵� üũ
		// 1. �� �� üũ : ���̵� �Է��ϼ���.
		// 2. ���� ª�� ��� : ���̵� �ʹ� ª���ϴ�. 8�ڸ� �̻� ~ 12 ���Ϸ� ���ּ���.
		// 3. ���� �� ��� : ���̵� �ʹ� ��ϴ�. 8�ڸ� �̻� ~ 12 ���Ϸ� ���ּ���.
		// 4. �������� ��� : ����ϼŵ� �˴ϴ�.

		UseridCheck uc = new UseridCheck();
		
		uc.useridCheck("12321312312312321");
		
	}

}
