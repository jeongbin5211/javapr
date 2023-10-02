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
		System.out.println("���̵� : " + userid + ", ��й�ȣ : " + userpw);
	}
}

public class SetEx03 {

	public static void main(String[] args) {
		
		// �����ڷ� add �ϱ�
		Set<Member> set = new HashSet<Member>();
		
		set.add(new Member("������", "1111"));
		set.add(new Member("������", "2222"));
		set.add(new Member("������", "3333"));
		
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
