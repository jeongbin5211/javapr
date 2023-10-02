package tut0920;

class Users2 {
	// 필드
	String userid;
	String userpw;
	int age;
	
	// 생성자
	
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
	
	// 메소드
	
	public String toString() {
		return "아이디 : " + userid + " 비밀번호 : " + userpw + " 나이 : " + age;
	}
}

public class UsersEx3 {

	public static void main(String[] args) {
		
		// getter, setter
		
		Users[] user = new Users[3];
		
		// set 저장
		for (int i = 0; i < user.length; i++) {
			user[i] = new Users(); // 초기화
			
			user[i].setUserid("setid" + i);
			user[i].setUserpw("setpw" + i);
			user[i].setAge(i + 1);
			
			System.out.println("\n" + (i + 1) + "번째 회원정보를 출력합니다.\n");
			System.out.println(user[i].getUserid());
			System.out.println(user[i].getUserpw());
			System.out.println(user[i].getAge());
			;
		}
		

	}

}
