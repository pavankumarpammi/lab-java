import java.util.Scanner;
class Myexpection extends Exception{
public void display()
{
    System.out.println("Something went wrong!");
}
}
public class Throw_expection_2 {
    public static void main(String[] args) throws Myexpection {
        int num ;
        try(Scanner ob =new Scanner(System.in)){
        num= ob.nextInt();
        char str = (char)num;
        String res =((Object)num).getClass().getSimpleName();
        System.out.println(((Object)str).getClass().getSimpleName());
        if(res.equals("Character")){
            System.out.println("true");
        }
        else{
            //Myexpection ob1 = new Myexpection();
            throw new Myexpection();
            }
        System.out.println(str);
        
    }
    catch(Myexpection e)
    {
        System.out.println("In exception block");
        System.out.println(e.getMessage());
    }

    }
}
