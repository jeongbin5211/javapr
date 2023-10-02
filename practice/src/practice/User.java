package practice;

public class User {
	
	String userId;
	String userPw;
	int age;
	String address;

	public User() {}
	
	public User(String id, String pw, int age) {
		
		this.userId = id;
		this.userPw = pw;
		this.age = age;
				
	}
	
	public User(String id, String pw, int age, String address) {
		
		this(id, pw, age);
		this.address = address;
		
				
	}
	
	public void userInfo() {
		System.out.println(userId);
		System.out.println(userPw);
		System.out.println(age);
	}
}
