package tut0919;

public class LoginEx3 {

	
	
	public static void main(String[] args) {
		Login3 log3 = new Login3();
		
		log3.setEmail("email@email.com");
		log3.setUserpw("12345");
		
		System.out.println("");
		System.out.println("getter���");
		System.out.println(log3.getEmail());
		
		System.out.println("");
		System.out.println("�޼ҵ� ���");
		System.out.println(log3.toString());
	}

}
