package io;

import java.io.UnsupportedEncodingException;

public class CharSetEx {

	public static void main(String[] args) throws UnsupportedEncodingException {
		// �ѱ� Charset : EUC-KR -> 949 -> UTF-8
		
		// ASCII(1byte) -> EUC-KR -> 949 -> UTF-8(3byte)
		// �ѱ� ��ȯ(����) -> byte[] -> loop
		// ���ڿ�.getBytes(���ڼ�);
		
		String str = "�ڸ��ƾ���Ƽ";
		byte[] b1 = str.getBytes();
		System.out.println(b1.length);
		
		// ���
		
		for (int i = 0; i < b1.length; i++) {
			System.out.println(b1[i]);
		}
		
		System.out.println(new String(b1, "UTF-8"));
		System.out.println(new String(b1, "ms949"));
		System.out.println(new String(b1, "EUC-KR"));
		
		System.out.println("----------------------------------");
		
		String str2 = "��";
		
		byte[] b2 = str2.getBytes();
		System.out.println(new String(b2, "EUC-KR"));
		
		byte[] b3 = str2.getBytes();
		System.out.println(new String(b3, "UTF-8"));
		
		byte[] b4 = str2.getBytes();
		System.out.println(new String(b4, "ms949"));
		
//		ASCII - 1byte(8bit) -> 2 * 8 = 256
//		a - 75, A - 97
		
//Unicode(3byte) -> 2 * 24 -> ����, �ѱ�, �Ϻ����� ����		

	}

}