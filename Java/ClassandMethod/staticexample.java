package Java.ClassandMethod;
class Student {
    static int roll = 90;
    
    static void display(){
        System.out.println("somthing");

    }
}
class staticexample{
    public static void main(String args[]){
        System.out.println(Student.roll);
        Student.display();
        System.out.println("start small");
    }
}