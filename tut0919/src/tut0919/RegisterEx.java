package tut0919;

class Register { // 필드 -> 생성자 -> getter, setter -> 메소드 
	
	// 1. 필드
//		String userid;
//		String userpw;
//		int point;
	
	// 4. private
//		private String userid;
//		private String userpw;
//		private int point;
	
		
		// 2. 생성자
//		public Register() {} // default 생성자(생략가능)
		
//		public Register(String title) {
//			System.out.println(title);
//		}
	
		// 3.
//		public Register(String uid, String upw, int p) {
//			userid = uid;
//			userpw = upw;
//			point = p;
//		}
		
//		public Register(String userid, String userpw, int point) {
//			this.userid = userid;
//			this.userpw = userpw;
//			this.point = point;
//		}
		
		
		
}

public class RegisterEx { 
	
	private String userid;
	private String userpw;
	private int point;
	
	public RegisterEx(String userid, String userpw, int point) {
		this.userid = userid;
		this.userpw = userpw;
		this.point = point;
	}
	
	public static void main(String[] args) {
		
		// 회원가입 프로그램 : 객체 = 회원 1명 정보
		// 아이디(String), 비번(String), 포인트(int)를 저장하고 출력하는 프로그램
		
		// 1. 필드에 직접 값을 입력
//		RegisterEx person = new RegisterEx(); // 빈 생성자
//		
//		person.userid = "koreait";
//		person.userpw = "12345";
//		person.point = 1000;
		
		// 2. 생성자 - public으로 시작하고 class이름과 같아야함
		
//		Register person = new Register("회원가입을 진행합니다.");
		
		// 3.
//		Register p1 = new Register("koreait", "12345", 1000);
//		System.out.println(p1.userid);
//		System.out.println(p1.userpw);
//		System.out.println(p1.point);
		
		// 4. private
		RegisterEx p1 = new RegisterEx("koreait", "12345", 1000);
		System.out.println(p1.userid);
		System.out.println(p1.userpw);
		System.out.println(p1.point);
		// private 때문에 값을 못넣음(같은 public클래스 내에 있을 시 접근 가능)
		

	}

}
