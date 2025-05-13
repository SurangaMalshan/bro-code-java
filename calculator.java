import java.util.Scanner;
public class calculator {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        double num1;
        double num2;
        char operator;
        double result=0;

        System.out.println("Enter the first number: ");
        num1 = scanner.nextDouble();
        
        System.out.println("Enter an operator (+, -, *, /, ^): ");
        operator = scanner.next().charAt(0);

        System.out.println("Enter the second number: ");
        num2 = scanner.nextDouble();

        switch(operator){
            case '+' -> result = num1 + num2;
            case '-' -> result = num1 - num2;
            case '*' -> result = num1 * num2;
            case '/' -> result = num1 / num2;
            case '^' -> result = Math.pow(num1, num2);  
        }
        System.out.println(result);

        scanner.close();

    }
}