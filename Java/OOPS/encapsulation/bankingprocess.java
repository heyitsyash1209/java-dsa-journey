
class BankAccount {

    // PRIVATE → data hiding (encapsulation core)
    private int acc_id;
    private String bank_holder;
    private double total_deposit;
    private String bank_name;
    private String DOB;

    //DEFAULT (no modifier) → accessible within same package
    BankAccount() {
        System.out.println("Default constructor called");
    }

    // PUBLIC → constructor accessible everywhere
    public BankAccount(int acc_id, String bank_holder, double total_deposit,
                        String bank_name, String DOB) {
        this.acc_id = acc_id;
        this.bank_holder = bank_holder;
        this.total_deposit = total_deposit;
        this.bank_name = bank_name;
        this.DOB = DOB;
    }

    // PUBLIC getters (controlled access to private data)
    public int getAccId() {
        return acc_id;
    }

    public String getBankHolder() {
        return bank_holder;
    }

    public double getTotalDeposit() {
        return total_deposit;
    }

    public String getBankName() {
        return bank_name;
    }

    public String getDOB() {
        return DOB;
    }

    // PUBLIC setters (controlled modification)
    public void setBankHolder(String bank_holder) {
        this.bank_holder = bank_holder;
    }

    public void setBankName(String bank_name) {
        this.bank_name = bank_name;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    // ✅ ROTECTED → can be used in subclass (inheritance use case)
    protected void addInterest(double rate) {
        total_deposit += total_deposit * rate / 100;
        System.out.println("Interest added using protected method");
    }

    // PUBLIC methods → main operations
    public void deposit(double amount) {
        if (amount > 0) {
            total_deposit += amount;
            System.out.println(amount + " deposited successfully");
        }
    }

    public void withdrawal(double amount) {
        if (total_deposit >= amount) {
            total_deposit -= amount;
            System.out.println(amount + " withdrawn successfully");
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    public void display() {
        System.out.println("Account ID : " + acc_id);
        System.out.println("Holder Name : " + bank_holder);
        System.out.println("Balance : " + total_deposit);
        System.out.println("Bank Name : " + bank_name);
        System.out.println("DOB : " + DOB);
    }
}

// Same package class → can access DEFAULT constructor
class bankingprocessencap {

    public static void main(String[] args) {

        BankAccount b1 = new BankAccount(
                1012345,
                "Yash Gupta",
                40000,
                "ICICI Bank",
                "12-06-2006"
        );

        b1.display();

        b1.deposit(5000);
        b1.withdrawal(10000);

        b1.setBankHolder("Yashu Gupta");
        System.out.println("Updated Name: " + b1.getBankHolder());

        // using protected method via same class (not directly from outside subclass scenario)
        b1.addInterest(5);
        b1.display();
    }
}