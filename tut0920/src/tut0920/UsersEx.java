package tut0920;

class Users {
	String userid;
	String userpw;
	int age;
	
	// ������ : ��ü �ʱ�ȭ -> public���� �����ϸ� class�̸��� �����ؾ� �ϰ� ���ϰ�x
	
	// �⺻������
	public Users() {}
	
	public Users(String userid) {
		this.userid = userid;
	}
	
	public Users(String userid, String userpw) {
		this.userid = userid;
		this.userpw = userpw;
	}
	
	public Users(String userid, String userpw, int age) {
		this(userid, userpw);
		this.age = age;
	}
	
	// getter, setter
	
	public String getUserid() {
		return userid;
	}
	
	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getUserpw() {
		return userpw;
	}

	public void setUserpw(String userpw) {
		this.userpw = userpw;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	
	// �޼ҵ�
	
	@Override
	public String toString() {
		return "User [���̵� : " + userid + ", ��й�ȣ : " + userpw + ", age : " + age + "]";
	}
	
}

public class UsersEx {

	public static void main(String[] args) {
		// ȸ������ 1���� �迭�� ó���ϼ���.
		// �����ڸ� �̿��ؼ� ����
		// getter, setter
		
//		String[] userid = new String[1];
//		String[] userpw = new String[2];
//		
//		Users[] user = new Users[1]; // ȸ�� �Ѹ� �����ϴ� �迭(���̵�, ���, ����)
//		System.out.println(user.length); // 1
		
		// �ʵ忡 ���� �����ϴ� ��
//		user[0].userid() = "aaa";
//		user[0].userpw() = "123";
//		user[0].age = 20;
		
		// �����ڸ� �̿��ؼ� �ʱ�ȭ(�� �Է�)
//		user[0] = new Users("���̵�", "��й�ȣ", 10);
//		System.out.println(user[0]);
//		user[0].toString();
//		System.out.println(user[0].toString());
		
		// 2��
//		Users[] user = new Users[2]; // ȸ�� �θ� �����ϴ� �迭
//		
//		user[0] = new Users("���̵�1", "��й�ȣ1", 10);
//		user[1] = new Users("���̵�2", "��й�ȣ2", 20);
//		
//		System.out.println(user[0].toString());
//		System.out.println(user[1].toString());
		
		// 3��
//		Users[] user = new Users[3];
//		
//		user[0] = new Users("���̵�1", "���1", 10);
//		user[1] = new Users("���̵�2", "���2", 20);
//		user[2] = new Users("���̵�3", "���3", 30);
//		
//		System.out.println(user[0].toString());
//		System.out.println(user[1].toString());
//		System.out.println(user[2].toString());
		
		// ������ ����
//		Users[] user = new Users[3]; 
		
//		for (int i = 0; i < user.length; i++) {
//			user[i] = new Users("���̵�" + i, "���" + i, i);
//			System.out.println(user[i].toString());
//		
		// getter, setter
//		Users[] user = new Users[i];
//		
//		user[0] = new Users("safs");
//		
//		user[0].setUserid("setId");
//		
//		System.out.println(user[0].getUserid());
//		}
		
		
		
		
		
		
		
		

	}

}
