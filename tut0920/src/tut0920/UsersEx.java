package tut0920;

class Users {
	String userid;
	String userpw;
	int age;
	
	// 생성자 : 객체 초기화 -> public으로 시작하며 class이름과 동일해야 하고 리턴값x
	
	// 기본생성자
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

	
	// 메소드
	
	@Override
	public String toString() {
		return "User [아이디 : " + userid + ", 비밀번호 : " + userpw + ", age : " + age + "]";
	}
	
}

public class UsersEx {

	public static void main(String[] args) {
		// 회원가입 1명을 배열로 처리하세요.
		// 생성자를 이용해서 저장
		// getter, setter
		
//		String[] userid = new String[1];
//		String[] userpw = new String[2];
//		
//		Users[] user = new Users[1]; // 회원 한명만 저장하는 배열(아이디, 비번, 나이)
//		System.out.println(user.length); // 1
		
		// 필드에 직접 저장하는 법
//		user[0].userid() = "aaa";
//		user[0].userpw() = "123";
//		user[0].age = 20;
		
		// 생성자를 이용해서 초기화(값 입력)
//		user[0] = new Users("아이디", "비밀번호", 10);
//		System.out.println(user[0]);
//		user[0].toString();
//		System.out.println(user[0].toString());
		
		// 2개
//		Users[] user = new Users[2]; // 회원 두명 저장하는 배열
//		
//		user[0] = new Users("아이디1", "비밀번호1", 10);
//		user[1] = new Users("아이디2", "비밀번호2", 20);
//		
//		System.out.println(user[0].toString());
//		System.out.println(user[1].toString());
		
		// 3개
//		Users[] user = new Users[3];
//		
//		user[0] = new Users("아이디1", "비번1", 10);
//		user[1] = new Users("아이디2", "비번2", 20);
//		user[2] = new Users("아이디3", "비번3", 30);
//		
//		System.out.println(user[0].toString());
//		System.out.println(user[1].toString());
//		System.out.println(user[2].toString());
		
		// 여러개 관리
//		Users[] user = new Users[3]; 
		
//		for (int i = 0; i < user.length; i++) {
//			user[i] = new Users("아이디" + i, "비번" + i, i);
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
