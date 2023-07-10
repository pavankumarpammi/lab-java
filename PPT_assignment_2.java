// Create a superclass called Shape with an abstract method calculateArea() that returns the area of the 
// shape. Implement subclasses Rectangle, Circle, and Triangle that inherit from the Shape class.
//  Implement the calculateArea() method in each subclass to calculate and return the
//   area of a rectangle, circle, and triangle, respectively.
//  Then, create a class called ShapeCalculator with a method printArea(Shape shape) that accepts an object of type Shape and prints its area. 
// Demonstrate polymorphism by passing instances of different subclasses to the printArea() method.






import java.util.*;
abstract class shape
{
 int a,b;
 abstract public void calculateArea();
}
class Rectangle extends shape
{
public int area_rect;
public void calculateArea()
{
  Scanner s=new Scanner(System.in);
  System.out.println("enter the length and breadth of rectangle");
  a=s.nextInt();
  b=s.nextInt();
  area_rect=a*b;
  System.out.println("Length of rectangle "+a +"breadth of rectangle "+b);	
  System.out.println("The area ofrectangle is:"+area_rect);
 }
 }
class Triangle extends shape
{
 double area_tri;
 public void calculateArea()
{
Scanner s=new Scanner(System.in);
System.out.println("enter the base and height of triangle");
a=s.nextInt();
b=s.nextInt();
System.out.println("Base of triangle "+a +"height of triangle  "+b);
area_tri=(0.5*a*b);
System.out.println("The area of triangle is:"+area_tri);
}
}
class Circle extends shape
{
double area_circle;
public void calculateArea()
{
Scanner s=new Scanner(System.in);
System.out.println("enter the radius of circle");
a=s.nextInt();
 area_circle=(3.14*a*a);
 System.out.println("Radius of circle"+a);
 System.out.println("The area of circle is:"+area_circle);
 }
}
 class SOL
{
 public static void main(String[] args) 
{
Rectangle r=new Rectangle();
r.calculateArea();
 Triangle t=new Triangle();
 t.calculateArea();
Circle r1=new Circle();
r1.calculateArea();
}
}