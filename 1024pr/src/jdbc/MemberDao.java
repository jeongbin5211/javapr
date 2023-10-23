package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MemberDao {
	
	Scanner sc = new Scanner(System.in);
	
	Connection conn = null;
	PreparedStatement ps = null;
	ResultSet rs = null;
	
	int disp() {
		System.out.println("1.입력 | 2.출력");
		System.out.print("메뉴를 선택해주세요. >> ");
		int menu = sc.nextInt();
		return menu;
		
	}
	
	int setMember() {
		
		int row = 0;
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");

			String url = "jdbc:mysql://localhost:3306/mydb";
			String id = "root";
			String pw = "1234";
			
			conn = DriverManager.getConnection(url, id, pw);
			
			String sql = "insert into member values(null, ?, ?, ?, ?, ?, ?, now(), now());";
			
			Member m = new Member();
			
			m.setEmail("email@email.com");
			m.setPasswd("1234");
			m.setName("허정빈");
			m.setDepart("인사과");
			m.setPosition("대리");
			m.setSalary(2000000);
			
			ps = conn.prepareStatement(sql);
			
			ps.setString(1, m.getEmail());
			ps.setString(2, m.getPasswd());
			ps.setString(3, m.getName());
			ps.setString(4, m.getDepart());
			ps.setString(5, m.getPosition());
			ps.setInt(6, m.getSalary());
			
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
			
			String url = "jdbc:mysql://localhost:3306/mydb";
			String id = "root";
			String pw = "1234";
			
			conn = DriverManager.getConnection(url, id, pw);
			
			String sql = "select * from member;";
			
			ps = conn.prepareStatement(sql);
			
			rs = ps.executeQuery();
			
			while(rs.next()) {
				Member m = new Member();
				
				m.setId(rs.getInt(1));
				m.setEmail(rs.getString(2));
				m.setPasswd(rs.getString(3));
				m.setName(rs.getString(4));
				m.setDepart(rs.getString(5));
				m.setPosition(rs.getString(6));
				m.setSalary(rs.getInt(7));
				m.setStartDate(rs.getString(8));
				m.setEndDate(rs.getString(9));
				
				list.add(m);
			}
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		return list;
	}
	
}
