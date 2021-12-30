/*
IA2.txt:
    Hello World by Jay Nakum
*/

import java.util.Scanner;
import java.io.FileWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

class OnlyAlphabets extends Exception {
    public OnlyAlphabets() {
        System.err.println("Only Alphabets are allowed");
        super.printStackTrace();
    }
    public void printMsg(String msg) {
        System.out.println(msg);
    }
}

class IA2 {
    private File file;
    void readFile(String fileName){
        this.file = new File(fileName);
        try {
            Scanner myReader = new Scanner(file);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data.toUpperCase());
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found :/");
            e.printStackTrace();
        }
    }

    void writeFile(String fileName) throws IOException{
        this.file = new File(fileName);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter data to write in file: ");
        String data = sc.nextLine();
        FileWriter writer = new FileWriter(file);
        sc.close();
        try {
            for(int index = 0 ; index < data.length() ; index++) {
                if(data.charAt(index) >= 'a' && data.charAt(index) <= 'z' || data.charAt(index) >= 'A' && data.charAt(index) <= 'Z' || data.charAt(index) <= ' ') {
                    continue;
                }
                throw new OnlyAlphabets();
            }
            writer.write(data);
            System.out.println("Successfully wrote to the file :)");
        } catch (OnlyAlphabets oa) {
            System.out.println(":(");
        } 
        finally{
            writer.close();
        }
    }
}

public class JayNakum {
    public static void main(String[] args) throws IOException {
        // Scanner sc = new Scanner(System.in);
        // String fileName = sc.next();
        // sc.close();
        IA2 obj = new IA2();
        // "IA2.txt" file should already exists in the same directory
        obj.readFile("IA2.txt"); 
        obj.writeFile("IA2.txt");
    }
}