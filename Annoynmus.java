interface Car{
    void drive();
}
class Sol{
    public static void main(String[] args) {
        Car ob = new Car() {
            public void drive() {
                // TODO Auto-generated method stub
                System.out.println("Driving...");
            }
        };
        ob.drive();
    }
}