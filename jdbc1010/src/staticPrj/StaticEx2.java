package staticPrj;

class Shop {
	
	static int number = 100; // static ���̸� ����
	String userid;
	String userpw;
	
	// ���̵�, ����� �����ڿ� �Է��ϸ� number�� �ڵ����� 1�� ����
	
	public Shop(String userid, String userpw) {
		this.userid = userid;
		this.userpw = userpw;
		++number;
	}

	@Override
	public String toString() {
		return "Shop [number=" + number + ", userid=" + userid + ", userpw=" + userpw + "]";
	}
	
	
	
}

class Login {
	static int point = 1000;
	String userid;
	String userpw;
	
	public Login(String userid, String userpw) {
		
		this.userid = userid;
		this.userpw = userpw;
//		point += 100;
		if(userid.equals("������") && userpw.equals("0605")) {
			System.out.println("�α��� �Ǿ����ϴ�.");
			point += 100;
		}else {
			System.out.println("�ٽ� �õ�");
			point += 0;
		}
	}

	@Override
	public String toString() {
		return "Login [point=" + point + ", userid=" + userid + ", userpw=" + userpw + "]";
	}
	
	
	
}

public class StaticEx2 {

	public static void main(String[] args) {

		Shop shop = new Shop("ȫ�浿", "1111");
		
		System.out.println(shop.toString());
		
		System.out.println("--------------------");
		
		Shop shop2 = new Shop("��浿", "2222");
		
		System.out.println(shop2.toString());
		
		System.out.println("--------------------");
		
		Login login = new Login("������", "0605");
		
		System.out.println(login.toString());
		
		Login login2 = new Login("������", "0605");
		
		System.out.println(login.toString());
		
	}

}
