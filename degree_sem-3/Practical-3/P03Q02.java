import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

class ConvertToUppercase {
    private File oldFile, newFile;
    private Scanner myReader;

    public ConvertToUppercase(String oldFilePath, String newFilePath) {
        read(oldFilePath);
        write(newFilePath);
    }
    private void read(String filePath) {
        this.oldFile = new File(filePath);
        try {
            myReader = new Scanner(this.oldFile);
        } catch (FileNotFoundException e) {
            System.out.println("File not found :/");
            e.printStackTrace();
        }
    }
    private void write(String filePath) {
        newFile = new File(filePath);
        FileWriter writer;
        String line;
        try {
            newFile.createNewFile();
            writer = new FileWriter(newFile);
            while(myReader.hasNextLine()) {
                line = myReader.nextLine();
                writer.append(line.toUpperCase() + "\n");
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            myReader.close();
        }
    }
}
public class P03Q02 {
    public static void main(String[] args) {
        new ConvertToUppercase("./txt-files/question2(a).txt", "./txt-files/question2(b).txt");
    }
}
