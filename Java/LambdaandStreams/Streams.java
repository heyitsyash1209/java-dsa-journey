package Java.LambdaandStreams;
import java.util.List;
import java.util.stream.Collectors;
public class Streams{
    public static void main(String[] args){
        List<String> rawData = List.of("apple","banana","orange","Avacado","pomegranate","Dragon fruit");
        List<String> onlyAwords = rawData.stream() 
        .filter(word -> word.startsWith("a"))
        .collect(Collectors.toList());
        System.out.println("original list" +rawData);
         System.out.println("original list" + onlyAwords);


    }
}