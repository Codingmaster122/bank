import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static double balance = 0.0;

    public static void main(String[] args) {
        System.out.println("START");
        while (true) {
            System.out.println("\nType \"deposit\", \"withdraw\", \"balance\", or \"exit\":");
            String userChoice = sc.nextLine();

            if (userChoice.equalsIgnoreCase("deposit")) {
                handleDeposit();
            } else if (userChoice.equalsIgnoreCase("withdraw")) {
                handleWithdraw();
            } else if (userChoice.equalsIgnoreCase("balance")) {
                System.out.println("Current balance: $ " + balance);
            } else if (userChoice.equalsIgnoreCase("exit")) {
                System.out.println("Final balance: $ " + balance);
                break;
            } else {
                System.out.println("Invalid input. Try again.");
            }
        }
    }

    public static void handleDeposit() {
        System.out.println("Handling deposit...");

        while (true) {
            System.out.println("Enter Amount You want To Deposit: ");
            double depositAmount = sc.nextDouble(); 
            sc.nextLine(); 

            System.out.println("You Entered: " + depositAmount + ". Is this correct? Type \"yes\" or \"no\":");
            String finalChoice = sc.nextLine(); 

            if (finalChoice.equalsIgnoreCase("yes")) {
            	balance = balance + depositAmount; 
                System.out.println("deposited $ " + depositAmount);
                break;
            } else if (finalChoice.equalsIgnoreCase("no")) {
                System.out.println("Let's try again.");
              
            } else {
                System.out.println("Invalid choice. Please type \"yes\" or \"no\".");
            }
        }
    }

    public static void handleWithdraw() {
        System.out.println("Handling withdrawal...");
        
        while (true) {
            System.out.println("Enter Amount You want To Withdrawal: ");
            double withdrawalAmount = sc.nextDouble(); 
            sc.nextLine(); 

            System.out.println("You Entered: " + withdrawalAmount + ". Is this correct? Type \"yes\" or \"no\":");
            String finalChoice = sc.nextLine(); 

            if (finalChoice.equalsIgnoreCase("yes")) {
            	balance = balance - withdrawalAmount; 
                System.out.println("withdrawal $ " + withdrawalAmount);
                break;
            } else if (finalChoice.equalsIgnoreCase("no")) {
                System.out.println("Let's try again.");
              
            } else {
                System.out.println("Invalid choice. Please type \"yes\" or \"no\".");
            }
        }
    }
}
