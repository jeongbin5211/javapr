package inheritance;

public class AutoEx {

	public static void main(String[] args) {
		HyundaiEx h = new HyundaiEx();
		h.start();
		h.model = "¼Ò³ªÅ¸";
		h.color = "white";
		System.out.println(h.model + ", " + h.color);
		h.stop();
		
		
		KiaEx k = new KiaEx();
		k.start();
		k.model = "k7";
		k.color = "black";
		System.out.println(k.model + ", " + k.color);
		k.stop();
		
	}

}
