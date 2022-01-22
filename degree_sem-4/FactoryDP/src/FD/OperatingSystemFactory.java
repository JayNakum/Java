package FD;

public class OperatingSystemFactory {
	public OS findOS(String str)
	{
		if (str.equals("Open"))
		{
			return new Android();
		}
		else if(str.equals("Closed"))
		{
			return new IOS();
		}
		else
		{
			return new Windows();
		}
	}
}
