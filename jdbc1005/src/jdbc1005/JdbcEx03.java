package jdbc1005;

import java.sql.*;

class UpdateDao {
	
	Connection conn = null;
	Statement stmt = null;
	
	String url = "jdbc:mysql://localhost:3306/grp";
	String id = "root";
	String pw = "1234";
	
	void updateDB() {
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			conn = DriverManager.getConnection(url, id, pw);
			
			System.out.println("���� Ȯ��");
			
			stmt = conn.createStatement();
			
			String sql = "update member set com_name = '���־���Ƽ' where com_id = 1;";
			
			int result = stmt.executeUpdate(sql);
			
			if (result > 0) {
				System.out.println("ȸ�������� �����Ǿ����ϴ�.");
			} else {
				System.out.println("�����ڿ��� �����ϼ���.");
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	void deleteDB() {
		
		try {

			Connection conn = null;
			Statement stmt = null;
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			conn = DriverManager.getConnection(url, id, pw);
			
			stmt = conn.createStatement();
			
			String sql = "delete from member where com_id = 1;";
			
			int row = stmt.executeUpdate(sql);
			
			if (row > 0) {
				System.out.println("ȸ�������� �����Ǿ����ϴ�.");
			} else {
				System.out.println("������ �� �����ϴ�.\n�����ڿ��� �����ϼ���.");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
	
}

public class JdbcEx03 {

	public static void main(String[] args) {
		
		UpdateDao dao = new UpdateDao();
		
//		dao.updateDB();
		
		dao.deleteDB();
	}

}
