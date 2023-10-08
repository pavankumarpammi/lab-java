// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Student{
int age;
int mark;
String name;
public Student(int mark,int age,String name)
{
    this.mark=mark;
    this.age=age;
    this.name=name;
}
public String toString(){
    return mark+"-"+age+"-"+name;
}
public int compareTo(Student b)
{
  if(this.mark>b.mark)
  return 1;
  else 
  return -1;
}
}
// class Alpha implements Comparator<Student>
// {
//   public int compare(Student a,Student b)
//   {
//     if(a.mark>b.mark)
//     {
//       return 1;
//     }
//     else{
//       return -1;
//     }
//   }
// }
class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        Student st1 =new Student(52,18,"jay");
        Student st2 =new Student(28,16,"jay1");
        Student st3 =new Student(47,19,"jay2");
        List<Student> lis=new ArrayList<Student>();
        lis.add(st1);
        lis.add(st2);
        lis.add(st3);
        System.out.println(lis);
       // Alpha a =new Alpha();
        // Collections.sort(lis,(Student a,Student b)->{
        //   if(a.mark>b.mark)
        //   return 1;
        //   else 
        //   return -1;
        // });
        Collections.sort(lis ,(Student a,Student b)->{
            if(a.mark>b.mark)
            return 1;
            else
            return -1;
        });
        System.out.println(lis);
        //Collections.sort(lis);

    }
}