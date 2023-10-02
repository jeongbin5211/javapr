package tut03;

public class StringEx3 {

	public static void main(String[] args) {
		// 같은 타입을 이름 하나로 많은 데이터를 다루기 위해 필요 - 배열[] + for
		// 다른 타입을 다루기 위해서는 객체를 사용합니다. - for 사용
		
		// 소문자 -> 대문자로 바꾸기
		// toUpperCase();
		
		String title = "korea it academy";
//		"korea it academy".toUpperCase(); -> 하드코딩, 좋지 않은 방법
		
		System.out.println(title.toUpperCase()); // KOREA IT ACADEMY
		
		System.out.println("--------------------------");
		
		String menues = "Home,Company,Contact,Help"; // 구분자는 , : ; 중 원하는걸로 사용 가능합니다.
		
		System.out.println(menues.split(",")); // 메모리 주소가 출력됨 -> [Ljava.lang.String;@70177ecd
		
		String[] s = menues.split(",");
		System.out.println(s[0]); // Home
		System.out.println(s[1]); // Company
		System.out.println(s[2]); // Contact
		
//		모든 인덱스 한번에 추출하는 법
//		for (데이터타입 별명 : 배열이름) {
//			출력코드
//		}
		
		for (String result : s) {
			System.out.println(result);
		}
//		모든 인덱스 요소들이 출력됨
//		Home
//		Company
//		Contact
//		Help
		
		// 두번째 방법
//		for (int i = 0; i < 배열명.length; i++) {
//			출력코드
//		}
		
		for (int i = 0; i < s.length; i++) {
			System.out.println(s[i]);
		}
		
		// for문을 사용하는 이유는 배열이 추가될 때 관리가 용이하기 때문이다.
		// 그냥 관리하면 하나하나 출력해야함
		
		System.out.println("--------------------------");
		
		// 정수 생성 후 초기값은 100
		// 출력 : 생성된 변수의 초기값은 100입니다.
		int num = 100;
		System.out.println("생성된 변수의 초기값은 " + num + "입니다.");
		
		// printf() : C언어의 표준 출력 함수로, 여러 종류의 데이터를 다양한 서식에 맞춰 출력할 수 있게 해줍니다.
		// printf() 에서 f는 format
		// %d -> decimal : 10진수
		System.out.printf("생성된 변수의 초기값은 %d 입니다.", num);
		
		// %s -> string
		String str = "부산";
		
		System.out.println();
		System.out.printf("내가 사는곳은 %s입니다.", str);
	}

}
