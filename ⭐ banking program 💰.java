
import java.util.Scanner;

public class banking {

    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){

//JAVA BANKING PROGRAM ....

        
        double balance = 0;
        boolean isRunning = true;
        int choice;

        while(isRunning){
            System.out.println("*****************");
            System.out.println("BANKING PROGARM");
            System.out.println("*****************");
            System.out.println("1. Show Balance");
            System.out.println("2. Deposiet ");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.println("*****************");

        // Get here your choice

            System.out.println("Enter your choice (1-4): ");
            choice = scanner.nextInt();

            

            switch(choice){
                case 1 -> showBalance(balance);
                case 2 -> balance = balance + deposit();
                case 3 -> balance = balance - withdraw(balance);
                case 4 ->  isRunning = false;
                default -> System.out.println("Invalid choice");
            }
            

        }
        System.out.println("**************************");
        System.out.println("Thank you! Have a Nice day");
        System.out.println("**************************");
        scanner.close();
    }   
        
        // Show Balance
    static void showBalance(double balance){
        System.out.printf("$%.2f\n", balance);
    } 
       // Deposit
    static double deposit(){

        double amount;

        System.out.println("Enter an amount to be deposited: ");
        amount = scanner.nextDouble();

        if (amount < 0){
            System.out.println("Amount can't be negative");
            return 0;
        }
        else{
            return amount;
        }
        

    }
       // Withdraw
    static double withdraw(double balance){

        double amount;

        System.out.print("Enter amount to be withdrawn: ");
        amount = scanner. nextDouble();

        if (amount > balance){
            System.out.println("Insufficient funds");
            return 0; 
        }
        else if(amount < 0){
            System.out.println("Amount can't be negative");
            return 0;
        }
        else {
            return amount;
        }

    }






}
