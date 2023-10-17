package myinfo;

import java.sql.*;

class Myinfo {
	private String userid;
	private String userpw;
	private int age;
	
	public Myinfo() {
		
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getUserpw() {
		return userpw;
	}

	public void setUserpw(String userpw) {
		this.userpw = userpw;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Myinfo [userid=" + userid + ", userpw=" + userpw + ", age=" + age + "]";
	}
	
	
	
}

class InsertDB {
	
	void insertQuery() {
		
		// 연결(Connection), SQL실행(PreparedStatement), (결과출력)
		
		try {
			
			Connection conn = null;
			PreparedStatement ps = null;
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String url = "jdbc:mysql://localhost:3306/mydb";
			String id = "root";
			String pw = "1234";
			
			conn = DriverManager.getConnection(url, id, pw);
			
			String sql = "insert into myinfo values(?, ?, ?);";
			
			ps = conn.prepareStatement(sql);
			
			Myinfo info = new Myinfo();
			
			info.setUserid("홍길동");
			info.setUserpw("1234");
			info.setAge(20);
			
			ps.setString(1, info.getUserid());
			ps.setString(2, info.getUserpw());
			ps.setInt(3, info.getAge());
			
			int row = ps.executeUpdate();
			
			if (row > 0) {
				System.out.println("회원등록이 완료되었습니다.");
				System.out.println(info.getUserid() + "님 환영합니다.");
			} else {
				System.out.println("실패");
			}
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	void selectDB() throws ClassNotFoundException, SQLException {
		
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		String url = "jdbc:mysql://localhost:3306/mydb";
		String id = "root";
		String pw = "1234";
		
		conn = DriverManager.getConnection(url, id, pw);
		
		String sql = "select * from myinfo order by userid asc;";
		
		ps = conn.prepareStatement(sql);
		
		rs = ps.executeQuery();
		
		while(rs.next()) {
			Myinfo info = new Myinfo();
			
			info.setUserid(rs.getString(1));
			info.setUserpw(rs.getString(2));
			info.setAge(rs.getInt(3));
			
			System.out.println(info.toString());
			System.out.println(info.getUserid());
			System.out.println(info.getUserpw());
			System.out.println(info.getAge());
		}
		
	}
}

public class MyinfoEx {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		InsertDB insert = new InsertDB();
		
//		insert.insertQuery();
		insert.selectDB();

	}

}
