package exception;

public class RuntimeException {

	public static void main(String[] args) {
		/*
			RuntimeException : ���� ����
			ArimetricException : ������ ����
			ArrayIndexOutBoundException
			NullPointException
		*/
		
		// ArimetricException
		
		try {
			
			System.out.println(10 / 0);
			
		}catch (ArithmeticException ae) {
			ae.printStackTrace();
			ae.getMessage();
			System.out.println("0���� ���� �� �����ϴ�.");
		}

		String[] str = new String[] {"a", "b", "c"};
		System.out.println(str.length);
		
		for (int i = 0; i < str.length; i++) {
			System.out.println(str[i]);
		}
		
		// 2. ArrayIndexOutofBoundsException
		
		try {
			
			System.out.println(str[3]);
			
		}catch (ArrayIndexOutOfBoundsException aiobe) {
			aiobe.printStackTrace();
			System.out.println("�ε��� ��ȣ ����");
		}
		
		String string = "Koreait";
		String string2 = new String("Koreait");
		
		// ���� ���� �� char�� �����ؼ� ���
		
		System.out.println(string.charAt(0));
		
		String string3 = null;
		
		try {
			System.out.println(string3.charAt(0));
		}catch (NullPointerException npe) {
			npe.printStackTrace();
			System.out.println("������ ���� �����ϴ�.");
		}
		
	}

}
