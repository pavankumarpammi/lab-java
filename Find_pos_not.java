import java.util.Scanner;

class Sol{
    public void check(int num)
    {
        if(num>=0)
        {
            System.out.println("It is a positive number");
        }
        else{
            System.out.println("It is a negitive number");
        }
    }
    public static void main(String[] args) {
        int num1;
        Scanner ob = new Scanner(System.in);
        num1 = ob.nextInt();
        Sol obj = new Sol();
        obj.check(num1);
    }
}