package io;

import java.io.File;

public class IOEx01 {

	public static void main(String[] args) {
		// �������(�̹���), �Խ���(�̹���, ÷������) : ���� ÷������
		// �Ի��� : ����� ����
		
		// ���� ����
		// ��� ������(seperator) : /
		// window�� / ���
		// �齽���� ���������� \\ \�ι��Է�
		
//		String file = "c:/temp/korea.txt";
//		File makeFile = new File(file);
//		makeFile.createNewFile();
		
		try {// ���� �ڵ�
			
			String file = "c:\\temp\\korea.txt";
			File makeFile = new File(file);
			makeFile.createNewFile();
			
		} catch (Exception e) {// ���� �� �ۼ� ����
			
			e.printStackTrace(); // ���ܸ� �������ڷ� ���
			System.out.println("���� ������ ���ܰ� �߻��߽��ϴ�.");
			//throw e; // �ֻ��� Ŭ������ �ƴ϶�� ������ �����ֱ�
			// ����ó��
		} finally {
			// �׻� ó���Ǵ� �ڵ�
			
			
		}

	}

}