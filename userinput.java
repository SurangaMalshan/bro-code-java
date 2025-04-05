import java.util.Scanner;

class userinput {
    public static void main(String[] args) {

        Scanner profile = new Scanner(System.in); //Create a sacnner object
        
        System.out.println("Enter user name:");  //output user input
        String name = profile.nextLine(); //Read user input

        System.out.print("Enter your age:");
        int age = profile.nextInt();

        System.out.println("Are you a Student? (true/false): ");
        boolean isStudent = profile.nextBoolean();

        // Output input by user
        System.out.println("Hello " + name);
        System.out.println("You are " + age + " years old");
        
        if(isStudent){
            System.out.println("You are enrolled as astudent");
        }
        else{
            System.out.println("you are not enrolled as astudent" );
        }

        profile.close();
    
    }
}