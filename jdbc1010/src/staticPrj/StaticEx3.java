package staticPrj;

class Point {
	static int point = 0;
    int point2 = 0;
}

public class StaticEx3 {
	
    public static void main(String[] args) {
    	
        Point point = new Point();  // 첫번째 point
        Point point2 = new Point(); // 두번째 point
        
        point.point++;   // 정적 필드 point를 1증가
        point.point2++;  // 인스턴스 필드 point2를 1증가
        
        System.out.println(point2.point); // 클래스 필드 출력
        System.out.println(point2.point2);// 인스턴스 필드 출력
        
    }
}
