package emp;

import java.util.Scanner;

import emp.service.EmployeeSrv;

public class EmployeeEx {

	public static void main(String[] args) {
		EmployeeSrv srv = new EmployeeSrv();
		
		boolean run = true;
		
		Scanner sc = new Scanner(System.in);
		
		while (run) {
			srv.menu();
			int menu = sc.nextInt();
			
			switch (menu) {
			case 1:
				srv.empCreate();
				break;
				
			case 2:
				srv.empAdd();
				break;
				
			case 3:
				srv.empList();
				break;
				
			case 4:
				System.out.println("프로그램 종료");
				System.exit(0);
				break;
				
			default :
				System.out.println("메뉴를 다시 선택해 주세요.");
				
			}
		}

	}

}
