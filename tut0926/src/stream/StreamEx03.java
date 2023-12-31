package stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class StreamEx03 {

	public static void main(String[] args) throws IOException {
		// k(1) o(1) r e a		자료가 없으면 -1 return
		String fileName = "c:\\temp\\korea.txt";
		InputStream is = new FileInputStream(fileName); // 파일 내용을 읽어올 준비 완료
//		
//		// is.read(); // 1byte 씩 읽어옴 (실제 처리는 4byte사용)
//		while(true) {
//			
//			int result = is.read();
//			if (result == -1) { // 더이상 출력할 글자가 없으면 -1 return
//				break; // 가장 가까운 반복문 탈출
//			}
//			
//			System.out.println((char)result);
//			System.out.println("남은 byte(s)는 " + is.available() + "입니다.");
//			
//		}
//		is.close();
		
		// 위 코드를 짧게 쓰기
		int result = 0;
		while ((result = is.read()) != -1) {
			System.out.println(result + " > ");
			System.out.println((char)result);
		}
		is.close();
	}

}
