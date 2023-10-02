package tut0920;

class Person {
	// 
	String userid;
	String userpw;
	int age;
	
	// ������
	
	public Person() {}
	
	public Person(String userid, String userpw, int age) {
		this.userid = userid;
		this.userpw = userpw;
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
	
	// method
	
	@Override
	public String toString() {
		return "���̵� : " + userid + " " + "��й�ȣ : " + userpw + " " + "���� : " + age;
	}
}

public class UsersEx2 {

	public static void main(String[] args) {
		// 3���� ȸ��(Users)�� �����ڷ� ���� �� ���
		
		Person[] user = new Person[3];
		
		// 3���̴� �ʱ�ȭ�� 3������ (���� �ʱ�ȭ����)
		
//		user[0] = new Person("a", "b", 2);
//		user[1] = new Person("c", "d", 5);
//		user[2] = new Person("3", "1", 10);
		
		// n���� for �� n�� �ʱ�ȭ
//		for (int i = 0; i < user.length; i++) {
//			user[i] = new Person("���̵�" + i, "��й�ȣ" + i, i + 1);
//			System.out.println(user[i].toString());
//		}
		
		System.out.println("--------------------------------");
		
		// getter, setter
		
		for (int i = 0; i < user.length; i++) {
			user[i] = new Person(); // �ʱ�ȭ
			
			user[i].setUserid("setid" + i);
			user[i].setUserpw("qwer1234" + i);
			user[i].setAge(30 + i);
			
			System.out.println(user[i].toString());
		}

	}

}
