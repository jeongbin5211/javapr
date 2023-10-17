package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionEx {

	public static void main(String[] args) {
		/* 
			- Exception : ������
			1. ClassNotFoundException : Class.forName(��� �Ǵ� ����);
			2. IOException : �����
			3. FileNotFoundException : ������ ���� ���
			4. InterruptException : ������
			5. CloneNotSupportException : clone ��ü ����
		*/
		
		// 1. ClassNotFoundException
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("�����ͺ��̽� ���� ����");
			
		}catch (ClassNotFoundException cnfe) {
			
			cnfe.printStackTrace(); // ���ܰ� �߻��� �κ� ǥ�� : �����ڰ� ���
			cnfe.getMessage(); // ���ܸ޽���
			System.out.println("404 Error : �����ڿ��� �����ϼ���.");
			
		}finally { // ����, ���� ���� ������� �������� �ѹ��� ������ �����
			System.out.println("���α׷� ����");
//			rs.close;
//			ps.close;
//			conn.close;
//			
//			if (rs != null) {
//				rs.close();
//			}
//			
//			try {
//				if (conn != null) {
//					conn.close();
//				}
//			}
			
		}
		
		// 2. FileNotFoundException
		
		try {
			
			FileInputStream fis = new FileInputStream("./koreait.txt");
			fis.read();
			
		}catch (FileNotFoundException fnfe) {
			
			fnfe.printStackTrace();
			fnfe.getMessage();
			System.out.println("404 Error : �����ڿ��� �����ϼ���.");
			
		}catch (IOException ioe) {
			
			ioe.printStackTrace();
			
		}finally {
			
			System.out.println("�����մϴ�.");
			
		}
		
	}

}
