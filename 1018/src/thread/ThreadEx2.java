package thread;

class HanCount extends Thread {
	public void run() {
		String[] strArr = new String[] {"�ϳ�", "��", "��", "��", "�ټ�"};
		
		try {
			Thread.sleep(50);
		}catch (InterruptedException ie) {
			ie.printStackTrace();
		}
		
		for (int i = 0; i < strArr.length; i++) {
			System.out.println(strArr[i]);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class ThreadEx2 {

	public static void main(String[] args) {
		// 1 �ϳ�, 2 ��
		// ���߿� ����� �۾��� ���� ó�����ֱ�
		
		HanCount hc = new HanCount();

		hc.start();
		
		int[] intArr = new int[] {1, 2, 3, 4, 5};
		
		for (int i = 0; i < intArr.length; i++) {
			System.out.println(intArr[i]);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
