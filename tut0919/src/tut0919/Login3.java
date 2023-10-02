package tut0919;

import java.time.LocalDate;

public class Login3 {
	// 1. 필드
	private String email;
	private String userpw;
	private LocalDate now = LocalDate.now();
	
	// 2. 생성자
	public Login3() {
		System.out.println("로그인 정보를 출력합니다.");
	}
	
	// 3. getter, setter
	
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
	
	public LocalDate getNow() {
		return now;
	}
	// 4. 메소드
	@Override
	public String toString() {
		return "Login3 [usermail=" + email + ", userpw=" + userpw + ", now=" + now + "]";
	}
}
