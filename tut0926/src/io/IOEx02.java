package io;

import java.io.File;

public class IOEx02 {

	public static void main(String[] args) {
		// 파일이 존재하는지 확인 후
		// 파일을 생성하였습니다. or 존재합니다. => exists() - boolean
		// io -> open -> close
		
		try {
			String fileName = "c:temp\\korea.txt";
			File file = new File(fileName);
			
//			File file = new File("C:" + File.separator + "temp" + File.separator)
			
			if(file.exists() == false) {
				boolean result = file.createNewFile();
				
				if(result) {
					System.out.println("파일을 생성하였습니다.");
				}
			}else {
				System.out.println("파일이 이미 존재합니다.");
			}
			
		} catch(Exception e) { // Exception : 최상위 예외 클래스
			e.printStackTrace();
			System.out.println("파일 생성에 예외가 발생하였습니다.");
			
		} finally {
//			객체명.close();
		}

	}

}
