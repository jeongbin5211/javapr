package set.SetEx04;

public class RegisterEx {

	public static void main(String[] args) {
		RegisterDao dao = new RegisterDao();
		
		dao.addRegister(new Register(100, "������", "0626"));
		dao.addRegister(new Register(200, "������", "0605"));
		
		dao.showInfo();
		
		boolean result = dao.removeRegister(100);
		
		if (result)
			System.out.println("�����Ǿ����ϴ�.");
		else
			System.out.println("�������� �ʴ� ���̵��Դϴ�.");
		
		dao.showInfo();

	}

}
