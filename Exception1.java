public class Exception1 {
    public static void main(String[] args) {
        int num1=5;
        int num2=0;
        int result;
        try{
            result=num1/num2;
        }
        catch(Exception obj){
            System.out.println("something went wrong! "+obj);

        }
    }
}
