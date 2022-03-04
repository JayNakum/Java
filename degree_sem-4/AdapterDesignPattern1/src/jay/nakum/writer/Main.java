package jay.nakum.writer;

public class Main {
	public static void main(String[] args) {
		Pen p = new PenAdapter();
		AssignmentWork assignmentWork = new AssignmentWork();
		assignmentWork.setPen(p);
		assignmentWork.writeAssignment("Assignment has been completed sucessfully");
	}
}
