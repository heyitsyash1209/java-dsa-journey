import java.util.Scanner;
abstract class shapes{
    abstract void area();

    public void shape(){
        System.out.println("area of types of shapes");
    }

}
class circle extends shapes{
    int radius;
     void area (){
        double result = 3.14 * radius * radius;
        System.out.println("area of circle is : 45" + result);

    }
}
class rectangle extends shapes{
    int l;
    int b;
    void area(){
        double result = l * b;
        System.out.println("area of rectengle:"+ result);
    }
}
class abstractshapes{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        circle c = new circle();
        rectangle r = new rectangle();

        c.radius = sc.nextInt();
         r.l = sc.nextInt();
        r.b = sc.nextInt();

        c.area();
        r.area();
    
    }
}
