class Animal{
    String name;
    String color;

    Animal(String name, String color){
        this.name  = name;//this keyword use to refer the current object
        this.color = color;
    }
     void eats(){
        System.out.println("the Aniaml eats");
     }
}
class Dog extends Animal{
     Dog(String name , String color){
        super(name , color);// super keyword is use to refer the parent class constructor , variables and methods
     }
    void bark(){
        System.out.println("dog is barking ");
    }
}
class Puppy extends Animal{
    Puppy(String name , String color){
        super(name , color);
    }
    void run(){
        System.out.println("the puppy is runnning");
    }
}
public class inheritsanimals{
    public static void main(String [] args){
        Dog d1 = new Dog("Bravo", "Brownishblack");
        d1.eats();
        d1.bark();
        Puppy p1 = new Puppy("max","Goldenyellowish");
        p1.eats();
        p1.run();

    }
}