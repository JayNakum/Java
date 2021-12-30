interface Student {
	String enrno = "186020307051";
	String name = "Ajent J";
}

interface Exam extends Student {
	double cpi = 10.0;
}

interface Sports extends Student {
	String event = "Bananas";
	int marks = 420;
}

class StudentPerformance implements Exam, Sports {
	public void display() {
		System.out.println("Student Details: ");
		System.out.println("Enrollment Number: " + enrno);
		System.out.println("Name: " + name);
		System.out.println("CPI: " + cpi);
		System.out.println("Event: " + event);
		System.out.println("Marks: " + marks);
	}
}

public class P4_4 {
	public static void main(String[] args) {
		StudentPerformance s = new StudentPerformance();
		s.display();
	}
}