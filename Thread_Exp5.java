import java.util.*;
class Printing implements Runnable{
    public void run(){
        try{
            for(int i=0;i<3;i++)
            {
                System.out.println("focus is important to achieve goals");
                Thread.sleep(3000);
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
class Sol{
    public static void main(String[] args) {
        System.out.println("Main Thread is started!");
        Printing ob = new Printing();
        Thread t =new Thread(ob);
        System.out.println(t.isAlive());
        t.start();
        System.out.println(t.isAlive());
        try {
            t.join();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
        System.out.println("Main Thread finished work");
    }
}