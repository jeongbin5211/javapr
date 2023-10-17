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
	
	// ȭ�鳻��
	
	int disp() {
		
		System.out.println("=======================================================================");
		System.out.println("1.ȸ�� ��� | 2. ȸ�� ���� | 3. ȸ�� ���� | 4. ȸ�� ���� | 5. ȸ�� �˻� | 6. ����");
		System.out.println("=======================================================================");
		System.out.println("�޴��� �������ּ���. >> ");
		int menu = sc.nextInt();
		
		return menu;
	}
	
	// ȸ�� ���
	
	List<Member> getMembers() throws SQLException {
		
		System.out.println("1. ȸ�� ���");
		
		// �ٸ����
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
	
	// ȸ�� ����
	
	int setMember() throws SQLException {
		
		System.out.println("2. ȸ�� ����");
		
		conn = db.getConnection();
		
		String sql = "insert into member values(null, ?, ?, ?, ?, ?, ?, now(), ?);";
		
		Member m = new Member();
		
		m.setEmail("email3@email.com");
		m.setPasswd("12345");
		m.setName("�̰���");
		m.setDepart("HR");
		m.setPosition("����");
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
	
	// ȸ�� ����
	
	int updateMember(int pk) throws SQLException {
		
		conn = db.getConnection();
		
		String sql = "update member set passwd = '2345' where id = ?";
		
		ps = conn.prepareStatement(sql);
		
		ps.setInt(1, pk);
		
		int row = ps.executeUpdate();
		
		return row;
	}
	
	// ȸ�� ����
	
	int deleteMember(int pk) throws SQLException {
		
		conn = db.getConnection();
		
		String sql = "delete from member where id = ?";
		
		ps = conn.prepareStatement(sql);
		
		ps.setInt(1, pk);
		
		int row = ps.executeUpdate();
		
		return row;
	}
	
	// ȸ�� �˻�
	
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
	
	// ����
	
	void disconnect() {
		System.out.println("���α׷��� �����մϴ�.");
		System.exit(0);
	}
	
}
