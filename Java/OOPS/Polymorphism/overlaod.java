class Printer{
    void printdocument(int copies){
        System.out.println("the copies is:" + copies);
    }
     void printdocument( String message){
        System.out.println("the Secert message is:" + message);
     }
}
public class overlaod{
    public static void main(String[] args){
        Printer p1 = new Printer();
       p1.printdocument(4);
       p1.printdocument("hye");
    }
}