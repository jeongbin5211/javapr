package thread;

public class ThreadEx5 {

	public static void main(String[] args) {
		// ���� ���
		Thread t1 = new Thread(() -> {
			
			try {
				Thread.sleep(50);
			} catch (InterruptedException ie) {
				ie.printStackTrace();
			}
			
			String[] strArr = new String[] {"�ϳ�", "��", "��", "��", "�ټ�"};
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
		
		// ���� ���
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

		// ������ �켱���� : 10 ~ 1 -> ���� ���ϸ� 5��
		System.out.println("������ �̸��� : " + t1.getName());
		System.out.println(t1.getPriority());
		t1.setPriority(10);
		System.out.println(t1.getPriority());
		t1.start();
		
		System.out.println("������ �̸��� : " + t2.getName());
		System.out.println(t2.getPriority());
		t2.start();
	}

}
