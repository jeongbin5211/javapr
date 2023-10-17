package JdbcEx05;

import java.sql.*;

class ItemCrud {
	
	void insertItem() {
		
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String url = "jdbc:mysql://localhost:3306/shop";
			String id = "root";
			String pw = "1234";
			
			conn = DriverManager.getConnection(url, id, pw);
			System.out.println("���� Ȯ��");
			
			String sql = "insert into items values(null, ?, ?, ?, now());";
			
			ps = conn.prepareStatement(sql);
			
			items item = new items();
			
			item.setItemName("����������");
			item.setItemPrice(10000);
			item.setItemStock(100);
			
			ps.setString(1, item.getItemName());
			ps.setInt(2, item.getItemPrice());
			ps.setInt(3, item.getItemStock());
			
			int row = ps.executeUpdate();
			
			if (row > 0) {
				System.out.println(item.getItemName() + " ��ǰ ����� �Ϸ�Ǿ����ϴ�.");
			}else {
				System.out.println("��ǰ ��Ͽ� �����Ͽ����ϴ�.");
			}
			
			String sql2 = "select * from items order by item_id desc;";
			
			ps = conn.prepareStatement(sql2);
			
			rs = ps.executeQuery(sql2);
			
			while (rs.next()) {
				System.out.println(rs.getInt(1));
				System.out.println(item.getItemName());
				System.out.println(item.getItemPrice());
				System.out.println(item.getItemStock());
				System.out.println(rs.getDate(5));
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	void selectDB() {
		
		try {
			
			Connection conn = null;
			PreparedStatement ps = null;
			ResultSet rs = null;
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String url = "jdbc:mysql://localhost:3306/shop";
			String id = "root";
			String pw = "1234";
			
			conn = DriverManager.getConnection(url, id, pw);
			
			String sql = "select * from items order by item_id desc;";
			
			ps = conn.prepareStatement(sql);
			
			rs = ps.executeQuery();
			
			
			
			while(rs.next()) {
				System.out.println(rs.getInt(1));
				System.out.println(rs.getString(2));
				System.out.println(rs.getInt(3));
				System.out.println(rs.getInt(4));
				System.out.println(rs.getDate(5));
				System.out.println("------------------------");
			}
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
}

public class itemsEx {

	public static void main(String[] args) {

		ItemCrud crud = new ItemCrud();
		
		crud.insertItem();
//		crud.selectDB();
	}

}
