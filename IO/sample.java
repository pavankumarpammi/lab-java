import java.io.*;
class Sol{
    public static void main(String[] args) throws IOException {
        // File file1 =new File("pw.txt");
        // System.out.println(file1.exists());
        // file1.createNewFile();
        // System.out.println(file1.exists());
        // File dir =new File("pw");
        // System.out.println(dir.exists());
        // dir.mkdir();
        // System.out.println(dir.exists());
        File dir =new File("pwsillks");
        System.out.println(dir.exists());
        dir.mkdir();
        File file =new File(dir,"sample.txt");
        System.out.println(file.isFile());
    }
}