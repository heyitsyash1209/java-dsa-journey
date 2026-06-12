package DSA.Linkedlist;
import java.util.LinkedList;
public class creationofLL {
    public static void main(String[] args){
        //Access linked list in our program
    LinkedList<Integer> LL = new LinkedList<>();
    //Add element in our Linked list
    LL.add(5);
    LL.add(6);
    LL.add(17);
    System.out.println(LL);
    //Update element in our Linked list
    LL.set(1,4);
    LL.set(2,8);
    System.out.println(LL);
    //return the Size of linked list
    System.out.println(LL.size());
    // Acess any particular element
    int value = LL.get(2);
    System.out.println(value);
    // remove element in our Linked list
    LL.remove(1);
    System.out.println(LL);


    
}
}