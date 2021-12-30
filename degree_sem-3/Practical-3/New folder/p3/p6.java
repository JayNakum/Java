package p3;
import java.io.*;
public class p6{
  public static void main(String[] args) throws IOException {
    FileInputStream source = null;
    FileOutputStream destination = null;

    try {
      source = new FileInputStream("source.txt");
      destination = new FileOutputStream("destination.txt");

      int temp;
      while ((temp = source.read()) != -1) {
        destination.write(temp);
      }

      System.out.println("info transfered to destination from source");
    }

    finally {
      if (source != null) {
        source.close();
      }

      if (destination != null) {
        destination.close();
      }
    }
  }
}