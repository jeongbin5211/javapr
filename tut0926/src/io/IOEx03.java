package io;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;

public class IOEx03 {

	public static void main(String[] args) throws IOException {
		
//		String folder = "ioDir";
//		File dir = new File("c:\\temp\\" + folder); // 만들준비 끝
//		// mkdir() make directory
//		
//		if (!dir.exists()) {
//			dir.mkdir();
//			System.out.println(folder + "가 생성되었습니다.");
//			
//			// 폴더 생성하면서 busan.txt도 같이 생성
//			
//			File file = new File(dir + "\\busan.txt");
//			file.createNewFile();
//			System.out.println("파일이 생성되었습니다.");
//		}else {
//			System.out.println("디렉토리가 존재합니다.");
//		}
		
		
		
		String folder2 = new SimpleDateFormat("yy.MM.dd").format(System.currentTimeMillis());
		
		File dir2 = new File("c:\\temp\\" + folder2);
		
		if(dir2.exists() == false) {
			dir2.mkdir();
			System.out.println(folder2 + "가 생성되었습니다.");
			
			// busan.txt도 같이 생성하기
			
			File file = new File(dir2 + "\\busan.txt");
			file.createNewFile();
			System.out.println("파일이 생성되었습니다.");
		}else {
			System.out.println("디렉토리가 존재합니다.");
		}

	}

}
