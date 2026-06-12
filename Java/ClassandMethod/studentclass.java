package Java.ClassandMethod;
class student {
    static int roll = 90;
    Integer a1 = 90;
    Integer a2 = 90;
    int y = a1;
    void show(){
      System.out.println(a1 == a2); //==> reference of object
      System.out.println(a1.equals(a2));
      System.out.println(y);
    }
}
public class studentclass{
    public static void main(String args[]){
        student s = new student();
       s.show();

    }
}