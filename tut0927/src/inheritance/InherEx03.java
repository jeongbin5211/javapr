package inheritance;

class Person {
	String name;
	int age;
	
	void sleep() {
		System.out.println("sleep...");
	}
	
	void eat() {
		System.out.println("eat...");
	}
}

class Student extends Person {
	int studentNumber;
	
	void todo() {
		System.out.println("study");
	}
}

class Employee extends Person {
	int empNumber;
	
	void todo() {
		System.out.println("work");
	}
}

public class InherEx03 {

	public static void main(String[] args) {
		// interface, abstract -> ��ü�� �����ؼ� ����� �� ����(new x)
		
		Student s = new Student();
		Employee e = new Employee();
		
		s.studentNumber = 1635221;
		s.age = 30;
		s.name = "������";
		
		System.out.println(s.studentNumber);
		System.out.println(s.name);
		System.out.println(s.age);
		s.todo();
		s.eat();
		s.sleep();
		
		e.empNumber = 100100;
		e.age = 40;
		e.name = "�質��";
		System.out.println(e.empNumber);
		System.out.println(e.name);
		System.out.println(e.age);
		e.todo();
		e.eat();
		e.sleep();

	}

}
