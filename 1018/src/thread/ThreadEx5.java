package thread;

public class ThreadEx5 {

	public static void main(String[] args) {
		// 글자 출력
		Thread t1 = new Thread(() -> {
			
			try {
				Thread.sleep(50);
			} catch (InterruptedException ie) {
				ie.printStackTrace();
			}
			
			String[] strArr = new String[] {"하나", "둘", "셋", "넷", "다섯"};
			for (int i = 0; i < strArr.length; i++) {
				System.out.println(strArr[i]);
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		
		// 숫자 출력
		Thread t2 = new Thread(() -> {
			int[] intArr = new int[] {1, 2, 3, 4, 5};
			for (int i = 0; i < intArr.length; i++) {
				System.out.println(intArr[i]);
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});

		// 쓰레드 우선순위 : 10 ~ 1 -> 지정 안하면 5번
		System.out.println("쓰레드 이름은 : " + t1.getName());
		System.out.println(t1.getPriority());
		t1.setPriority(10);
		System.out.println(t1.getPriority());
		t1.start();
		
		System.out.println("쓰레드 이름은 : " + t2.getName());
		System.out.println(t2.getPriority());
		t2.start();
	}

}
