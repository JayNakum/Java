package Practical_List_3;

import java.io.*;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Que_3 {
    public static void main(String[] args) {
        File file = new File("D:\\College\\Sem 3\\Java lab\\Codes - Lab\\src\\Practical_List_3\\DuplicateLineFile.txt");
        Set<String> dataSet = new HashSet<String>();
        try {
            Scanner fileReader = new Scanner(file);
            while (fileReader.hasNextLine()) {
                String data = fileReader.nextLine();
                dataSet.add(data);
            }
            Arrays [] dataArr = new Arrays[dataSet.size()];
                try {
                    BufferedWriter fw = new BufferedWriter(new FileWriter(file));
                    for(String s :dataSet ) {
                        System.out.println(s);
                        fw.write(s +"\n");
                    }
                    fw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
