import java.util.Scanner;
class Largest {

    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        double n1 ,n2,n3;
        n1 = ob.nextDouble();
        n2 = ob.nextDouble();
        n3 = ob.nextDouble();

        if(n1 >= n2) {
            if(n1 >= n3)
                System.out.println(n1 + " is the largest number.");
            else
                System.out.println(n3 + " is the largest number.");
        } else {
            if(n2 >= n3)
                System.out.println(n2 + " is the largest number.");
            else
                System.out.println(n3 + " is the largest number.");
        }
    }
}