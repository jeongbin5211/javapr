package emp.service;

import java.util.Scanner;

import emp.vo.Employee;

public class EmployeeSrv {
	
	Scanner sc = new Scanner(System.in);
	Employee[] emp = null; 
	
	public void menu() {
		// 1. ������� | 2.������ | 3.������ | 4.����
		System.out.println("1. �������"); // empCreate
		System.out.println("2. ������"); // empAdd
		System.out.println("3. ������"); // empList
		System.out.println("4. Exit");
		System.out.print("�޴��� �������ּ���. >> ");
		
	}
	
	public void empCreate() {
		System.out.println("\n��� ���� ������\n");
		System.out.print("����� ��� �� >> ");
		int count = sc.nextInt();
		emp = new Employee[count];
		
		System.out.println(emp.length + "���� ����� ��ϰ����մϴ�.");
		
	}
	
	public void empAdd() {
		System.out.println("\n��� ��� ������\n");
		System.out.println(emp.length + "���� ����� ����մϴ�.");
		
		for (int i = 0; i < emp.length; i++) {
			emp[i] = new Employee(1001L, "�λ��", "������", 1000000);
			
			System.out.println("\n����� ��ϵǾ����ϴ�.\n");
		}
	}
	
	public void empList() {
		System.out.println("\n��� ��� ������\n");
		System.out.println(emp.length + "���� ��� ����� ����մϴ�.");
		
//		for (int i = 0; i < emp.length; i++) {
//			System.out.println(emp[i]);
//		}
		
		// ���� for
//		for (���Ÿ�� ���� : �迭��) {
//			����ڵ�(����)
//		}
		
		for (Employee person : emp) {
			System.out.println(person);
		}
	}

}
