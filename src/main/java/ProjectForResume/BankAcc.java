package ProjectForResume;

import java.util.Scanner;

public class BankAcc {
    int balance, previousTransaction;
    String name, ID;

    public BankAcc(String name, String ID) {
        this.name = name;
        this.ID = ID;
    }

    void deposit(int amount) {
        if (amount != 0) {
            balance += amount;
            previousTransaction = amount;
        }
    }

    void withdraw(int amount) {
        if (amount != 0) {
            balance -= amount;
            previousTransaction = -amount;
        }
    }

    void getPreviousTranstion() {
        if (previousTransaction > 0) {
            System.out.println("Deposited: " + previousTransaction);
        } else if (previousTransaction < 0) {
            System.out.println("Withdrawn: " + Math.abs(previousTransaction));
        } else {
            System.out.println("No transaction occurred!!!");
        }
    }


    public void showMenu() {
        char options = '\0';
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome: " + name);
        System.out.println("Your ID is: " + ID);
        System.out.println("\n" + "1. Check Balance\n" + "2. Deposit\n" + "3. Withdraw\n" + "4. Last Transaction\n" + "5. Exit");
        do {
            System.out.println("<--------------------------------------------------------------------------------------------------------------------->");
            System.out.println("Enter a option ");
            System.out.println("<--------------------------------------------------------------------------------------------------------------------->");
            options = sc.next().charAt(0);
            System.out.println("\n");
            switch (options) {
                case '1':
                    System.out.println("<--------------------------------------------------------------------------------------------------------------------->");
                    System.out.println("Balance: " + balance);
                    System.out.println("<--------------------------------------------------------------------------------------------------------------------->");
                    System.out.println("\n");
                    break;
                case '2':
                    System.out.println("<--------------------------------------------------------------------------------------------------------------------->");
                    System.out.println("Enter the amount to deposit: ");
                    System.out.println("<--------------------------------------------------------------------------------------------------------------------->");
                    int amount = sc.nextInt();
                    deposit(amount);
                    System.out.println("\n");
                    break;
                case '3':
                    System.out.println("<--------------------------------------------------------------------------------------------------------------------->");
                    System.out.println("Enter the amount to withdraw: ");
                    System.out.println("<--------------------------------------------------------------------------------------------------------------------->");
                    int amount2 = sc.nextInt();
                    withdraw(amount2);
                    System.out.println("\n");
                    break;
                case '4':

                    System.out.println("<--------------------------------------------------------------------------------------------------------------------->");
                    getPreviousTranstion();
                    System.out.println("<--------------------------------------------------------------------------------------------------------------------->");
                    System.out.println("\n");
                    break;
                case '5':
                    System.out.println("*********************************************************************");
                    System.out.println("Have a great day!!!");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid option!! Please try again");
                    break;
            }
        } while (options != 'E');
        System.out.println("Thank you for choosing the services");
    }


}

