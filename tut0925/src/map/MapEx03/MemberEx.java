package map.MapEx03;

public class MemberEx {

	public static void main(String[] args) {
		// List : �� + Member ĭ =>
		// ȫ�浿, 1234 => List<Member>
		// ȫ�浿, 1234 => List<Member>
		// ȫ�浿, 1234 => List<Member>
		// ������ ���� �迭��.get(i); �迭��.add()
		
		// Map�� ������ ���� key�� ���� ����(�ݺ��� ���x), �迭��.put
		
		MemberDao dao = new MemberDao();
		
		dao.putMember("u1", new Member("ȫ�浿", "1111"));
		
		dao.showInfo();
		
//		dao.deleteMember("u1");
		
		boolean result = dao.deleteMember("u1");
		if (result)
			System.out.println("�����Ǿ����ϴ�.");
		else
			System.out.println("�������� �ʴ� key�Դϴ�.");
		
		dao.showInfo();
	}

}
