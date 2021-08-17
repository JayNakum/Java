import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class P6_1_1 {
	public static void main(String[] args) {
		String msg = "";

		try
		{	File f = new File("files/1.txt");
			FileReader fr = new FileReader(f);
			int i = 0;
			//while((i=fr.read())!=-1) {
			//	msg = msg + String.valueOf((char) i);         
            //}

            i = fr.read();
            msg = msg + String.valueOf((char) i);

            i = fr.read();
            msg = msg + String.valueOf((char) i);

            i = fr.read();
            msg = msg + String.valueOf((char) i);

            i = fr.read();
            msg = msg + String.valueOf((char) i);

			System.out.println(msg);
			fr.close();
		}
		catch(IOException ie) {
			ie.printStackTrace();
		}

	}
}