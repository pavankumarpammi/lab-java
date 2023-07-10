// Create a superclass called Animal with a method makeSound()
//  that prints the sound made by the animal. 
//  Implement subclasses Dog, Cat, and Cow that inherit from the Animal class.
//   Implement the makeSound() 
// method in each subclass to print the sound made by a dog, cat, and cow, respectively.

class Animal{
    public void makeSound(){
        System.out.println("The Animal sounds!");
    }
}



class Dog extends Animal {
     public void makeSound(){
        System.out.println("Dog sound:Bow Bow Bow....");}
    
}
class Cat extends Animal {
     public void makeSound(){
        System.out.println("Cat : meow meow meow....");
     }
    
}
class Cow extends Animal {
    public void makeSound(){
       System.out.println("Cow :boo boo boo....");
    }
   
}
class SOl{
    public static void main(String[] args) {
        Animal ob =new Animal();
        ob.makeSound();
        Dog dog = new Dog();
        dog.makeSound();
        Cat cat = new Cat();
        cat.makeSound();
        Cow cow = new Cow();
        cow.makeSound();
    }
}
