package Practical_List_3;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Que_5 {
    public static void main(String[] args) throws IOException {
        File file = new File("D:\\College\\Sem 3\\Java lab\\Codes - Lab\\src\\Practical_List_3\\StudentDetails.txt");

        if (file.createNewFile()) {
            System.out.println("File created");
        }

        String[] data = new String[3];
        Scanner sc = new Scanner(System.in);

        FileWriter fw = new FileWriter(file);
        BufferedWriter bfw = new BufferedWriter(fw);

        System.out.println("Enter name of Student");
        data[0] = sc.nextLine();
        System.out.println("Enter Branch of Student");
        data[1] = sc.nextLine();
        System.out.println("Enter Roll number of Student");
        data[2] = sc.nextLine();

        bfw.write(Arrays.toString(data));
        bfw.newLine();
        bfw.close();


    }
}
