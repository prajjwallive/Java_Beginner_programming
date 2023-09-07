class InsufficientBalance extends Exception {
    public InsufficientBalance(String message) {
        super(message);
    }
}

public class Bank {
     private double InitalBalance;

    public Bank(double in_blc) {
        InitalBalance = in_blc;
    }

    public void withdraw(double amount) throws InsufficientBalance {
        if (InitalBalance < amount) {
            throw new InsufficientBalance("Not Enough Balance!");
        } else {
            System.out.print("Amount withdrawn Successfully!");
            InitalBalance -= amount;
            System.out.println("Remaining Balance:"+InitalBalance);
        }
    }

    public static void  main(String args[]){
        Bank b1 = new Bank(125353.00);
        try{
            b1.withdraw(5000);
        }
        catch(InsufficientBalance e){
            System.out.println(e.getMessage());
        }
    }

}
