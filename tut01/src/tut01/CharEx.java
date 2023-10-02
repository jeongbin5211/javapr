/* 
1. 프로그램명 : 
2. 작 성 일 : 2023.09.08
3. 작 성 자 : 허정빈
4. 내	용 : 
*/

package tut01;

public class CharEx {

	public static void main(String[] args) {
		char c = 'a';
		String str = "b";
		int ch = 'a';
		
		System.out.println(c);
		System.out.println(str);
		System.out.println(ch + 1); // 98(아스키코드b)
		System.out.println((char)(ch + 1)); // 98을 문자형으로 변환

		System.out.println("----------------------");
		
		// 회원가입 했을 때 저장된 아이디, 비밀번호
		String userid = "koreait";
		String userpw = "12345";
		
		//내가 입력한 아이디, 비밀번호
		String userid2 = "jinhae";
		String userpw2 = "2345";
		
		// A.equals("B"); A와 B의 값이 같으면
		// 확인 => if -> 맞으면 로그인되었습니다. 아니면 다시 로그인해주세요.
		
		if (!userid.equals(userid2)) {
			System.out.println("로그인 성공!");
		} else {
			System.out.println("다시 로그인 해주세요.\n회원가입 해주세요.");
		}
		
	}

}
