package lamda;

interface Hello {
	String greeting(String str);
}

public class LambdaEx3 {

	public static void main(String[] args) {
		
		Hello h = (str) -> {
			return str;
		};
		
		System.out.println(h.greeting("Hello"));

	}

}
