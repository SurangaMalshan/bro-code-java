import java.util.Random;
import java.util.Scanner;

public class diceroller {

    public static void main (String[] args){

        // JAVA DICE ROLLER PROGRAM

        //DECLARE VARIABLES

        Scanner scanner = new Scanner (System.in);
        Random random = new Random();
        int numbe0fDice;
        int total = 0;
 
        // GET # OF DICE FROM THE USER
        System.out.println("Enter the # of dice to roll:");
        numbe0fDice = scanner.nextInt();

        // CHECK IF # OF DICE > 0
        if(numbe0fDice > 0){
        
        // ROLL ALL THE DICE    
            for(int i = 0; i < numbe0fDice; i++){
                int roll = random.nextInt(1, 7);
                printDie(roll); 
                System.out.println("You rolled: " + roll);
                total = total + roll;
            }
        // GET THE TOTAL    
            System.out.println("Total: " + total);
        }
        else {
            System.out.println("# of dice must be greater than 0");
     
        }
        scanner.close();
    }    

        //DISPLAY ASCII OF DICE
    static  void printDie(int roll){ 

        String dice1 = """
                
                --------
               |        |
               |   ●    |
               |        |
                --------
                """;
        String dice2 = """
                
                --------
               | ●      |
               |        |
               |       ●|
                --------
                """;        
        String dice3 = """
                
                --------
               | ●      |
               |    ●   |
               |       ●|
                --------
                """;
        String dice4 = """
                
                --------
               | ●      |
               |    ●   |
               |       ●|
                --------
                """;
        String dice5 = """
                
                --------
               | ●     ●|
               |    ●   |
               | ●     ●|
                --------
                """;
        String dice6 = """
                
                --------
               | ●    ●|
               | ●    ●|
               | ●    ●|
                --------
                """;
        switch(roll){
            case 1 -> System.out.println(dice1);
            case 2 -> System.out.println(dice2);
            case 3 -> System.out.println(dice3);    
            case 4 -> System.out.println(dice4);    
            case 5 -> System.out.println(dice5);    
            case 6 -> System.out.println(dice6);
            default -> System.out.println("Invalid roll");

        }  

            

    }

        



       

    


        


        
    
    
}
