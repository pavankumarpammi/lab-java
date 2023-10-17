import java.io.*;
public class ReadingFile {
    public static void main(String[] args) throws Exception {
        File dir =new File("Pw");
        File file =new File(dir, "pwskills.txt");
        FileReader fr =new FileReader(file);
        int i=fr.read();
        char ch[]= new char[(int)file.length()];

        fr.read(ch);
        for(char a:ch)
        {
            System.out.println(a);
        }
        // while(i!=-1)
        // {
        
        // System.out.print((char)i);
        // i=fr.read();
        // }
    }
}
