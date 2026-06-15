
abstract class animal{
    abstract void sound();

    public void sleep(){
        System.out.println("the animal sleeps");
    }
}
class Dog extends animal{
    void sound(){
        System.out.println("dog barks");
    }
}
class Cat extends animal{
    void sound(){
        System.out.println("cat meow");
    }
}

class abstractanimals{
    public static void main(String[] args){
        Dog d = new Dog();
        Cat c = new Cat();
        d.sound();
        c.sound();

    }
}