class Mythread extends Thread{
    public void display(){
        System.out.println("MyThread Exception");
    }
}

public class Thread_exp_2 {
   public static void main(String[] args) {
    Mythread ob =new Mythread();
    Thread t =Thread.currentThread();
    t.setPriority(1);
    ob.start();
    ob.display();
    System.out.println(Thread.currentThread().getPriority());
   } 
}
