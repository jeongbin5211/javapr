package staticPrj;

class Point {
	static int point = 0;
    int point2 = 0;
}

public class StaticEx3 {
	
    public static void main(String[] args) {
    	
        Point point = new Point();  // ù��° point
        Point point2 = new Point(); // �ι�° point
        
        point.point++;   // ���� �ʵ� point�� 1����
        point.point2++;  // �ν��Ͻ� �ʵ� point2�� 1����
        
        System.out.println(point2.point); // Ŭ���� �ʵ� ���
        System.out.println(point2.point2);// �ν��Ͻ� �ʵ� ���
        
    }
}
