package tut0922.Member;

public class MemberEx {

	public static void main(String[] args) {
		Member member1 = new Member(1001, "ȫ�浿");
		
		Member member2 = new Member(2001, "��ö��");
		
		Member member3 = new Member(3001, "�質��");
		
		MemberDao dao = new MemberDao();
		
		dao.addMember(member1);
		dao.addMember(member2);
		dao.addMember(member3);
		
		dao.showMember();
		
		dao.deleteMember(1001);
		
		System.out.println("ȸ�� ������ �˻��մϴ�...");
		System.out.println("�˻��� ȸ�� ���̵� �Է��ϼ���");
		
		dao.findById(3001);

	}

}
