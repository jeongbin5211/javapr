package lamda;

// 인터페이스 만들기 : 두 개의 문자열 매개변수
interface ConcatStr {
	void makeConcat(String s1, String s2);
}

// 구현 : 강제 오버라이딩 한 후 메인메소드에서 실행

class ConcatStrImpl implements ConcatStr {

	@Override
	public void makeConcat(String s1, String s2) {
		
		System.out.println(s1 + s2);
		
	}

	
	
}

public class LambdaEx6 {

	public static void main(String[] args) {
		
		ConcatStrImpl constr = new ConcatStrImpl();
		
		constr.makeConcat("안녕", "하세요");
		
		System.out.println("------------------------------");
		
		// 람다식으로
		
		ConcatStr cs = (str1, str2) -> {
			System.out.println(str1 + str2);
		};
		
		cs.makeConcat("안녕하", "세요.");
	}

}
