import java.util.Scanner;

public class Ex3_DoWhile {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		boolean run = true;
		
		do {
			
			System.out.print("�빮�ڷ� ������ �ҹ��ڸ� �Է��ϼ���. >> ");
			String str = sc.next();
			char ch = str.charAt(0);
			System.out.println((char)(ch - 32));
			
		} while (run);
	}

}
