class Car{
    class Enginee{
        public void drive()
        {
            System.out.println("started!");
        }
    }
}
class Sol{
    public static void main(String args[])
    {
        Car ob =new Car();
        //method 1
        Car.Enginee obj = ob.new Enginee();
        obj.drive();
        //method 2
        new Car().new Enginee().drive();
        //method 3
        ob.new Enginee().drive();
    }
}