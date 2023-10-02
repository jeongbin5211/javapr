package tut0920;

class Person {
	// 
	String userid;
	String userpw;
	int age;
	
	// 생성자
	
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
		return "아이디 : " + userid + " " + "비밀번호 : " + userpw + " " + "나이 : " + age;
	}
}

public class UsersEx2 {

	public static void main(String[] args) {
		// 3명의 회원(Users)을 생성자로 저장 후 출력
		
		Person[] user = new Person[3];
		
		// 3명이니 초기화도 3번진행 (각각 초기화해줌)
		
//		user[0] = new Person("a", "b", 2);
//		user[1] = new Person("c", "d", 5);
//		user[2] = new Person("3", "1", 10);
		
		// n명을 for 로 n번 초기화
//		for (int i = 0; i < user.length; i++) {
//			user[i] = new Person("아이디" + i, "비밀번호" + i, i + 1);
//			System.out.println(user[i].toString());
//		}
		
		System.out.println("--------------------------------");
		
		// getter, setter
		
		for (int i = 0; i < user.length; i++) {
			user[i] = new Person(); // 초기화
			
			user[i].setUserid("setid" + i);
			user[i].setUserpw("qwer1234" + i);
			user[i].setAge(30 + i);
			
			System.out.println(user[i].toString());
		}

	}

}
