package exception;

public class ExceptionEx2 {

	public static void main(String[] args) {
		// interruptException : ������

	}
	
	void thread1() throws InterruptedException {
		// 1�� �ڿ� ���߼���.
		Thread.sleep(1000);
	}
	
	void thread2() {
		
		try {
			Thread.sleep(1000);
			System.out.println("Thread success");
		}catch (InterruptedException ite) {
			ite.printStackTrace();
		}finally {
			System.out.println("Thread�� �����մϴ�.");
		}
	}

}
