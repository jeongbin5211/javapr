package thread;

class HanCount2 extends Thread {
	
	public void run() {
		String[] strArr = new String[] {"�ϳ�", "��", "��", "��", "�ټ�"};
		
		try {
			Thread.sleep(50);
		} catch (InterruptedException ie) {
			ie.printStackTrace();
		}
		
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

class NumCount2 extends Thread {
	
	public void run() {
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

public class ThreadEx3 {

	public static void main(String[] args) {
		
		// �ѱ��� ���߿� ��µǾ�� �ϹǷ� ���� ó����Ű��
		HanCount2 hc = new HanCount2();
		hc.start();
		
		NumCount2 nc = new NumCount2();
		nc.start();
	}

}
