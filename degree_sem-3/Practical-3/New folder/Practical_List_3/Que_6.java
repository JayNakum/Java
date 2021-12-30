package Practical_List_3;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Que_6 {
    public static void main(String[] args) throws IOException {
        File file = new File("data.txt");
        Scanner cin = new Scanner(System.in);

        if (file.createNewFile()) {
            System.out.println("File created");
        }

        try {
            System.out.println("Press 1 for Write , 2 for Read");
            int choice = cin.nextInt();

            switch (choice) {
                case 1 -> {
                    System.out.println("Enter the data you want to write in file");
                    String Tempstr = cin.nextLine();
                    String dataString = cin.nextLine();

                    //true for rewrite data
                    FileWriter fw = new FileWriter(file , true);
                    fw.write(dataString+"\n");
                    fw.close();
                }

                case 2 -> {
                    FileReader fr = new FileReader(file);
                    int i;
                    System.out.println("Data is : ");
                    while ((i = fr.read()) != -1)
                        System.out.print((char) i);
                    fr.close();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
