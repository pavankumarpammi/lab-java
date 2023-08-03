import java.util.Scanner;
public class TryWithResource {
    
 /**
 * @param args
 */
public static void main(String[] args) {
    // @TryWithResource
    int num=0;
    try(Scanner sc=new Scanner(System.in))
    {
         num = sc.nextInt();
    }
    catch(Exception e)
    {
        System.out.println(e);
    }
    finally{
        System.out.println(num);
    }
    
 }   
}
