class Demo{
    public void a() throws Exception
    {
        System.out.println("In class a");
        b();
    }
    public void b() throws Exception{
        int num1=3;
        int num2 =0;
        int result = num1/num2;
    }
    public static void main(String[] args) {
        Demo ob = new Demo();
        try{
            ob.a();
        }
        catch(Exception e){
            System.out.println("Erro! "+e.getMessage());
        }
        
    }
}