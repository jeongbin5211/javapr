package tut0919;

import java.time.LocalDate;

public class Login3 {
	// 1. �ʵ�
	private String email;
	private String userpw;
	private LocalDate now = LocalDate.now();
	
	// 2. ������
	public Login3() {
		System.out.println("�α��� ������ ����մϴ�.");
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
	// 4. �޼ҵ�
	@Override
	public String toString() {
		return "Login3 [usermail=" + email + ", userpw=" + userpw + ", now=" + now + "]";
	}
}
