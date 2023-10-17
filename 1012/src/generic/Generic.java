package generic;

class Fruit3 {
	void fruit3() {
		System.out.println("�����Դϴ�.");
	}
}

class Pencil3 {
	void pencil3() {
		System.out.println("�����Դϴ�.");
	}
}

class Box3<T> {
	
	private T t;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}
	
}

public class Generic {

	public static void main(String[] args) {
		
		Box3<Fruit3> box = new Box3<>();
		
		box.setT(new Fruit3());
		
		Fruit3 f3 = box.getT();
		System.out.println(f3);
		
	}
	
}
