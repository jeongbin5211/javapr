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
					System.out.println("���Ե� ȸ���� �����ϴ�.");
				}else {
					System.out.println("���Ե� ȸ���� " + list.size() + "�� �Դϴ�.");
					for(Member m : list) {
						System.out.println(m.toString());
					}
				}
				
				break;
				
			case 2 :
				
				int row = dao.setMember();
				if (row > 0) {
					System.out.println("ȸ�����ԿϷ�");
				}else {
					System.out.println("Fail");
				}
				
				break;
				
			case 3 :
				System.out.println("--------------------------");
				System.out.println("������ ȸ����ȣ�� �Է����ּ���. >> ");
				System.out.println("--------------------------");
				int id = sc.nextInt();
				
				int updateNum = dao.updateMember(id);
				if (updateNum > 0) {
					System.out.println("ȸ�������� �����Ͽ����ϴ�.");
				}else {
					System.out.println("Fail");
				}
				break;
				
			case 4 :
				System.out.println("----------------------------");
				System.out.println("������ ȸ����ȣ�� �Է����ּ���.");
				System.out.println("----------------------------");
				int deleteNum = sc.nextInt();
				
				int delete = dao.deleteMember(deleteNum);
				
				if(delete > 0) {
					System.out.println(deleteNum + "�� ȸ���� �����Ǿ����ϴ�.");
				}else {
					System.out.println("Fail");
				}
				
				
				break;
				
			case 5 :
				System.out.println("----------------------------");
				System.out.println("�˻��� ȸ����ȣ�� �Է����ּ���.");
				System.out.println("----------------------------");
				int searchNum = sc.nextInt();
				
				Member m = dao.searchMember(searchNum);
				
				if(m != null) {
					System.out.println(searchNum + "�� ȸ�������Դϴ�.");
					System.out.println(m.toString());
					
				}else {
					System.out.println("�˻��� ȸ���� �����ϴ�.");
				}
				break;
				
			case 6 :
				dao.disconnect();
				break;
				
			default :
				System.out.println("�޴��� �ٽ� �������ּ���.");
			}
		}

	}

}
