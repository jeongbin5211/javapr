package tut0919;

class Register { // �ʵ� -> ������ -> getter, setter -> �޼ҵ� 
	
	// 1. �ʵ�
//		String userid;
//		String userpw;
//		int point;
	
	// 4. private
//		private String userid;
//		private String userpw;
//		private int point;
	
		
		// 2. ������
//		public Register() {} // default ������(��������)
		
//		public Register(String title) {
//			System.out.println(title);
//		}
	
		// 3.
//		public Register(String uid, String upw, int p) {
//			userid = uid;
//			userpw = upw;
//			point = p;
//		}
		
//		public Register(String userid, String userpw, int point) {
//			this.userid = userid;
//			this.userpw = userpw;
//			this.point = point;
//		}
		
		
		
}

public class RegisterEx { 
	
	private String userid;
	private String userpw;
	private int point;
	
	public RegisterEx(String userid, String userpw, int point) {
		this.userid = userid;
		this.userpw = userpw;
		this.point = point;
	}
	
	public static void main(String[] args) {
		
		// ȸ������ ���α׷� : ��ü = ȸ�� 1�� ����
		// ���̵�(String), ���(String), ����Ʈ(int)�� �����ϰ� ����ϴ� ���α׷�
		
		// 1. �ʵ忡 ���� ���� �Է�
//		RegisterEx person = new RegisterEx(); // �� ������
//		
//		person.userid = "koreait";
//		person.userpw = "12345";
//		person.point = 1000;
		
		// 2. ������ - public���� �����ϰ� class�̸��� ���ƾ���
		
//		Register person = new Register("ȸ�������� �����մϴ�.");
		
		// 3.
//		Register p1 = new Register("koreait", "12345", 1000);
//		System.out.println(p1.userid);
//		System.out.println(p1.userpw);
//		System.out.println(p1.point);
		
		// 4. private
		RegisterEx p1 = new RegisterEx("koreait", "12345", 1000);
		System.out.println(p1.userid);
		System.out.println(p1.userpw);
		System.out.println(p1.point);
		// private ������ ���� ������(���� publicŬ���� ���� ���� �� ���� ����)
		

	}

}
