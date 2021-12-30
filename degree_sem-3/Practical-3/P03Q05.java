import java.io.File;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;

class StudentQue5 {
    private File file;
    private BufferedReader reader;
    private BufferedWriter writer;

    public StudentQue5(String filePath) {
        file = new File(filePath);
    }

    public void ReadData() {
        try {
            reader = new BufferedReader(new FileReader(file));
            String line = reader.readLine();
            while(line != null) {
                System.out.println(line);
                line = reader.readLine();
            }
            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found :/");
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
            
    }
    public void WriteData(String data) {
        try {
            writer = new BufferedWriter(new FileWriter(file));
            writer.write(data);
            writer.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found :/");
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

public class P03Q05 {
    public static void main(String[] args) {
        StudentQue5 obj = new StudentQue5("./txt-files/question5.txt");
        
        String data = "Name: Jay Nakum\nRoll Number: 20BCP304D\nBatch: CSE20\nSemester: 3rd\n";
        
        obj.WriteData(data);
        obj.ReadData();
    }
}
