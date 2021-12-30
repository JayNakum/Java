import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

class Calculate {
    private File file;
    private Scanner myReader;

    public Calculate(String filePath) {
        this.file = new File(filePath);
    }
    private void read() {
        try {
            myReader = new Scanner(this.file);
        } catch (FileNotFoundException e) {
            System.out.println("File not found :/");
            e.printStackTrace();
        }
    }

    public int sentences() {
        int count = 0;
        read();
        while(myReader.hasNextLine()) {
            myReader.nextLine();
            count += 1;
        }
        myReader.close();
        return count;
    }
    public int words() {
        int count = 0;
        read();
        String line;
        while(myReader.hasNextLine()) {
            line = myReader.nextLine();
            for (int i = 0; i < line.length(); i++) {
                if(line.charAt(i) == ' ') {
                    count += 1;
                }
            }
            count += 1;
        }
        myReader.close();
        return count;
    }
    public int characters() {
        int count = 0;
        read();
        String line;
        while(myReader.hasNextLine()) {
            line = myReader.nextLine();
            count += line.length();
        }
        myReader.close();
        return count;
    }
}

public class P03Q01 {
    public static void main(String[] args) {
        Calculate obj = new Calculate("./txt-files/question1.txt");
        System.out.println("Sentences: " + obj.sentences());
        System.out.println("Words: " + obj.words());
        System.out.println("Characters: " + obj.characters());
    }
}
