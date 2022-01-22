package jay.nakum.phone;

import jay.nakum.phone.availableOS.Android;
import jay.nakum.phone.availableOS.Blackberry;
import jay.nakum.phone.availableOS.IOS;
import jay.nakum.phone.availableOS.Windows;

public class OSFactory {
	
	private String userRequirements;
	
	public OSFactory(String userRequirements) {
		this.userRequirements = userRequirements;
	}
	
	public OperatingSystem findOS() {
		OperatingSystem android = new Android();
		OperatingSystem iOS = new IOS();
		OperatingSystem windows = new Windows();
		OperatingSystem blackberry = new Blackberry();
		
		switch(userRequirements) {
			case "Easy to Use": return android;
			case "Secure": return iOS;
			case "Most used": return android;
			case "Closed Source": return iOS;
			case "Cheap and Secure": return blackberry;
			default: return windows;
		}
	}
}
