import java.util.*;
class Calc extends Thread{
    public void run()
    {
        System.out.println("****************************************************");
        Scanner ob =new Scanner(System.in);
        int num1,num2;
        System.out.println("Enter the first number:");
        num1 = ob.nextInt();
        System.out.println("Enter the second number:");
        num2 = ob.nextInt();
        try{
            Thread.sleep(3000);
        System.out.println("The addition of "+num1+" "+num2+" :"+(num1+num2));
        System.out.println("****************************************************");
    }
    catch(Exception e)
    {
        System.out.println(e);
    }



    }
}
class Message extends Thread{
    public void run(){
        for(int i=0;i<3;i++)
        {
            System.out.println("Focus is key to success");
        }
    }
}
 class Thread_Exp_3 {
    public static void main(String[] args) {
        System.out.println("Main funtion is Running........");
        Calc ob =new Calc();
        Message ob1 =new Message();
        ob1.start();
        ob.start();

    
    
    }
}
