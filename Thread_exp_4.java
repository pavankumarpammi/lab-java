import java.util.*;
class Exp extends Thread{
    public void run()
    {
        String tName = Thread.currentThread().getName();
        if(tName.equals("calc"))
        {
            calc();
        }
        else{
            print();
        }
    }
 public void calc()
 {
    System.out.println("****************************************************");
    Scanner ob =new Scanner(System.in);
    int num1,num2;
    System.out.println("Enter the first number:");
    num1 = ob.nextInt();
    System.out.println("Enter the second number:");
    num2 = ob.nextInt();
    try{
        Thread.sleep(1000);
    System.out.println("The addition of "+num1+" "+num2+" :"+(num1+num2));
    System.out.println("****************************************************");
}
catch(Exception e)
{
    System.out.println(e);
}

 }

    
public void print(){
        
            try{
                for(int i=0;i<3;i++)
                 {   
                System.out.println("Focus is key to success");
               
                Thread.sleep(2000);
            }
                
            }
            catch(Exception e)
            {
                System.out.println(e.getMessage());
            }
            
      }     
 }

 class Thread_Exp_4 {
    public static void main(String[] args) {
        System.out.println("Main funtion is Running........");
        // Calc ob =new Calc();
        // Message ob1 =new Message();
        // Thread t1 = new Thread(ob);
        // Thread t2 = new Thread(ob1);
        // t1.start();
        // t2.start();
        Exp t1 =new Exp();
        Exp t2 =new Exp();
        //Thread t2 =new Thread();
        t1.setName("calc");
        t2.setName("print");
        t1.start();
        t2.start();


    
    
    }
}
