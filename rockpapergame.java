import java.util.Random;
import java.util.Scanner;

public class rockpapergame {
    public static void main(String[] args){

        // ROCK PAPER SCISSORS GAME

        // DECLARE VARIABLES

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();


        String[] choices = {"rock", "paper", "scissors"};
        String playerChoice;
        String computerChoice;
        String playAgain = "yes";

        do { 
            System.out.print("Enter your move (rock, paper, scissors): ");
            playerChoice = scanner.nextLine().toLowerCase();

            if(!playerChoice.equals("rock") && 
                !playerChoice.equals("paper") &&
                !playerChoice.equals("scissors")){
            System.out.println("Invalid choice");
            continue;// Skip to the next iteration of the loop
            }

            //GET RANDOM CHOICE FOR THE COMPUTER
            computerChoice = choices[random.nextInt(3)];
            System.out.println("Computer choice: " + computerChoice); 

            //CHECK WIN CONDITIONS
            if(playerChoice.equals(computerChoice)){
                System.out.println("It's a tie!");
            }
            else if((playerChoice.equals("rock") && computerChoice.equals("scissors")) || 
                    (playerChoice.equals("paper") && computerChoice.equals("rock"))  ||
                    playerChoice.equals("scissors") && computerChoice.equals("paper")){
                System.out.println("You Win!");
            }
            
            
            else{
                System.out.println("You Lose!");
            }

            //ASK TO PLAY AGAIN?
            System.out.print("play agin? (yes/no): ");
            playAgain = scanner.nextLine().toLowerCase();
            

        } while(playAgain.equals("yes"));

        System.out.println("Thanks for playing!");



        
         



        scanner.close();

         

    }
    
}
