package tut0921;

public class Register {
	// �ʵ�
	String email;
	String userpw;
	String username;
	
	// ������
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

	
	// �޼ҵ�
	
	@Override
	public String toString() {
		return "�̸��� : " + email + " ��й�ȣ : " + userpw + " �̸� : " + username;
	}
	
	public String disp() {
		return "�̸��� : " + this.getEmail() + " ��й�ȣ : " + this.getUserpw() + " �̸� : " + getUsername();
	}
}
