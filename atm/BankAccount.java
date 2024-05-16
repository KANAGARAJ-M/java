// public class BankAccount {
//     private double balance;
//     private final String[] validPins;
//     public BankAccount(double initialBalance, String[] validPins) {
//         if (initialBalance > 0.0) {
//             balance = initialBalance;
//         }
//         this.validPins = validPins;
//     }
//     public void deposit(double amount) {
//         if (amount > 0.0) {
//             balance += amount;
//             System.out.println("Successfully deposited: " + amount);
//         } else {
//             System.out.println("Deposit amount must be positive.");
//         }
//     }
//     public void withdraw(double amount) {
//         if (amount > 0.0) {
//             if (amount <= balance) {
//                 balance -= amount;
//                 System.out.println("Successfully withdraw: " + amount);
//             } else {
//                 System.out.println("Insufficient funds.");
//             }
//         } else {
//             System.out.println("Withdrawal amount must be positive.");
//         }
//     }
//     public double getBalance() {
//         return balance;
//     }
//     public boolean verifyPin(String inputPin) {
//         for (String pin : validPins) {
//             if (pin.equals(inputPin)) {
//                 return true;
//             }
//         }
//         return false;
//     }
// }





import java.util.*;



public class BankAccount {
    private double balance;
    private final String[] validPins;
    private final String bankName;
    private final String accountNumber;

    public BankAccount(double initialBalance, String[] validPins, String bankName, String accountNumber) {
        if (initialBalance > 0.0) {
            balance = initialBalance;
        }
        this.validPins = validPins;
        this.bankName = bankName;
        this.accountNumber = accountNumber;
    }


    public void deposit(double amount) {
        
        // if(amount<4000){
        //     balance = balance;
        //     System.out.println("=========================SORRY WE COULD NOT PROCESS YOUR DEPOSIT=========================");
        //     System.out.println("Current Balance: $" + amount);
        //     System.out.println("=========================DEPOSIT AMOUNT MUST BETWEEN $40000=========================");
        // }
        // else
        if (amount<4000) {
            // System.out.println("=========================PLEASE ENTER THE AMOUNT BELOW 4000=========================");
            if(amount > 0.0){
            balance += amount;
            System.out.println("=========================DEPOSITED SUCCESSFULLY=========================");
            System.out.println("Successfully deposited: $" + amount);
            System.out.println("=========================DEPOSITED SUCCESSFULLY=========================");
            }else {
            // System.out.println("=========================YOU ENTERED WRONG NUMBER=========================");
            System.out.println("Deposit amount must be in range of 01 to 4000.");
            }
        }

        
    }

    public void withdraw(double amount) {
        if (amount > 0.0) {
            if (amount <= balance) {
                balance -= amount;
                System.out.println("Successfully withdrew: $" + amount);
            } else {
                System.out.println("Insufficient funds.");
            }
        } else {
            System.out.println("Withdrawal amount must be positive.");
        }
    }

    public double getBalance() {
        return balance;
    }

    public boolean verifyPin(String inputPin) {
        for (String pin : validPins) {
            if (pin.equals(inputPin)) {
                return true;
            }
        }
        return false;
    }

    public String getBankName() {
        return bankName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }
}

