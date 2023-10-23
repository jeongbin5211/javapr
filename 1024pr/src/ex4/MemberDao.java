package ex4;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MemberDao {
	
	Scanner sc = new Scanner(System.in);
	
	Connection conn = null;
	PreparedStatement ps = null;
	ResultSet rs = null;
	
	String url = "jdbc:mysql://localhost:3306/mydb";
	String id = "mydb";
	String pw = "1234";
	
	int disp() {
		System.out.println("==================================");
		System.out.println("         ȸ������ ���α׷�");
		System.out.println("");
		System.out.println("1.ȸ������ | 2.ȸ����� | 3.���α׷� ����");
		System.out.println("==================================");
		System.out.print("�޴��� �������ּ���. >> ");
		int menu = sc.nextInt();
		return menu;
	}
	
	int setMember() {
		
		int row = 0;
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			
			
			conn = DriverManager.getConnection(url, id, pw);
//			System.out.println("����Ȯ��");
			
			String sql = "insert into member values(null, ?, ?, ?, now());";
			
			Member m = new Member();
			
			m.setMem_name("ȫ�浿");
			m.setMem_pw("1234");
			m.setMem_salary(1000000);
			
			ps = conn.prepareStatement(sql);
			
			ps.setString(1, m.getMem_name());
			ps.setString(2, m.getMem_pw());
			ps.setInt(3, m.getMem_salary());
			
			row = ps.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return row;
		
	}
	
	List<Member> getMember() {
		
		List<Member> list = new ArrayList<Member>();
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			conn = DriverManager.getConnection(url, id, pw);
			
			String sql = "select * from member order by mem_id desc;";
			
			ps = conn.prepareStatement(sql);
			
			rs = ps.executeQuery();
			
			while(rs.next()) {
				
				Member m = new Member();
				
				m.setMem_id(rs.getInt(1));
				m.setMem_name(rs.getString(2));
				m.setMem_pw(rs.getString(3));
				m.setMem_salary(rs.getInt(4));
				m.setMem_regdate(rs.getString(5));
				
				list.add(m);
				
			}
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		return list;
	}
}
