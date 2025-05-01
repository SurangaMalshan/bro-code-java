import java.util.Scanner;

public class Converter {
    public static void main(String[] args) {

        // WEIGHT CONVERSION PROGRAM
        try (Scanner scanner = new Scanner(System.in)) {
            double weight;
            double newWeight;
            int choice;

            System.out.println("Weight Conversion Program");
            System.out.println("1: Convert lbs to kgs");
            System.out.println("2: Convert kgs to lbs");
            System.out.print("Choose conversion type (1 or 2): ");
            choice = scanner.nextInt();

            if (choice == 1) {
                System.out.print("Enter the weight in lbs: ");
                weight = scanner.nextDouble();
                newWeight = weight * 0.453592;
                System.out.printf("The weight in kgs is: %.2f\n", newWeight);
            } else if (choice == 2) {
                System.out.print("Enter the weight in kgs: ");
                weight = scanner.nextDouble();
                newWeight = weight / 0.453592;
                System.out.printf("The weight in lbs is: %.2f\n", newWeight);
            } else {
                System.out.println("Invalid choice!");
            }

        } // scanner automatically closed here

    }
}
