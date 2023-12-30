import java.util.Scanner;

public class AtmInterface {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int pin = 101;
            int balance = 3657;
            System.out.println("Insert your card");
            System.out.println("Enter your pin:");
            int insertedpin = input.nextInt();
            if (insertedpin == pin) {
                System.out.println("Pin correct Welcome!");
            } else {
                System.out.println("Pin invalid");
            }
            while (insertedpin == pin) {
                System.out.println("1.Withdraw");
                System.out.println("2.Deposit");
                System.out.println("3.Balance:");
                System.out.println("4.Exit");
                System.out.println("Enter your option:");
                int option = input.nextInt();
                switch (option) {
                    case 1:
                        System.out.println("Enter the withdrawal amount:");
                        int withdrawAmount = input.nextInt();
                        if (balance >= withdrawAmount) {
                            balance = balance - withdrawAmount;
                            System.out.println("Transaction successfully completed");
                            System.out.println("Available Balance:" + balance);
                        } else {
                            System.out.println("Transaction Failed");
                            System.out.println("Insufficient balance");
                        }
                        break;
                    case 2:
                        System.out.println("Enter the deposit ammount:");
                        int depositAmount = input.nextInt();
                        balance = balance + depositAmount;
                        System.out.println("Amount is succesfully deposited into your account");
                        System.out.println("Available Balance:" + balance);
                        break;
                    case 3:
                        System.out.println("Balance" + balance);
                        break;
                    case 4:
                        System.out.println("Thank you! Visit Again");
                        break;
                }
                break;
            }
        }
    }
}