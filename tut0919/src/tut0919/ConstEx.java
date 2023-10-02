package tut0919;

class Const {
	// default 생성자 생략 가능, 그 외 생성자는 만들어서 사용해야 합니다.
//	public Const() {
//		
//	}
//	
//	public Const(String str) { // 오버로딩 때문에 오류가 사라짐
//		System.out.println(str);
//	}
//	
//	public Const(String str, String domain) {
//		System.out.println(str + ", " + domain);
//	}
	
	// 2번에서 사용할 메소드
	public Const(String str) {
		System.out.println(str);
	}
	
//	public void add(int a, int b) {
//		System.out.println(a + b);
//	}
	
	// or
	
	public int add(int a, int b) {
		return a + b;
	}
	
	public String close(String str) {
		return str;
	}
	
	// 3번에서 사용 (tel 추가)
	public Const(String str, String tel) {
		this(str);
		System.out.println(tel);
	}
	
	public Const(String str, String tel, String addr) {
		this(str,tel);
		System.out.println(addr);
	}
}

public class ConstEx {

	public static void main(String[] args) {
//		Const c = new Const();
//		
//		// 초기값 : 프로그램 시작시 코리아아이티 출력 -> 작업
//		Const c2 = new Const("코리아아이티");
//		
//		// 추가적인 작업을 할 때
//		// 코리아아이티, 도메인 출력
//		Const c3 = new Const("코리아아이티", "도메인");
		
		// 2.
		// 코리아아이티 계산기 Ver1.0 출력
		// 정수 + 정수 = 정수 메소드
		// 프로그램 종료 = 메소드
		Const cal = new Const("코리아아이티 계산기 Ver1.0");
		cal.add(1, 2); 
		System.out.println(cal.add(1, 2)); // 3
		System.out.println(cal.close("프로그램을 종료합니다."));
		
		// 3. 코리아아이티, 전화번호 추가
		Const seoul = new Const("코리아아이티", "051-1234-5678");
		
		// 4. 코리아아이티, 전화번호, 주소 추가
		Const gwangju = new Const("코리아아이티", "00000", "광주");
	}

}
