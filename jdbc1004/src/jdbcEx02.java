import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class jdbcEx02 {

	public static void main(String[] args) {
		jdbcEx02 jdbc = new jdbcEx02();
		
		jdbc.run();
	}
	
	public void run() {
		try {
			// 1. ����̹� ���
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			
			// 2. ��������
			String url = "jdbc:mysql://localhost:3306/mydb";
			String id = "root";
			String pwd = "1234";
			
			Connection conn = DriverManager.getConnection(url, id, pwd);
			
			// conn : �����ͺ��̽��� ����Ǿ����ϱ�
			String sql = "insert into register values(102, '�質��', '1234')";
			
			// �� ������ ����� ������ �����ϴ� createStatement() ��ü ���
			
			Statement stmt = conn.createStatement();
			stmt.execute(sql);
			System.out.println("ȸ�������� �Ϸ�Ǿ����ϴ�.");
			
			// 4. execute();
			
			
			// 3. Ȯ��
			System.out.println("�����ͺ��̽� ����");
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}
