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
					System.out.println("회원가입이 완료되었습니다.");
				}else {
					System.out.println("다시 시도");
				}
				
				break;
				
			case 2 : 
				List<Member> list = dao.getMember();
				
				if(list.isEmpty()) {
					System.out.println("등록된 멤버가 없습니다.");
				}else {
					System.out.println("가입된 멤버는 " + list.size() + "명 입니다.");
					for (Member m : list) {
						System.out.println(m.toString());
					}
				}
				
				break;
				
			default :
				System.out.println("메뉴를 다시 선택하세요.");
			
			}
		}
		
		
		
	}

}
