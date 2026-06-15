
package Java.ClassandMethod;

class Student{
    String name;
    int rollno;
    int marks;

   Student(String name,int rollno ,int marks){
         this.name = name;
         this.rollno = rollno; 
         this.marks = marks;  
   }
    void display(){
        System.out.println(name + " " + rollno + " " + marks);
    }
}
class constructor{
    public static void main(String args[]){
        Student s1 = new Student("yash", 169 , 86);
        //s1.name = "yash";
        //s1.rollno = 169;
        //s1.marks = 8;
        //System.out.println(s1.name + " " + s1.rollno + " " + s1.marks);
    }
}
