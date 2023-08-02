@FunctionalInterface
interface Car{
    void drive();
}
class Sol{
    public static void main(String[] args) {
        Car ob = ()-> System.out.println("driving..");
        ob.drive();
        
    }
}