package jay.nakum.writer;

public class AssignmentWork {
	private Pen p;

	public Pen getPen() {
		return p;
	}

	public void setPen(Pen pen) {
		this.p = pen;
	}

	public void writeAssignment(String str) {
		p.write(str);
	}
}
