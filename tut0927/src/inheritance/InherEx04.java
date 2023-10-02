package inheritance;

class Phone {
	String model;
	String color;
	
	public Phone() {}
	
	public Phone(String model, String color) {
		this.model = model;
		this.color = color;
	}
	
	void On() {
		System.out.println("������ �մϴ�.");
	}
	
	void Off() {
		System.out.println("������ ���ϴ�.");
	}
	
	void disp() {
		System.out.println("�� : " + model + ", ���� : " + color);
	}
}

class AddCompany extends Phone {
	private String company;

	public AddCompany(String company, String model, String color) {
		super(model, color); // �θ����������� ��������
		this.company = company;
	}
	
	void disp() {
		System.out.println("������ : " + company + ", �� : " + model + ", ���� : " + color);
	}
	
	
}

public class InherEx04 {

	public static void main(String[] args) {
		// �����ڸ� �̿��ؼ� ��, ������ ���� �� ���
		Phone phone = new Phone("IPone-X", "white");
		System.out.println(phone.model);
		System.out.println(phone.color);
		phone.On();
		phone.disp();
		phone.Off();
		
		System.out.println("------------------------");
		// model, color, company -> ������
		
		AddCompany add = new AddCompany("Galaxy", "black", "samsung");
		add.On();
		add.disp();
		add.Off();
		
	}

}