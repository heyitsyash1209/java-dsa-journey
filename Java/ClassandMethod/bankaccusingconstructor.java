package Java.ClassandMethod;
class BankAccount{
    int acc_id;
    String bank_holder;
    private double total_deposit;
    String bank_name;
    String DOB;

    public BankAccount(int acc_id , String bank_holder , double total_deposit , String bank_name , String DOB){
        this.acc_id = acc_id;
        this.bank_holder = bank_holder;
        this.total_deposit = total_deposit;
        this.bank_name = bank_name;
        this.DOB = DOB;
    }
    
    public void withdrawl( double amount){
            if(total_deposit > amount){
            total_deposit = total_deposit - amount;
            System.out.println(amount + " withdrawn successfully");
            System.out.println("Remaining Balance: " + total_deposit);
            }
            else{
                System.out.println("insufficient balance");
            }

    }

   public void deposit( double amount){
        total_deposit += amount;
    }
    
    void display(){
        System.out.println(acc_id + " " + bank_holder);
        System.out.println(total_deposit + " " + bank_name );
        System.out.println(DOB);
    }
}
public class bankaccusingconstructor{
    public static void main(String args[]){
        BankAccount b1 = new BankAccount(1012345 ,"Yash Gupta" , 40000 , "ICICI Bank Mainpuri" , "12-06-2006");
        BankAccount b2 = new BankAccount(3451727 , "Apporva Singh", 50000, "Punjab National Bank" , "23-04-1999");
        b1.display();
        b1.withdrawl(10000);
        b2.withdrawl(40000);
        b1.withdrawl(5000);
    }
}