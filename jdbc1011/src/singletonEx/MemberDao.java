package singletonEx;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MemberDao {
	
	Scanner sc = new Scanner(System.in);
	
	Connection conn = null;
	PreparedStatement ps = null;
	ResultSet rs = null;
	
	DBConnect db = DBConnect.getInstance();
	
	// 화면내용
	
	int disp() {
		
		System.out.println("=======================================================================");
		System.out.println("1.회원 목록 | 2. 회원 가입 | 3. 회원 수정 | 4. 회원 삭제 | 5. 회원 검색 | 6. 종료");
		System.out.println("=======================================================================");
		System.out.println("메뉴를 선택해주세요. >> ");
		int menu = sc.nextInt();
		
		return menu;
	}
	
	// 회원 목록
	
	List<Member> getMembers() throws SQLException {
		
		System.out.println("1. 회원 목록");
		
		// 줄만들기
		List<Member> list = new ArrayList<Member>();
		conn = db.getConnection();
		
		String sql = "select * from member order by id desc;";
		
		ps = conn.prepareStatement(sql);
		
		rs = ps.executeQuery();
		
		while (rs.next()) {
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
		
		return list;
	}
	
	// 회원 가입
	
	int setMember() throws SQLException {
		
		System.out.println("2. 회원 가입");
		
		conn = db.getConnection();
		
		String sql = "insert into member values(null, ?, ?, ?, ?, ?, ?, now(), ?);";
		
		Member m = new Member();
		
		m.setEmail("email3@email.com");
		m.setPasswd("12345");
		m.setName("이과장");
		m.setDepart("HR");
		m.setPosition("과장");
		m.setSalary(2800000);
		m.setEndDate(null);
		
		ps = conn.prepareStatement(sql);
		
		ps.setString(1, m.getEmail());
		ps.setString(2, m.getPasswd());
		ps.setString(3, m.getName());
		ps.setString(4, m.getDepart());
		ps.setString(5, m.getPosition());
		ps.setInt(6, m.getSalary());
		ps.setString(7, m.getEndDate());
		
		int row = ps.executeUpdate();
		return row;
	}
	
	// 회원 수정
	
	int updateMember(int pk) throws SQLException {
		
		conn = db.getConnection();
		
		String sql = "update member set passwd = '2345' where id = ?";
		
		ps = conn.prepareStatement(sql);
		
		ps.setInt(1, pk);
		
		int row = ps.executeUpdate();
		
		return row;
	}
	
	// 회원 삭제
	
	int deleteMember(int pk) throws SQLException {
		
		conn = db.getConnection();
		
		String sql = "delete from member where id = ?";
		
		ps = conn.prepareStatement(sql);
		
		ps.setInt(1, pk);
		
		int row = ps.executeUpdate();
		
		return row;
	}
	
	// 회원 검색
	
	Member searchMember(int pk) throws SQLException {
		
		conn = db.getConnection();
		
		String sql = "select * from member where id = ?";
		
		ps = conn.prepareStatement(sql);
		
		ps.setInt(1, pk);
		
		rs = ps.executeQuery();
		
		Member m = null;
		
		if (rs.next()) {
			
			m = new Member();
			
			m.setId(rs.getInt(1));
			m.setEmail(rs.getString(2));
			m.setName(rs.getString(3));
			m.setPasswd(rs.getString(4));
			m.setDepart(rs.getString(5));
			m.setPosition(rs.getString(6));
			m.setSalary(rs.getInt(7));
			m.setStartDate(rs.getString(8));
			m.setEndDate(rs.getString(9));
		}
		
		return m;
	}
	
	// 종료
	
	void disconnect() {
		System.out.println("프로그램을 종료합니다.");
		System.exit(0);
	}
	
}
