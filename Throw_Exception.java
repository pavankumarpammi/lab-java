
public class Throw_Exception {
    public static void main(String[] args) {
        int num1=9;
        int num2=-2;
        try{
            if(num2<0)
            {
                Exception e = new Exception("invalid number");
                throw e;
            }
            else{
                int result = num1/num2;
                System.out.println(result);
            }
        }

        catch(Exception e){
            System.out.println("   "+e.getMessage());
        }
        }
    }

