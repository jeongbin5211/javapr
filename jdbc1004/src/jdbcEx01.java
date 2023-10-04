import java.sql.DriverManager;

public class jdbcEx01 {

	public static void main(String[] args) {
		
		jdbcEx01 jdbc = new jdbcEx01();
		jdbc.mysqlConnect();
	}

	void mysqlConnect() { // 접속 동작
		try {
			// 1. jdbc 연결 : Class.forName();
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// 2. 연결정보 : Connection
			String url = "jdbc:mysql://localhost:3306/shop";
			String id = "root";
			String pwd = "1234";
			
			DriverManager.getConnection(url, id, pwd);
			
			// 3. 확인
			System.out.println("데이터베이스 연결 완료");
			
		}catch (Exception e) {
			System.out.println("오류 : " + e);
		}
	}
}
