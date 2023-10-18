package thread;

class StrThread extends Thread {
	public void run() {
		String[] strArr = new String[] {"하나", "둘", "셋", "넷", "다섯"};
		
		for (int i = 0; i < strArr.length; i++) {
			System.out.println(strArr[i]);
			try {
				Thread.sleep(500); // 스레드를 0.5초간 멈춤
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
				Thread.sleep(500); // 스레드를 0.5초간 멈춤
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
		
		st.start(); // Thread 클래스를 상속받은 경우 실행
		
		
		// Runnable
		IntThread it = new IntThread();
		Thread thread = new Thread(it);
		
		// Runnable 인터페이스를 구현한 경우 스레드 객체에 주입해서 사용
		thread.start(); 

	}

}
