package tut06;

public class OperEx3 {

	public static void main(String[] args) {
		// 가입한 회원정보의 이메일과 비밀번호를 비교하여
		// 모두 일치하면 로그인 되었습니다.
		// 아니면 로그인 정보가 일치하지 않습니다.
		// 가입된 정보는 db 이메일, 비번
		// 로그인 할 때 입력하는 이메일, 비번
				
		String db_userid = "email@email.com";
		String db_userpw = "12345";
				
		String userid = "email@email.com";
		String userpw = "12345";
				
		boolean idCheck = db_userid.equals(userid);
		boolean pwCheck = db_userpw.equals(userpw);
				
		if (idCheck && pwCheck) {
			System.out.println("로그인 성공");
		}else {
			System.out.println("로그인 실패");
		}
				
		System.out.println(true && true);	// true
		System.out.println(true && false);	// false
		System.out.println(false && false);	// false
				
		System.out.println("");
				
		System.out.println(true || true);	// true
		System.out.println(true || false);	// true
		System.out.println(false || false);	// false
				
		System.out.println("");
				
		boolean result1 = true && true;
		System.out.println(!result1);
				
		if (result1) {
			System.out.println("위 결과는 참입니다.");
		}
			
		boolean result2 = true && false;
		System.out.println(result2);
				
		if (result2) {
			System.out.println("위 결과는 참입니다.");
		}// result2 가 거짓이기 때문에 아무것도 출력안됨

		boolean result3 = false && false;
		System.out.println(result3);
	}

}
