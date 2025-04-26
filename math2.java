import java.util.Scanner;

public class math2 {
    public static void main(String[]args) {

        //HYPOTENUSE c = Math.sqrt(a² + b²)

        Scanner math2 = new Scanner(System.in);

        double a;
        double b;
        double c;

        System.out.println("Enter the length of side A: ");
        a = math2.nextDouble();
        
        System.out.println("Enter the length of side B: ");
        b = math2.nextDouble();

        c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));

        System.out.println("The hypotenuse (side c) is: " + c);

        math2.close();
    }
    
}
