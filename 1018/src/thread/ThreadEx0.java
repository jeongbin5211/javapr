package thread;

class StrThread extends Thread {
	public void run() {
		String[] strArr = new String[] {"�ϳ�", "��", "��", "��", "�ټ�"};
		
		for (int i = 0; i < strArr.length; i++) {
			System.out.println(strArr[i]);
			try {
				Thread.sleep(500); // �����带 0.5�ʰ� ����
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class IntThread implements Runnable {

	@Override
	public void run() {
		int[] intArr = new int[] {1, 2, 3, 4, 5};
		for (int i = 0; i < intArr.length; i++) {
			System.out.println(intArr[i]);
			try {
				Thread.sleep(500); // �����带 0.5�ʰ� ����
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}

public class ThreadEx0 {

	public static void main(String[] args) {
		
		// Thread
		StrThread st = new StrThread();
		
		st.start(); // Thread Ŭ������ ��ӹ��� ��� ����
		
		
		// Runnable
		IntThread it = new IntThread();
		Thread thread = new Thread(it);
		
		// Runnable �������̽��� ������ ��� ������ ��ü�� �����ؼ� ���
		thread.start(); 

	}

}
