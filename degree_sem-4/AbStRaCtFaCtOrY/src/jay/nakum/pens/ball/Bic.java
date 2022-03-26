package jay.nakum.pens.ball;

import jay.nakum.pens.MyPen;

public class Bic extends MyPen {

	@Override
	public String getUse() {
		return "Day-to-day tasks.";
	}

	@Override
	public String getWritingQuality() {
		return "Less likely to smudge, with fine lines. Can be prone to clumping.";
	}

	@Override
	public String getCost() {
		return "Rs. 100";
	}

}
