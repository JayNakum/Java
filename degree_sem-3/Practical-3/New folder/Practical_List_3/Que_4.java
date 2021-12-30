package Practical_List_3;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Que_4 {

    public static void main(String[] args) {
        try {
            FileOutputStream fileOS = new FileOutputStream("student.txt");
            String studentData = "Name : Vipul Chaudhary, Branch : Computer Science and Engineering";
            byte [] StudentDataInByte = studentData.getBytes();
            fileOS.write(StudentDataInByte);
            fileOS.close();
            System.out.println("successful written the data to file");
        } catch (Exception e) {
            System.out.println("Error : " + e);
        }
        System.out.println("Reading the data..........");
        try {
            FileInputStream fileIS = new FileInputStream("student.txt");
            int i = 0;
            while ((i = fileIS.read()) != -1) {
                System.out.print((char) i);
            }
            fileIS.close();
        } catch (Exception e) {
            System.out.println("Error : " + e);
        }
    }
}  