package thread;

class HanCount2 extends Thread {
	
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
		
		// 한글이 나중에 출력되어야 하므로 먼저 처리시키기
		HanCount2 hc = new HanCount2();
		hc.start();
		
		NumCount2 nc = new NumCount2();
		nc.start();
	}

}
