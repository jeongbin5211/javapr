package stream;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class StreamEx02 {

	public static void main(String[] args) throws IOException {
		
		String fileName = "c:\\temp\\korea.txt";
		File file = new File(fileName);
		
		// FileOut ~ : �⺻�� false��, �ƹ��͵� �Ⱦ��� �����, true(�̾�����)
		
		OutputStream os = new FileOutputStream(file, false);
		
		// byte(1), char(1)
		String str = "korea";
		
		// 1byte�� ��ȯ�ϱ� -> �迭��.getBytes();
		// ����
		
		byte[] b1 = str.getBytes();
		os.write(b1);
		os.write('\n');
		os.flush();
		os.close();
	}

}