import java.util.*;
class Student{
    private String name;
    private int num;
    private String city;
    public Student(String name ,int num,String city)
    {
        this.name =name;
        this.num =num;
        this.city =city;
    }
    public String getName()
    {
        return name;
    }
    public String getCity()
    {
        return city;
    }
    public int getNum()
    {
        return num;
    }
}

public class Map_exp1 {
    public static void main(String[] args) {
        Student ob1 =new Student("Rohan",18,"Bangaluru");
        Student ob2 =new Student("Ramu",20,"mumbai");
        Student ob3 =new Student("Raj",20,"Delhi");
        Map map = new HashMap();
        map.put(1,ob1);
        map.put(2,ob2);
        map.put(3,ob3);
        System.out.println(map);

    }

}
