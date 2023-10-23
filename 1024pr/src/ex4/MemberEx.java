package ex4;

import java.util.List;

public class MemberEx {

	public static void main(String[] args) {
		
		MemberDao dao = new MemberDao();
		
		boolean run = true;
		
		while(run) {
			
			int menu = dao.disp();
			
			switch(menu) {
			case 1 : 
				
				int row = dao.setMember();
				
				if(row > 0) {
					System.out.println("\nȸ�������� �Ϸ�Ǿ����ϴ�.\n");
				}
				
				break;
				
			case 2 :
				
				List<Member> list = dao.getMember();
				
				if (list.isEmpty()) {
					System.out.println("\n���Ե� ȸ���� �����ϴ�.\n");
				}else {
					System.out.println("\n���Ե� ȸ���� " + list.size() + "�� �Դϴ�.");
					
					for(Member m : list) {
						System.out.println(m.toString());
					}
				}
				
				
				break;
				
			case 3 :
				System.out.println("\n���α׷��� �����մϴ�.\n");
				System.exit(0);
				break;
				
			default :
				System.out.println("\n�޴��� �ٽ� �������ּ���.\n");
				break;
			}
		}
		
		
		
		
	}

}
