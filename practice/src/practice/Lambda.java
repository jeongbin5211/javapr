package practice;

interface Cals {
	int sum(int a, int b);
}

public class Lambda {

	public static void main(String[] args) {
		
		Cals c = (a, b) -> a + b;
		

		System.out.println(c.sum(10, 5));
		
	}

}
