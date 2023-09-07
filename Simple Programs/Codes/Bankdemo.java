// class InsufficientBalance extends Exception {
//     public InsufficientBalance(String message) {
//         super(message);
//     }
// }

// class Bank {
//     private double InitalBalance;

//     public Bank(double In_Balance) {
//         InitalBalance = In_Balance;
//     }

//     public void withdraw(double amount) throws InsufficientBalance {
//         if (InitalBalance < amount) {
//             throw new InsufficientBalance("Paisa Pugena!");
//         } else {
//             InitalBalance -= amount;
//             System.out.println("Remaining Balance:" + InitalBalance);
//         }
//     }
// }

// public class Bankdemo {
//     public static void main(String[] args){
//         Bank us1 = new Bank(12000.2454);
//         try{
//             us1.withdraw(1000);
//         }
//         catch(InsufficientBalance e)
//         {
//             System.out.println("Exception Caught:"+e.getMessage());
//         }
//     }

// }