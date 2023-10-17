package customer;

import java.sql.SQLException;
import java.util.List;

public class CustomerEx {

	public static void main(String[] args) throws SQLException {
		CustomerDao dao = new CustomerDao();
		
//		dao.setCustomer();
		
		List<Customer> list = dao.getCustomers();
		
		if (list.isEmpty()) {
			System.out.println("��ϵ� ���� �����ϴ�.");
		} else {
			for (Customer c : list) {
				System.out.println(c.toString());
			}
		}

	}

}
