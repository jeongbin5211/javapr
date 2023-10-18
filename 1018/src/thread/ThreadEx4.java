package thread;

class NumCount3 implements Runnable {

	@Override
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

class HanCount3 implements Runnable {
	public void run() {
		String[] strArr = new String[] {"하나", "둘", "셋", "넷", "다섯"};
		
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
				e.printStackTrace();
			}
		}
	}
}

public class ThreadEx4 {

	public static void main(String[] args) {
		
		HanCount3 hc = new HanCount3();
		// Thread 객체에 주입해서 사용
		
		Thread thread = new Thread(hc);
		thread.start();
		
		NumCount3 nc = new NumCount3();
		// Thread 객체에 주입해서 사용
		
		Thread thread2 = new Thread(nc);
		thread2.start();
		
		
	}

}
