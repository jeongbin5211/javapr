package tut0925.List05;


public class MemberEx {

	public static void main(String[] args) {
		
		MemberDao dao = new MemberDao();
		
		dao.addMember(new Member("������", "0626"));
		dao.addMember(new Member("������", "0605"));
		
		dao.showInfo();
		
		dao.deleteMember("������");
		
		dao.showInfo();
		
	}

}
