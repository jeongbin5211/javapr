package tut0919;

//class Login {
//	String userid;
//	String userpw;
//	int age;
//}

// 2. Login class�� ���� ���� �����غ���

public class LoginEx2 {

	public static void main(String[] args) {
		Login web = new Login();
		
		web.userid = "aaa";
		web.userpw = "123";
		web.age = 10;
		System.out.println("���̵�� " + web.userid + "�Դϴ�.");
		System.out.println("��й�ȣ�� " + web.userpw + "�Դϴ�.");
		System.out.println("���̴� " + web.age + "�Դϴ�.");
		
		System.out.println("--------------------");
		
		Login grp = new Login();
		
		grp.userid = "bbb";
		grp.userpw = "1234";
		grp.age = -10;
		
		// \n, \t
		
		System.out.println("���̵�� " + grp.userid + " �Դϴ�.\n��й�ȣ�� " + grp.userpw + " �Դϴ�.\n���̴� " + grp.age + " �Դϴ�.");
		
		

	}

}
