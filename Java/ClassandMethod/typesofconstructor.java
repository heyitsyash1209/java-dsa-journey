package Java.ClassandMethod;
class dog {
    String name;
    String color;
    int height;

    dog() {
        
        this(10 , "tomy");
       // this("tommy");
       

        System.out.println("default consctructor");
    }

    dog( int h , String n){
        // this.name = n;
       //  this.color = c;
        //this.height = h;
        System.out.println(h + " " + n );
       // System.out.println(n);

        System.out.println("parametrized constructor called");
    }

  //  void display() {
        //System.out.println("the name of dog is : " + name);
        //System.out.println("the color of dog is : " + color);
        //System.out.println("the height of the dog is : " + height);
       // System.out.println(name + " " + color + " " + height );
    //}
}

public class typesofconstructor {
    public static void main(String args[]) {

       dog d1 = new dog();
       // dog d2 = new dog("Bravo" , "brown" , 7);
        
        //d1.display();
        //id2.display();
    }
}