package Practical_List_3;

import java.io.*;
import java.util.Scanner;

public class Que_2 {
    public static void main(String[] args) {
        File sourceFile = new File("D:\\College\\Sem 3\\Java lab\\Codes - Lab\\src\\Practical_List_3\\file.txt");
        File targetFile = new File("D:\\College\\Sem 3\\Java lab\\Codes - Lab\\src\\Practical_List_3\\ResultFile.txt");
        try{
            FileReader fr = new FileReader(sourceFile);
            FileWriter fw = new FileWriter(targetFile);
            String dataFromFile = "";
            Scanner fileDataReader = new Scanner(fr);
            while(fileDataReader.hasNextLine())
            {
                dataFromFile = fileDataReader.nextLine().toUpperCase();
            }
            fw.write(dataFromFile);
            fw.close();
            System.out.println(dataFromFile);

        }catch(IOException e){
            System.out.println("There was error occurred : " + e);
        }


    }
}
