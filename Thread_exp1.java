import java.util.*; 
public class Thread_exp1 {
    public static void main(String[] args) {
        int a,b; //initalizing a , b variable of integer
        Scanner ob =new Scanner(System.in);
        a = ob.nextInt();
        b = ob.nextInt();
        System.out.println("Before changing");
        System.out.println(a+b);
        String t = Thread.currentThread().getName();
        System.out.println(t);
        System.out.println(Thread.currentThread().getPriority());
        System.out.println("After changing");
        Thread n = Thread.currentThread();
        n.setName("Calc");
        n.setPriority(1);
        System.out.println(a+b);
        String  name = Thread.currentThread().getName();
        System.out.println(name);
        System.out.println(Thread.currentThread().getPriority());

    }
}
