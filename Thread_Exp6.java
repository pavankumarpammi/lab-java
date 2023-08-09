import java.util.*;
class Car implements Runnable{
     public void run()
    {
        try{
            System.out.println(Thread.currentThread().getName()+" Enter into a Parking lot");
            Thread.sleep(2000);
            synchronized(this){
            System.out.println(Thread.currentThread().getName()+" Entered into a car");
            Thread.sleep(2000);
            System.out.println(Thread.currentThread().getName()+" Started the car");
            Thread.sleep(2000);
            System.out.println(Thread.currentThread().getName()+" Came Back and parked");
            Thread.sleep(2000);}
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
class Sol {
    public static void main(String[] args) {
        Car ob =new Car();
        Thread t1 =new Thread(ob);
        Thread t2 =new Thread(ob);
        Thread t3 =new Thread(ob);
        t1.setName("Son-1");
        t2.setName("Son-2");
        t3.setName("Son-3");
        t1.start();
        t2.start();
        t3.start();
    }
}
