import java.util.*;

// public class ATM{
//     public static void main(String[] args){
//         Scanner scanner = new Scanner(System.in);
//         String[] validPins = {"1258", "3654", "5684", "0220"};
//         BankAccount account = new BankAccount(0.0, validPins);
//         System.out.print("Enter your PIN: ");
//         String inputPin = scanner.nextLine();
//         if(account.verifyPin(inputPin)){
//             while (true){
//                 System.out.println("Welcome to the ATM");
//                 System.out.println("1. Deposit Money");
//                 System.out.println("2. Withdraw Money");
//                 System.out.println("3. Check Balance");
//                 System.out.println("4. Exit");

//                 System.out.print("Choose an option: ");
//                 int choice = scanner.nextInt();

//                 switch (choice){
//                     case 1:
//                         System.out.print("Enter amount to deposit: ");
//                         double depositAmount = scanner.nextDouble();
//                         account.deposit(depositAmount);
//                         break;
//                     case 2:
//                         System.out.print("Enter amount to withdraw: ");
//                         double withdrawAmount = scanner.nextDouble();
//                         account.withdraw(withdrawAmount);
//                         break;
//                     case 3:
//                         System.out.println("Current balance: $" + account.getBalance());
//                         break;
//                     case 4:
//                         System.out.println("Thank you for using the ATM. Goodbye!");
//                         scanner.close();
//                         System.exit(0);
//                         break;
//                     default:
//                         System.out.println("Invalid option. Please try again.");
//                         break;
//                 }
//                 System.out.println();
//             }
//         } else{
//             System.out.println("Invalid PIN. Access denied.");
//         }
//     }
// }







// import java.util.Scanner;

// public class ATM {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         String[] bankNames = {"Canara Bank", "SBI Bank", "Indian Bank"};
//         String[] validPins = {"1234", "3654", "5684", "0220", "1274"};
//         String[] accountNumbers = {"12345678", "123456789", "1234567890"};

//         System.out.println("Select your Bank:");
//         System.out.println("=========================SELECT BANK=========================");
//         for (int i = 0; i < bankNames.length; i++) {
            
//             System.out.println((i + 1) + ". " + bankNames[i] + "\n");
            
//         }
//         System.out.println("=============================================================");
//         System.out.print("Enter your choice (1-3): ");
//         int bankChoice = scanner.nextInt();
//         scanner.nextLine();

//         if (bankChoice < 1 || bankChoice > 3) {
//             System.out.println("Invalid bank choice. Exiting.");
//             scanner.close();
//             return;
//         }

//         String selectedBankName = bankNames[bankChoice - 1];
//         String accountNumber = accountNumbers[bankChoice - 1];
//         // System.out.println(selectedBankName);

//         System.out.print("Enter your account number: ");
//         String inputAccountNumber = scanner.nextLine();

//         if (!inputAccountNumber.equals(accountNumber)) {
//             System.out.println("Invalid account number. Access denied.");
//             scanner.close();
//             return;
//         }

//         BankAccount account = new BankAccount(0.0, validPins, selectedBankName, accountNumber);

//         System.out.print("Enter your PIN: ");
//         String inputPin = scanner.nextLine();

//         if (account.verifyPin(inputPin)) {
//             while (true) {
//                 System.out.println("Welcome to " + account.getBankName() + " ATM");
//                 System.out.println("Your Account Number: "+ account.getAccountNumber());
//                 System.out.println("1. Deposit Money");
//                 System.out.println("2. Withdraw Money");
//                 System.out.println("3. Check Balance");
//                 System.out.println("4. Exit");

//                 System.out.print("Choose an option: ");
//                 int choice = scanner.nextInt();

//                 switch (choice) {
//                     case 1:
//                         System.out.print("Enter amount to deposit: ");
//                         double depositAmount = scanner.nextDouble();
//                         account.deposit(depositAmount);
//                         break;
//                     case 2:
//                         System.out.print("Enter amount to withdraw: ");
//                         double withdrawAmount = scanner.nextDouble();
//                         account.withdraw(withdrawAmount);
//                         break;
//                     case 3:
//                         System.out.println("Current balance: $" + account.getBalance());
//                         break;
//                     case 4:
//                         System.out.println("Thank you for using " + account.getBankName() + " ATM. Goodbye!");
//                         scanner.close();
//                         System.exit(0);
//                         break;
//                     default:
//                         System.out.println("Invalid option. Please try again.");
//                         break;
//                 }
//                 System.out.println();
//             }
//         } else {
//             System.out.println("Invalid PIN. Access denied.");
//         }
//     }
// }




public class ATM {
    private Bank bank;

    public ATM(Bank bank) {
        this.bank = bank;
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the ATM");
        
        System.out.print("Enter account number: ");
        String accountNumber = scanner.nextLine();
        
        if (!bank.validateAccount(accountNumber)) {
            System.out.println("Invalid account number.");
            return;
        }
        
        Account account = bank.getAccount(accountNumber);
        
        System.out.print("Enter PIN: ");
        String pin = scanner.nextLine();
        
        if (!account.getUser().validatePin(pin)) {
            System.out.println("Invalid PIN.");
            return;
        }
        
        while (true) {
            System.out.println("\n1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Transfer");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Balance: $" + account.getBalance());
                    break;
                case 2:
                    System.out.print("Enter deposit amount: ");
                    double depositAmount = scanner.nextDouble();
                    account.deposit(depositAmount);
                    System.out.println("==============================");
                    System.out.println();
                    System.out.println("Deposited: $" + depositAmount);
                    System.out.println();
                    System.out.println("==============================");
                    break;
                case 3:
                    System.out.print("Enter withdrawal amount: ");
                    double withdrawAmount = scanner.nextDouble();
                    if (account.withdraw(withdrawAmount)) {
                        System.out.println("==============================");
                        System.out.println();
                        System.out.println("Withdrawn: $" + withdrawAmount);
                        System.out.println();
                        System.out.println("==============================");
                   
                    } else {
                        System.out.println("==============================");
                        System.out.println();
                        System.out.println("Insufficient funds.");
                        System.out.println();
                        System.out.println("==============================");
                    }
                    break;
                case 4:
                    System.out.print("Enter recipient account number: ");
                    String recipientAccountNumber = scanner.next();
                    if (!bank.validateAccount(recipientAccountNumber)) {
                        System.out.println("Invalid recipient account number.");
                        break;
                    }
                    System.out.print("Enter transfer amount: ");
                    double transferAmount = scanner.nextDouble();
                    Account recipientAccount = bank.getAccount(recipientAccountNumber);
                    if (account.transfer(recipientAccount, transferAmount)) {
                        System.out.println("Transferred: $" + transferAmount);
                    } else {
                        System.out.println("Insufficient funds.");
                    }
                    break;
                case 5:
                    System.out.println("Thank you for using the ATM.");
                    return;
                default:
                    System.out.println("Invalid option.");
                    break;
            }
        }
    }

    public static void main(String[] args) {
        Bank bank = new Bank();
        User user1 = new User("Alice", "u123", "1234");
        User user2 = new User("Bob", "u456", "5678");
        
        bank.addAccount(new Account("12345", 1000.00, user1));
        bank.addAccount(new Account("67890", 500.00, user2));
        
        ATM atm = new ATM(bank);
        atm.start();
    }
}