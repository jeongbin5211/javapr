package stream;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class StreamEx01 {

	public static void main(String[] args) throws IOException {
		/* 
		�����
		1. (1)byte : �ؽ�Ʈ, ����, �̹���
		(1) OutputStream/InputStream
				����			�б�
				
		2. char : �ؽ�Ʈ ����
		
		����, ĳ�� �޸�(L1, L2) => �ӵ� ���
		
		�ڷ�
		���� ���(flush)
		close
		
		*/
		
		// ���� ����
		String fileName = "c:\\temp\\korea.txt";
		File file = new File(fileName);
		
		// ���� + �۾��� : OutputStream = FileOutputStream
		// write();
		// flush();
		// close();
		
		OutputStream os = new FileOutputStream(file);
		
		os.write('k');
		os.write('o');
		os.write('r');
		os.write('e');
		os.write('a');
		
		os.flush();
		os.close();

	}

}