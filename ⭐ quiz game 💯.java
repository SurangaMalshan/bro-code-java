
import java.util.Scanner;

public class QuizGame {
    public static void main (String[] args) {

        //JAVA QUIZ GAME

        //OPTIONS ARRAYS [][]

         

        String[] questions = {"What is the main function of a router?",
                              "Which part of the computer is considered the brain?",
                              "What year was Facebook launched?",
                              "Who is know as the father of computer?",
                              "What was the first programming language?",};

        String[][] options = {{"1. Storing files", "2. Encrypting data", "3. Directing internet traffic", "4. Managing passwords"},
                      {"1. CPU", "2. Hard Driver", "3. RAM", "4. GPU"},
                      {"1. 2000", "2. 2004", "3. 2006", "4. 2008",},
                      {"1. Steve Jobs", "2. Bill Gates", "3. Alan Turing", "4. Charles babbage"},
                      {"1. COBOL", "2. Fortran", "3. Assembly", "4. C",}};

        // DECLARE VARIABLES     
        int[] answers = {3, 1, 2, 4, 3};       
        int score = 0;   
        int guess;

        Scanner scanner = new Scanner(System.in);

        //WELCOME MESSAGE

        System.out.println("******************************");
        System.out.println("Welcome to the Java Quiz Game!");
        System.out.println("******************************");

        //QUESTION (loop)

        for(int i = 0; i < questions.length; i++){
            System.out.println(questions[i]);

            for(String option : options[i]){
                System.out.println(option);

            }

        //GET GUESS FROM USER
            System.out.println("Enter your guess: ");
            guess = scanner.nextInt();


            if(guess == answers[i]){
                System.out.println("********");
                System.out.println("CORRECT!");
                System.out.println("*********");
                score++;
            }
            else{
                System.out.println("********");
                System.out.println("WRONG!");
                System.out.println("*********");

            }

                  

        }  
        
        System.out.println("Your final score is: " + score + " out of " + questions.length);


        scanner.close();

    }
    
}
