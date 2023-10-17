package nonegeneric;

class Fruit {
	
	void fruit() {
		System.out.println("�����Դϴ�.");
	}
}

// ������ ���ڿ� �����ϴ� Ŭ����

class FruitBox {
	
	private Fruit fruit;
	
	public void setFruit(Fruit fruit) {
		this.fruit = fruit;
	}

	public Fruit getFruit() {
		return fruit;
	}

}

class Pencil {
	void pencil() {
		System.out.println("�����Դϴ�.");
	}
}

class PencilBox {
	private Pencil pencil;

	public Pencil getPencil() {
		return pencil;
	}

	public void setPencil(Pencil pencil) {
		this.pencil = pencil;
	}
	
}

public class NoneGeneric {

	public static void main(String[] args) {
		FruitBox fb = new FruitBox();
		fb.setFruit(new Fruit());
		System.out.println(fb.getFruit());
		
		System.out.println("------------------------------");
		
		PencilBox pb = new PencilBox();
		
		pb.setPencil(new Pencil());
		
		System.out.println(pb.getPencil());

	}

}
