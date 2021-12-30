import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

class StudentQue4 {
    private String filePath;
    private FileInputStream fileIn;
    private FileOutputStream fileOut;

    public StudentQue4(String filePath) {
        this.filePath = filePath;
    }

    public void ReadData() {
        try {
            fileIn = new FileInputStream(filePath);
            int i = 0;
            while ((i = fileIn.read()) != -1) {
                System.out.print((char) i);
            }
            fileIn.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found :/");
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
            
    }
    public void WriteData(String data) {
        try {
            fileOut = new FileOutputStream(filePath);
            byte b[] = data.getBytes();
            fileOut.write(b);
            fileOut.close();
            // System.out.println("File written successfully :)");
        } catch (FileNotFoundException e) {
            System.out.println("File not found :/");
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

public class P03Q04 {
    public static void main(String[] args) {
        StudentQue4 obj = new StudentQue4("./txt-files/question4.txt");
        
        String data = "Name: Jay Nakum\nRoll Number: 20BCP304D\nBatch: CSE20\nSemester: 3rd\n";
        
        obj.WriteData(data);
        obj.ReadData();
    }
}
