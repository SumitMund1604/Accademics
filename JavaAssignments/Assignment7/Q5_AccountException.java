// Custom MinimumBalanceException for Account class

import java.util.Scanner;

class MinimumBalanceException extends Exception {
    MinimumBalanceException(String message) {
        super(message);
    }
}

class Account {
    String name;
    int acc_no;
    double balance;
    static final double MIN_BALANCE = 500;
    
    Account(String name, int acc_no, double balance) {
        this.name = name;
        this.acc_no = acc_no;
        this.balance = balance;
    }
    
    void deposit(double amt) {
        balance += amt;
        System.out.println("Deposited: " + amt);
        System.out.println("Current Balance: " + balance);
    }
    
    void withdraw(double amt) throws MinimumBalanceException {
        if (balance - amt < MIN_BALANCE) {
            throw new MinimumBalanceException("Withdrawal denied! Balance would fall below minimum balance of " + MIN_BALANCE);
        }
        balance -= amt;
        System.out.println("Withdrawn: " + amt);
        System.out.println("Current Balance: " + balance);
    }
    
    void displayInfo() {
        System.out.println("\n========== Account Information ==========");
        System.out.println("Name: " + name);
        System.out.println("Account No: " + acc_no);
        System.out.println("Balance: " + balance);
        System.out.println("========================================");
    }
}

public class Q5_AccountException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter account holder name: ");
        String name = sc.nextLine();
        
        System.out.print("Enter account number: ");
        int accNo = sc.nextInt();
        
        System.out.print("Enter initial balance: ");
        double balance = sc.nextDouble();
        
        Account acc = new Account(name, accNo, balance);
        acc.displayInfo();
        
        while (true) {
            System.out.println("\n1. Deposit\n2. Withdraw\n3. Check Balance\n4. Exit");
            System.out.print("Choose option: ");
            int choice = sc.nextInt();
            
            try {
                switch (choice) {
                    case 1:
                        System.out.print("Enter amount to deposit: ");
                        double depAmt = sc.nextDouble();
                        acc.deposit(depAmt);
                        break;
                    case 2:
                        System.out.print("Enter amount to withdraw: ");
                        double withAmt = sc.nextDouble();
                        acc.withdraw(withAmt);
                        break;
                    case 3:
                        acc.displayInfo();
                        break;
                    case 4:
                        System.out.println("Thank you!");
                        sc.close();
                        return;
                    default:
                        System.out.println("Invalid choice!");
                }
            } catch (MinimumBalanceException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}
