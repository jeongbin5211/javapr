package thread;

public class ThreadEx {

	public static void main(String[] args) {
		
		// ����ǻ���� �ھ��Ȯ��
		System.out.println(Runtime.getRuntime().availableProcessors());
		
		// Single Thread : ������� ó��
		
		// Thread�� �̿��ؼ� 0.5���� ������ �ΰ� ����
		// ���α׷����� 1�� = 1000
		
		for (int i = 1; i < 6; i++) {
			System.out.println(i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("------------------");
		
		System.out.println((int)'A'); // 65
		
		for (int i = 65; i < (65 + 5); i++) {
			System.out.println((char)i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		// �迭�� Single Thread
		
		int[] intArr = new int[] {1, 2, 3, 4, 5};
		
		String[] strArr = new String[] {"�ϳ�", "��", "��", "��", "�ټ�"};
		
		String[] str2 = new String[5];
		str2[1] = "�ϳ�";
		str2[2] = "��";
		
		for (int i = 0; i < intArr.length; i++) {
			System.out.println(intArr[i]);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.println("--------------------------");
		
		for (int i = 0; i < strArr.length; i++) {
			System.out.println(strArr[i]);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
