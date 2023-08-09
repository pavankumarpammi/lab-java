import java.util.*;
class Lib implements Runnable{
    String s1 = new String("Java");
    String s2 = new String("Sql");
    String s3 = new String("Spring");
    public void run()
    {
        String name = Thread.currentThread().getName();
        if(name.equals("Stu1")){
        try {
            synchronized(s1)
            {
                System.out.println("Student 1 acc "+s1);
                Thread.sleep(3000);
                synchronized(s2)
                 {
                System.out.println("Student 1 acc "+s2);
                Thread.sleep(3000);
                synchronized(s3)
                {
                    System.out.println("Student 1 acc "+s3);//dead lock
                }
                }
            }
        } 
        catch (Exception e) {
        
        }
    }
    else{
        try {
            synchronized(s3)
            {
                Thread.sleep(3000);
                System.out.println("Student 2 acc "+s1);
                synchronized(s2)
                 {
                System.out.println("Student 2 acc "+s2);
                Thread.sleep(3000);
                synchronized(s1)
                {
                    System.out.println("Student 2 acc "+s3);//dead lock
                }
                }
            }
        } 
        catch (Exception e) {
        
        }
    }
    }
}

public class Thread_Exp7 {
    public static void main(String[] args) {
        Lib ob =new Lib();
        Thread t1 =new Thread(ob);
        Thread t2 =new Thread(ob);
        t1.setName("Stu1");
        t2.setName("Stu2");
        t1.start();
        t2.start();
    }
}
