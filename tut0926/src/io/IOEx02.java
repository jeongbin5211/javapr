package io;

import java.io.File;

public class IOEx02 {

	public static void main(String[] args) {
		// ������ �����ϴ��� Ȯ�� ��
		// ������ �����Ͽ����ϴ�. or �����մϴ�. => exists() - boolean
		// io -> open -> close
		
		try {
			String fileName = "c:temp\\korea.txt";
			File file = new File(fileName);
			
//			File file = new File("C:" + File.separator + "temp" + File.separator)
			
			if(file.exists() == false) {
				boolean result = file.createNewFile();
				
				if(result) {
					System.out.println("������ �����Ͽ����ϴ�.");
				}
			}else {
				System.out.println("������ �̹� �����մϴ�.");
			}
			
		} catch(Exception e) { // Exception : �ֻ��� ���� Ŭ����
			e.printStackTrace();
			System.out.println("���� ������ ���ܰ� �߻��Ͽ����ϴ�.");
			
		} finally {
//			��ü��.close();
		}

	}

}
