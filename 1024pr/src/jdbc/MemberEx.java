package jdbc;

import java.util.List;

public class MemberEx {

	public static void main(String[] args) {

		MemberDao dao = new MemberDao();
		
		
		boolean run = true;
		
		while(run) {
			
			int menu = dao.disp();
			
			switch (menu) {
			
			case 1 :
				
				int row = dao.setMember();
				
				if (row > 0) {
					System.out.println("ȸ�������� �Ϸ�Ǿ����ϴ�.");
				}else {
					System.out.println("�ٽ� �õ�");
				}
				
				break;
				
			case 2 : 
				List<Member> list = dao.getMember();
				
				if(list.isEmpty()) {
					System.out.println("��ϵ� ����� �����ϴ�.");
				}else {
					System.out.println("���Ե� ����� " + list.size() + "�� �Դϴ�.");
					for (Member m : list) {
						System.out.println(m.toString());
					}
				}
				
				break;
				
			default :
				System.out.println("�޴��� �ٽ� �����ϼ���.");
			
			}
		}
		
		
		
	}

}
