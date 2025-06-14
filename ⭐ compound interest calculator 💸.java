import java.util.Scanner;

public class cal {
    public static void main(String[]args) {

        // Compound interest calculator

        Scanner cal = new Scanner(System.in);

        double principal;
        double rate;
        int timesCompounded;
        int years;
        double amount;

        System.out.println("Enter the principal amount: ");
        principal = cal.nextDouble();

        System.out.println("Enter the interest rate (in %): ");
        rate = cal.nextDouble() /100;

        System.out.println("Enter the # times compound per year: ");
        timesCompounded = cal.nextInt();

        System.out.println("Enter the # of years: ");
        years = cal.nextInt();

        amount = principal * Math.pow(1 + rate/timesCompounded,timesCompounded * years);

        System.out.println("The amount after " + years + " is: $" + amount);



        cal.close();
    }
}
