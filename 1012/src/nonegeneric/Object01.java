package nonegeneric;

class Fruit2 {
	void fruit2() {
		System.out.println("�����Դϴ�.");
	}
}

class Pencil2 {
	void pencil2() {
		System.out.println("�����Դϴ�.");
	}
}

class Box {
	
	// ���� ����, ��� -> ����ȯ �ʿ�
	private Object obj;
	
	public Object getObj() {
		return obj;
	}
	
	public void setObj(Object obj) {
		this.obj = obj;
	}
}

public class Object01 {

	public static void main(String[] args) {
		
		Box box = new Box();
		box.setObj(new Fruit2());
		
		Fruit2 f2 = (Fruit2) box.getObj();
		
		System.out.println(f2);
		
		System.out.println("---------------------------");
		
		Box box2 = new Box();
		box2.setObj(new Pencil2());
		
		Pencil2 p2 = (Pencil2) box2.getObj();
		
		System.out.println(p2);
		
		Object str = "korea";
		
		String s = (String) str;
		System.out.println(s);
		
		Object i = 100;
		
		Integer num = (Integer) i;
		
		System.out.println(num);
		
	}

}
