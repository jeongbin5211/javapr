import java.sql.DriverManager;

public class jdbcEx01 {

	public static void main(String[] args) {
		
		jdbcEx01 jdbc = new jdbcEx01();
		jdbc.mysqlConnect();
	}

	void mysqlConnect() { // ���� ����
		try {
			// 1. jdbc ���� : Class.forName();
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// 2. �������� : Connection
			String url = "jdbc:mysql://localhost:3306/shop";
			String id = "root";
			String pwd = "1234";
			
			DriverManager.getConnection(url, id, pwd);
			
			// 3. Ȯ��
			System.out.println("�����ͺ��̽� ���� �Ϸ�");
			
		}catch (Exception e) {
			System.out.println("���� : " + e);
		}
	}
}
