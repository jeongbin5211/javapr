package thread;

public class ThreadEx {

	public static void main(String[] args) {
		
		// 내컴퓨터의 코어개수확인
		System.out.println(Runtime.getRuntime().availableProcessors());
		
		// Single Thread : 순서대로 처리
		
		// Thread를 이용해서 0.5초의 간격을 두고 실행
		// 프로그래밍은 1초 = 1000
		
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
		
		// 배열로 Single Thread
		
		int[] intArr = new int[] {1, 2, 3, 4, 5};
		
		String[] strArr = new String[] {"하나", "둘", "셋", "넷", "다섯"};
		
		String[] str2 = new String[5];
		str2[1] = "하나";
		str2[2] = "둘";
		
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
