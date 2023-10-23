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
					System.out.println("\n회원가입이 완료되었습니다.\n");
				}
				
				break;
				
			case 2 :
				
				List<Member> list = dao.getMember();
				
				if (list.isEmpty()) {
					System.out.println("\n가입된 회원이 없습니다.\n");
				}else {
					System.out.println("\n가입된 회원은 " + list.size() + "명 입니다.");
					
					for(Member m : list) {
						System.out.println(m.toString());
					}
				}
				
				
				break;
				
			case 3 :
				System.out.println("\n프로그램을 종료합니다.\n");
				System.exit(0);
				break;
				
			default :
				System.out.println("\n메뉴를 다시 선택해주세요.\n");
				break;
			}
		}
		
		
		
		
	}

}
