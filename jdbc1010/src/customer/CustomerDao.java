package customer;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CustomerDao {

	Connection conn = null;
	PreparedStatement ps = null;
	ResultSet rs = null;
	
	CustomerDao dao = null;
	
	// ���� ��ü
	Connection getConnection() {
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String url = "jdbc:mysql://localhost:3306/mydb";
			String id = "root";
			String pw = "1234";
			
			conn = DriverManager.getConnection(url, id, pw);
			
		}catch (Exception e) {
			e.printStackTrace();
		}

		
		return conn;
	}
	
	// �Է� ��ü
	void setCustomer() throws SQLException {
		
		CustomerDao dao = new CustomerDao();
		conn = dao.getConnection();
		
		String sql = "insert into customers values(?, ?, ?, ?, now())";
		
		ps = conn.prepareStatement(sql);
		
		Customer c = new Customer();
		
		c.setId(100);
		c.setName("ȫ�浿");
		c.setEmail("email@email.com");
		c.setSalary(1000000);
		
		ps.setInt(1, c.getId());
		ps.setString(2, c.getName());
		ps.setString(3, c.getEmail());
		ps.setInt(4, c.getSalary());
		
		int row = ps.executeUpdate();
		
		if (row > 0) {
			System.out.println("�� ��� �Ϸ�");
		}else {
			System.out.println("����");
		}
		
	}
	
	// ��� ��ü
	List<Customer> getCustomers() throws SQLException {
		
		// Collections �̿�
		// ����, ��ĭ -> �� ���� -> ��ü.add();
		List<Customer> list = new ArrayList<Customer>();
		
		dao = new CustomerDao();
		
		conn = dao.getConnection();
		
		String sql = "select * from customers order by id desc;";
		
		ps = conn.prepareStatement(sql);
		
		rs = ps.executeQuery();
		
		while(rs.next()) {
			
			Customer c = new Customer();
			
			c.setId(rs.getInt(1));
			c.setEmail(rs.getString(2));
			c.setName(rs.getString(3));
			c.setSalary(rs.getInt(4));
			c.setRegdate(rs.getString(5));
			
			list.add(c); // list 3�� ����
			
		}
		
		return list;
	}
	
}
