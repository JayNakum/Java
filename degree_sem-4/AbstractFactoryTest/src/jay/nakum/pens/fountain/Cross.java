package jay.nakum.pens.fountain;

import jay.nakum.pens.MyPen;

public class Cross extends MyPen {

	@Override
	public String getUse() {
		return "Handwritten note, signatures, wedding stationery.";
	}

	@Override
	public String getWritingQuality() {
		return "Creates a quality finish, but can easily smudge.";
	}

	@Override
	public String getCost() {
		return "Rs. 500";
	}

}
