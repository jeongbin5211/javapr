package tut0922.Member;

import java.util.ArrayList;
import java.util.List;

public class MemberDao {
	List<Member> list = null;
	
	public MemberDao() {
		list = new ArrayList<>();
	}
	
	// method
	
	public void addMember(Member m) {
		list.add(m);
	}
	
	public void showMember() {
		for (Member mem : list) {
			System.out.println(mem);
		}
	}
	
	public void deleteMember(int id) {
		// ���� �ڷ� -> id -> remove(�迭��ȣ)
		// ���� �ڷ� -> memberID == id -> �迭.remove(�迭��ȣ)
		
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getMemberID() == id) {
				list.remove(i);
				System.out.println(id + "ȸ����ȣ�� �����Ͽ����ϴ�.");
			} else {
				System.out.println(id + "�� �������� �ʴ� ȸ����ȣ �Դϴ�.");
			}
		}
	}
	
	public void findById(int searchID) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getMemberID() == searchID) {
				Member m = list.get(i);
				System.out.println("�˻��� ȸ���� ����մϴ�.");
				System.out.println("ȸ�����̵� : " + m.getMemberID() + " ȸ���̸� : " + m.getMemberName());
			}
		}
	}
}
