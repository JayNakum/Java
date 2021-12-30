import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Question3 {
   public void removeDuplicates(String filePath) {
      String input;
      try {
         Scanner sc = new Scanner(new File(filePath));
         FileWriter writer = new FileWriter(filePath);

         Set<String> set = new HashSet<String>();
         while (sc.hasNextLine()) {
            input = sc.nextLine();
            if (set.add(input)) {
               writer.append(input + "\n");
            }
         }
         writer.flush();
         writer.close();
         set.clear();
         System.out.println("Duplicates removed");
      } catch (FileNotFoundException e) {
         System.out.println("File not found :/");
         e.printStackTrace();
      } catch (IOException e) {
         e.printStackTrace();
      }
   }
   public static void main(String args[]) {
      Question3 obj = new Question3();
      obj.removeDuplicates("./txt-files/question3(a).txt");
   }
}
