package tut07;

public class HelloEx3 {

	// 접근제한자 리턴타입 메소드(매개변수) { // 이것만으로는 화면출력 안됨
	// 	  return;
	// }
	
	public String title(String local) {
		return local + " 코리아아이티 아카데미";
	}
	
	public static void main(String[] args) {
		
		// 코리아아이티 아카데미
		// 전화번호, 주소
		// 코리아아이티 아카데미 
		
		// 클래스안에 메소드를 가져오기위해 작성
		HelloEx3 he = new HelloEx3();
//		he.title(); // 출력안됨
		
		// 출력하려면
		System.out.println(he.title("부산")); // 부산 코리아아이티 아카데미
		
		// 서울로 변경
		System.out.println(he.title("서울")); // 서울 코리아아이티 아카데미
		
		// 광주로 변경
		System.out.println(he.title("광주")); // 광주 코리아아이티 아카데미

	}

}
