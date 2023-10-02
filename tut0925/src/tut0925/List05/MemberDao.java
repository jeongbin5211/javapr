package tut0925.List05;

import java.util.ArrayList;
import java.util.List;

public class MemberDao {
	
	List<Member> list = null; 
	
	public MemberDao() {
		list = new ArrayList<Member>();
	}
	
	public void addMember(Member m) {
		list.add(m);
	}
	
	public void deleteMember(String id) {
		for (int i = 0; i < list.size(); i++) {
			if (id.equals(list.get(i).getUserid())) {
				list.remove(i);
				System.out.println(id + " 회원님을 삭제하였습니다.");
			}
		}
	}
	
	public void showInfo() {
		for (Member m : list) {
			m.disp();
		}
		
		// 배열번호가 필요할때
//		for (int i = 0; i < list.size(); i++) {
//			list.get(i).disp();
//		}
	}
}
