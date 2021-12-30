import java.io.*;
  
public class pr1 {
    public static void main(String[] args)
        throws IOException
    {
        File file = new File("Hello.txt");
        FileInputStream fin = new FileInputStream(file);
        InputStreamReader isr = new InputStreamReader(fin);
        BufferedReader bfr = new BufferedReader(isr);
  
        String line;
        int wordcount = 0;
        int charactercount = 0;
        int paracount = 0;
        int whitespacecount = 0;
        int sentencecount = 0;
  
        while ((line = bfr.readLine()) != null) {
            if (line.equals("")) {
                paracount += 1;
            }
            else {
                charactercount += line.length();
                String words[] = line.split("\\s+");
                wordcount += words.length;
                whitespacecount += wordcount - 1;
                String sentence[] = line.split("[!?.:]+");
                sentencecount += sentence.length;
            }
        }
        if (sentencecount >= 1) {
            paracount++;
        }
        System.out.println("Total word count = "+ wordcount);
        System.out.println("Total number of sentences = "+ sentencecount);
        System.out.println("Total number of characters = "+ charactercount);
        System.out.println("Number of paragraphs = "+ paracount);
        System.out.println("Total number of whitespaces = "+ whitespacecount);
    }
}