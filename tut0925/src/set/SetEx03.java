package set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

class Member {
	private String userid;
	private String userpw;
	
	public void Member() {
		
	}

	public Member(String userid, String userpw) {
		this.userid = userid;
		this.userpw = userpw;
	}
	
	public void disp() {
		System.out.println("아이디 : " + userid + ", 비밀번호 : " + userpw);
	}
}

public class SetEx03 {

	public static void main(String[] args) {
		
		// 생성자로 add 하기
		Set<Member> set = new HashSet<Member>();
		
		set.add(new Member("허정빈", "1111"));
		set.add(new Member("이지윤", "2222"));
		set.add(new Member("나박이", "3333"));
		
		for (Member m : set) {
			m.disp();
		}
		
		System.out.println("----------------------");
		// Iterator
		
		Iterator<Member> ir = set.iterator();
		while(ir.hasNext()) {
			ir.next().disp();
		}
		
		

	}

}
