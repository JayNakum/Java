package jay.nakum.pens.roller;

import jay.nakum.pens.MyPen;

public class UniBall extends MyPen {

	@Override
	public String getUse() {
		return "Note taking, meeting minutes.";
	}

	@Override
	public String getWritingQuality() {
		return "Tends to create a smooth, fine line. Prone to smudging.";
	}

	@Override
	public String getCost() {
		return "Rs. 400";
	}

}
