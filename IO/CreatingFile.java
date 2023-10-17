import java.io.*;
public class CreatingFile {
    public static void main(String[] args)throws IOException {
       File dir =new File("Pw"); 
    //    System.out.println(dir.exists());
    //    dir.mkdir();
       File file=new File(dir,"pwskills.txt");
    //    file.createNewFile();
       //System.out.println(file.exists());
       FileWriter fw = new FileWriter(file,true);
       fw.write("Heading!!"+"\n");
       fw.write(65+"\n");
       fw.write(97);
       char ch[]={'j','a','v','a'};
       fw.write(ch);
       fw.write("\n");
       fw.close();

    }
}
