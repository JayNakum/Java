class Person {
	protected String name;
	protected int age;

	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void showDetails() {
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
	}
}

class Student extends Person {
	protected String courseName;

	Student(String name, int age, String courseName) {
		super(name, age);
		this.courseName = courseName;
	}

	public void showDetails() {
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("Course Name: " + courseName);
	}
}

class Employee extends Person {
	protected double salary;
	
	Employee(String name, int age, double salary) {
		super(name, age);
		this.salary = salary;
	}

	public void showDetails() {
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("Salary: " + salary);
	}
}

public class P4_2 {
	public static void main(String[] args) {
		
		Person p = new Person("Jay", 18);
		p.showDetails();

		Student s = new Student("Umang", 18, "JS");
		s.showDetails();

		Employee e = new Employee("Kishan", 18, 69000);
		e.showDetails();

	}
}