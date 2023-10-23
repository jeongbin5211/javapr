package ex4;

public class Member {
	private int mem_id;
	private String mem_name;
	private String mem_pw;
	private int mem_salary;
	private String mem_regdate;
	
	public Member() {}
	
	public int getMem_id() {
		return mem_id;
	}
	public void setMem_id(int mem_id) {
		this.mem_id = mem_id;
	}
	public String getMem_name() {
		return mem_name;
	}
	public void setMem_name(String mem_name) {
		this.mem_name = mem_name;
	}
	public String getMem_pw() {
		return mem_pw;
	}
	public void setMem_pw(String mem_pw) {
		this.mem_pw = mem_pw;
	}
	public int getMem_salary() {
		return mem_salary;
	}
	public void setMem_salary(int mem_salary) {
		this.mem_salary = mem_salary;
	}
	public String getMem_regdate() {
		return mem_regdate;
	}
	public void setMem_regdate(String mem_regdate) {
		this.mem_regdate = mem_regdate;
	}
	@Override
	public String toString() {
		return "Member [mem_id=" + mem_id + ", mem_name=" + mem_name + ", mem_pw=" + mem_pw + ", mem_salary="
				+ mem_salary + ", mem_regdate=" + mem_regdate + "]";
	}
	
	
}
