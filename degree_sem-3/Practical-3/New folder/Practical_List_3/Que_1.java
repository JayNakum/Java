package Practical_List_3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Que_1 {
    public static void main(String[] args) {
        int i = 0;
        StringBuilder dataFromFile = new StringBuilder();
        try {
        File f = new File("D:\\College\\Sem 3\\Java lab\\Codes - Lab\\src\\Practical_List_3\\file.txt");
            Scanner fileReading = new Scanner(f);
        while (fileReading.hasNextLine()){
            i++;
            String tempData = fileReading.nextLine() + " ";
            dataFromFile.append(tempData);
        }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println(dataFromFile);
        System.out.println("There is "+ i +"sentences");
        System.out.println("There is " + dataFromFile.length() + " character");
        char [] ch= new char[dataFromFile.length()];
        int spaceCounter = 0;
        for(int j=0;j<dataFromFile.length();j++)
        {
            ch[j]= dataFromFile.charAt(j);
            if(ch[j]==' ')
                spaceCounter++;
        }
        System.out.println("There is " + spaceCounter + " words");
    }
}
