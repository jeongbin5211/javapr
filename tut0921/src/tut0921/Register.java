package tut0921;

public class Register {
	// 필드
	String email;
	String userpw;
	String username;
	
	// 생성자
	public Register() {}
	
	public Register(String email, String userpw, String username) {
		this.email = email;
		this.userpw = userpw;
		this.username = username;
	}

	// getter, setter
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUserpw() {
		return userpw;
	}

	public void setUserpw(String userpw) {
		this.userpw = userpw;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	
	// 메소드
	
	@Override
	public String toString() {
		return "이메일 : " + email + " 비밀번호 : " + userpw + " 이름 : " + username;
	}
	
	public String disp() {
		return "이메일 : " + this.getEmail() + " 비밀번호 : " + this.getUserpw() + " 이름 : " + getUsername();
	}
}
