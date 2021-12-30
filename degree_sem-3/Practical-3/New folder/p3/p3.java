package p3;
import java.io.File;
import java.io.FileWriter;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
public class p3 {
public static void main(String args[]) throws Exception {
      String filePath = "D://sample.txt";
      String input = null;
      //Instantiating the Scanner class
      Scanner sc = new Scanner(new File(filePath));
      //Instantiating the FileWriter class
      FileWriter writer = new FileWriter("D://output.txt");
      //Instantiating the Set class
      Set set = new HashSet();
      while (sc.hasNextLine()) {
         input = sc.nextLine();
         if(set.add(input)) {
            writer.append(input+"\n");
         }
      }
      writer.flush();
      System.out.println("Contents added............");
   }
}
