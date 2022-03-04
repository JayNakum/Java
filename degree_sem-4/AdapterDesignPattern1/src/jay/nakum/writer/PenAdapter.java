package jay.nakum.writer;

public class PenAdapter implements Pen {
	PilotPen pilotPen = new PilotPen();

	public void write(String str) {
		pilotPen.mark(str);
	}
}
