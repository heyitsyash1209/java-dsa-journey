package Java.CollectionsFrameworkinJava;
import java.util.*;
class arraylist{
    public static void main(String[] args){
        List<String> codinglanguage = new ArrayList<>();
        codinglanguage.add( " java ");
        codinglanguage.add(1,"python");
        codinglanguage.add("c++");
        codinglanguage.add("ruby on rails");

        System.out.println(codinglanguage);
        // acess an upadte 
        System.out.println("the value of first index is"+codinglanguage.get(1));
        codinglanguage.set(1 , "anaconda");
        System.out.println(codinglanguage);
        codinglanguage.remove(3);
        System.out.println(codinglanguage);

        Collections.sort(codinglanguage);
        System.out.println(codinglanguage);


    }
}