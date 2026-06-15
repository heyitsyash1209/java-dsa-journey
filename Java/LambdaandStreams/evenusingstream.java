

import java.util.List;
public class evenusingstream{
    public static void main(String[] args){
        //source data
        List<Integer> numbers = List.of(1,2,3,4,5,6);
        System.out.println("keeping only the even numbers");
        numbers.stream()
        .filter(n -> n % 2 == 0)
        .forEach(System.out::println);

    
    }
}