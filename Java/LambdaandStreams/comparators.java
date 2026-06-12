
import java.util.*;

class students{
    int id;
    String name;
    int rollno;
    int marks;

     students(int id, String name, int rollno, int marks){
        this.id = id;
        this.name = name;
        this.rollno = rollno;
        this.marks = marks;
    }
    public String toString(){
        return id + " " + name + " " + rollno + " " + marks;

    }
    class MarkComparator implements Comparator<students>{
        public int compare(students s1 , students s2){
            return s1.id - s2.id;
        }
    }
}
public class comparators{
    public static void main(String[] args){
        ArrayList<students> students = new ArrayList<>();
        students st = new students(1, "Yash Gupta", 169, 86);
        students.add(st);
        students.add(new students(2, "Apoorva Singh",188, 84));
        students.add(new students(3, "Arjab Jain", 034 , 80));

        //Collections.sort(students, new MarkComparator());
        Collections.sort(students ,(s1,s2) -> (s1.id - s2.id));
        
        System.out.println(students);
        
   


    }

}