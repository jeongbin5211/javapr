package stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class StreamEx03 {

	public static void main(String[] args) throws IOException {
		// k(1) o(1) r e a		�ڷᰡ ������ -1 return
		String fileName = "c:\\temp\\korea.txt";
		InputStream is = new FileInputStream(fileName); // ���� ������ �о�� �غ� �Ϸ�
//		
//		// is.read(); // 1byte �� �о�� (���� ó���� 4byte���)
//		while(true) {
//			
//			int result = is.read();
//			if (result == -1) { // ���̻� ����� ���ڰ� ������ -1 return
//				break; // ���� ����� �ݺ��� Ż��
//			}
//			
//			System.out.println((char)result);
//			System.out.println("���� byte(s)�� " + is.available() + "�Դϴ�.");
//			
//		}
//		is.close();
		
		// �� �ڵ带 ª�� ����
		int result = 0;
		while ((result = is.read()) != -1) {
			System.out.println(result + " > ");
			System.out.println((char)result);
		}
		is.close();
	}

}