package tut0920;

public class UsersEx4 {

	public static void main(String[] args) {
		// UsersEx3.java �� �����ϰ� ǥ���ϱ�

		Users2[] user = new Users2[3];
		
		for (int i = 0; i < user.length; i++) {
			user[i] = new Users2();
			
			user[i].setUserid("korea" + (i));
			user[i].setUserpw("password" + i);
			user[i].setAge(i + 1);
		}
		System.out.println(user.length + "���� ȸ�������� ����Ǿ����ϴ�.\n");
		
		System.out.println("ȸ�������� ����մϴ�.\n");
		
		for (int i = 0; i < user.length; i++) {
			Users2 member = user[i];
			System.out.println(member.getUserid());
			System.out.println(member.getUserpw());
			System.out.println(member.getAge());
			
		}
		
		
	}

}
