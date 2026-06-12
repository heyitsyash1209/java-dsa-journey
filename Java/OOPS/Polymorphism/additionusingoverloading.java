//method overloading ---> compile time polymorphism
class calculator{
    int add( int a , int b){
        return a + b;
}
    double add(double a , double b ){
        return  a + b;
    }
    
    int add( int a , int b , int c){
        return a+b+c;
    }
}
class Advance_calculator extends calculator{
    int ad(int a , int b){
        return a + b + 10;
    }
    

}
public class additionusingoverloading{
    public static void main(String[] args){
        calculator calc1 = new calculator();
        System.out.println(calc1.add(2,3,4));
        System.out.println(calc1.add(1234 , 345));
        System.out.println(calc1.add(112,333,4564));
        System.out.println(calc1.add(546.56,67));

        Advance_calculator as = new Advance_calculator();
        System.out.println(as.ad(10,5));


    }

}

