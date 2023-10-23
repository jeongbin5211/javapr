import java.util.Scanner;

public class Ex2_ToUpperCase {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean run = true;
		
		while(run) {
			System.out.print("대문자로 변경할 소문자를 입력하세요. >> ");
			String str = sc.next();
			char ch = str.charAt(0);
			System.out.println((char)(ch - 32));
		}
		
	}

}
