package set.SetEx04;

public class RegisterEx {

	public static void main(String[] args) {
		RegisterDao dao = new RegisterDao();
		
		dao.addRegister(new Register(100, "허정빈", "0626"));
		dao.addRegister(new Register(200, "이지윤", "0605"));
		
		dao.showInfo();
		
		boolean result = dao.removeRegister(100);
		
		if (result)
			System.out.println("삭제되었습니다.");
		else
			System.out.println("존재하지 않는 아이디입니다.");
		
		dao.showInfo();

	}

}
