import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

class Question6 {
    private File file;

    public Question6(String filePath) {
        file = new File(filePath);
        Scanner scanner = new Scanner(System.in);

        try {
            if (file.createNewFile()) {
                System.out.println("File created");
            }

            System.out.println("1. Write into file\n2. Read from file");
            int choice = scanner.nextInt();

            switch (choice) {
            case 1 -> {
                System.out.println("Enter the data you want to write in file: ");
                scanner.nextLine();
                String dataString = scanner.nextLine();

                FileWriter writer = new FileWriter(file, true);
                writer.write(dataString + "\n");
                writer.close();
            }

            case 2 -> {
                FileReader reader = new FileReader(file);
                int i;
                System.out.println("Reading file: ");
                while ((i = reader.read()) != -1)
                    System.out.print((char) i);
                reader.close();
            }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            scanner.close();
        }
    }
}

public class P03Q06 {
    public static void main(String[] args) {
        new Question6("./txt-files/question6.txt");
    }
}
