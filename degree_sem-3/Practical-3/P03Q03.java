import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.PrintWriter;
import java.io.IOException;
// import java.util.Set;
// import java.util.HashSet;
// import java.util.Scanner;
// import java.io.FileWriter;
// import java.io.FileNotFoundException;

class RemoveDuplicates {
    private final String outputFilePath = "./txt-files/question3(b).txt";
    private File file;
    private BufferedReader reader1, reader2;
    private PrintWriter writer;

    public RemoveDuplicates(String filePath) {
        file = new File(filePath);
        try {
            reader1 = new BufferedReader(new FileReader(file));
            writer = new PrintWriter(outputFilePath);

            String line = reader1.readLine();
            String nextLine;
            boolean isDuplicate;

            while (line != null) {
                isDuplicate = false;
                reader2 = new BufferedReader(new FileReader(outputFilePath));
                nextLine = reader2.readLine();

                while (nextLine != null) {
                    if (nextLine.equals(line)) {
                        isDuplicate = true;
                        break;
                    }
                    nextLine = reader2.readLine();
                }

                if (!isDuplicate) {
                    writer.println(line);
                    writer.flush();
                }
                line = reader1.readLine();
            }
            reader1.close();
            reader2.close();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Using Set
    // public RemoveDuplicates(String filePath) {
    //     String input;
    //     try {
    //         Scanner sc = new Scanner(new File(filePath));
    //         FileWriter writer = new FileWriter(filePath);

    //         Set<String> set = new HashSet<String>();
    //         while (sc.hasNextLine()) {
    //             input = sc.nextLine();
    //             if (set.add(input)) {
    //                 writer.append(input + "\n");
    //             }
    //         }
    //         writer.flush();
    //         writer.close();
    //         set.clear();
    //         System.out.println("Duplicates removed");
    //     } catch (FileNotFoundException e) {
    //         System.out.println("File not found :/");
    //         e.printStackTrace();
    //     } catch (IOException e) {
    //         e.printStackTrace();
    //     }

    // }

}

public class P03Q03 {
    public static void main(String[] args) {
        new RemoveDuplicates("./txt-files/question3(a).txt");
    }
}
