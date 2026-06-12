class Appliance{
    void turnOn(){
        System.out.println("turn on the all applioences");
    }
}
class Toaster extends Appliance{
        void turnOn(){
            System.out.println("Toaster is on");
        }
    }
public class implementInheritance{
    public static void main(String[] args){
        Appliance a1 = new Appliance();
        a1.turnOn();
        Toaster t1 = new Toaster();
        t1.turnOn();
    }
}