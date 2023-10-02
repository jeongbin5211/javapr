package tut0920;

public class UsersEx4 {

	public static void main(String[] args) {
		// UsersEx3.java 를 간단하게 표현하기

		Users2[] user = new Users2[3];
		
		for (int i = 0; i < user.length; i++) {
			user[i] = new Users2();
			
			user[i].setUserid("korea" + (i));
			user[i].setUserpw("password" + i);
			user[i].setAge(i + 1);
		}
		System.out.println(user.length + "명의 회원정보가 저장되었습니다.\n");
		
		System.out.println("회원정보를 출력합니다.\n");
		
		for (int i = 0; i < user.length; i++) {
			Users2 member = user[i];
			System.out.println(member.getUserid());
			System.out.println(member.getUserpw());
			System.out.println(member.getAge());
			
		}
		
		
	}

}
