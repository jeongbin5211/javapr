package set.SetEx04;

public class Register {
	private int id;
	private String userid;
	private String userpw;
	
	public Register() {}

	public Register(int id, String userid, String userpw) {
		this.id = id;
		this.userid = userid;
		this.userpw = userpw;
	}
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

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
	
	public void disp() {
		System.out.println("ȸ����ȣ : " + id + ", ȸ�����̵� : " + userid + ", ȸ����й�ȣ : " + userpw);
	}
	
}
