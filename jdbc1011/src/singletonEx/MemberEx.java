package singletonEx;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class MemberEx {

	public static void main(String[] args) throws SQLException {
		
		MemberDao dao = new MemberDao();
		
		Scanner sc = new Scanner(System.in);
		
		boolean run = true;
		
		while(run) {
			
			int menu = dao.disp();
			
			switch(menu) {
			
			case 1 :
				
				List<Member> list = dao.getMembers();
				if (list.isEmpty()) {
					System.out.println("가입된 회원이 없습니다.");
				}else {
					System.out.println("가입된 회원은 " + list.size() + "명 입니다.");
					for(Member m : list) {
						System.out.println(m.toString());
					}
				}
				
				break;
				
			case 2 :
				
				int row = dao.setMember();
				if (row > 0) {
					System.out.println("회원가입완료");
				}else {
					System.out.println("Fail");
				}
				
				break;
				
			case 3 :
				System.out.println("--------------------------");
				System.out.println("수정할 회원번호를 입력해주세요. >> ");
				System.out.println("--------------------------");
				int id = sc.nextInt();
				
				int updateNum = dao.updateMember(id);
				if (updateNum > 0) {
					System.out.println("회원정보를 수정하였습니다.");
				}else {
					System.out.println("Fail");
				}
				break;
				
			case 4 :
				System.out.println("----------------------------");
				System.out.println("삭제할 회원번호를 입력해주세요.");
				System.out.println("----------------------------");
				int deleteNum = sc.nextInt();
				
				int delete = dao.deleteMember(deleteNum);
				
				if(delete > 0) {
					System.out.println(deleteNum + "번 회원이 삭제되었습니다.");
				}else {
					System.out.println("Fail");
				}
				
				
				break;
				
			case 5 :
				System.out.println("----------------------------");
				System.out.println("검색할 회원번호를 입력해주세요.");
				System.out.println("----------------------------");
				int searchNum = sc.nextInt();
				
				Member m = dao.searchMember(searchNum);
				
				if(m != null) {
					System.out.println(searchNum + "번 회원정보입니다.");
					System.out.println(m.toString());
					
				}else {
					System.out.println("검색된 회원이 없습니다.");
				}
				break;
				
			case 6 :
				dao.disconnect();
				break;
				
			default :
				System.out.println("메뉴를 다시 선택해주세요.");
			}
		}

	}

}
