package io;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;

public class IOEx03 {

	public static void main(String[] args) throws IOException {
		
//		String folder = "ioDir";
//		File dir = new File("c:\\temp\\" + folder); // �����غ� ��
//		// mkdir() make directory
//		
//		if (!dir.exists()) {
//			dir.mkdir();
//			System.out.println(folder + "�� �����Ǿ����ϴ�.");
//			
//			// ���� �����ϸ鼭 busan.txt�� ���� ����
//			
//			File file = new File(dir + "\\busan.txt");
//			file.createNewFile();
//			System.out.println("������ �����Ǿ����ϴ�.");
//		}else {
//			System.out.println("���丮�� �����մϴ�.");
//		}
		
		
		
		String folder2 = new SimpleDateFormat("yy.MM.dd").format(System.currentTimeMillis());
		
		File dir2 = new File("c:\\temp\\" + folder2);
		
		if(dir2.exists() == false) {
			dir2.mkdir();
			System.out.println(folder2 + "�� �����Ǿ����ϴ�.");
			
			// busan.txt�� ���� �����ϱ�
			
			File file = new File(dir2 + "\\busan.txt");
			file.createNewFile();
			System.out.println("������ �����Ǿ����ϴ�.");
		}else {
			System.out.println("���丮�� �����մϴ�.");
		}

	}

}