import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class P6_1 {
	public static void main(String[] args) {
		String msg = "Hello World!!";

		try
		{	File f = new File("files/1.txt");
			FileWriter fw = new FileWriter(f);
		
			fw.write(msg);
		
			fw.close();
		}
		catch(IOException ie) {
			ie.printStackTrace();
		}

	}
}