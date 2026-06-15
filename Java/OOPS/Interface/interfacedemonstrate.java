package Java.OOPS.Interface;

interface Dog{
    void sound();
}
interface cat{
    void sound();
}
class Puppy implements cat,Dog{
    public void sound(){
        System.out.println("the puppy woofs");
    }
}
class interfacedemonstrate{
    public static void main(String[] args){
        Puppy p1 = new Puppy();
        p1.sound();

        
    }
}
