package stream;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class StreamEx02 {

	public static void main(String[] args) throws IOException {
		
		String fileName = "c:\\temp\\korea.txt";
		File file = new File(fileName);
		
		// FileOut ~ : 기본은 false값, 아무것도 안쓰면 덮어쓰기, true(이어적기)
		
		OutputStream os = new FileOutputStream(file, false);
		
		// byte(1), char(1)
		String str = "korea";
		
		// 1byte로 변환하기 -> 배열명.getBytes();
		// 개행
		
		byte[] b1 = str.getBytes();
		os.write(b1);
		os.write('\n');
		os.flush();
		os.close();
	}

}
