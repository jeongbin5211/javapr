package tut0920;

class Users2 {
	// �ʵ�
	String userid;
	String userpw;
	int age;
	
	// ������
	
	public Users2() {}
	
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
	
	public String toString() {
		return "���̵� : " + userid + " ��й�ȣ : " + userpw + " ���� : " + age;
	}
}

public class UsersEx3 {

	public static void main(String[] args) {
		
		// getter, setter
		
		Users[] user = new Users[3];
		
		// set ����
		for (int i = 0; i < user.length; i++) {
			user[i] = new Users(); // �ʱ�ȭ
			
			user[i].setUserid("setid" + i);
			user[i].setUserpw("setpw" + i);
			user[i].setAge(i + 1);
			
			System.out.println("\n" + (i + 1) + "��° ȸ�������� ����մϴ�.\n");
			System.out.println(user[i].getUserid());
			System.out.println(user[i].getUserpw());
			System.out.println(user[i].getAge());
			;
		}
		

	}

}
