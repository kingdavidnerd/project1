/* 	
 * ICSI/IECE 201 Introduction to Computer Science
 * Fall 2024
 *
 * Lab class <Weds 9:30am>
 * <David Omotosho>
 * <Net ID: DO374676>
 * <UAlbany email: domotosho@albany.edu>
 * 
 * Project 1
 * <brief project description>
 * 
 * The program was tested with the following inputs:
 * 
 * Question 1 <Yes>
 * Question 2 <Neither>
 * Question 3 <I don't use social media>
 * Question 4 <Sometimes>
 * Question 5 <Nothing>
 * 
 * Level of confidence: 100%
 *
 * Results: human 50%, robot 0%  
 * 
*/

import java.util.Random; // import random
import java.util.Scanner; 

public class projects1 {

    // Made this function so I don't have to put out 'System.out.println' everytime I need to put out a question
    static void questionMaker(String question)
    {
        System.out.println(question);
    }


	public static void main(String[] args) {

		// <your code is here>
		Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        Boolean runAgain = true; // Allow user to retest
        
        while(runAgain)
        {
            // Initialize probabilities for both hypotheses
            int probHuman = 0;
            int probRobot = 0;

            // Ask questions and adjust probabilities based on the answers
            questionMaker("Did you cry during “Avengers: Endgame”? \nYes/No");
            String answer1 = scanner.nextLine().toLowerCase();  // Convert input to lowercase for consistency
            if (answer1.equals("yes")) 
            {
                probHuman += 50;
            } 
            else if (answer1.equals("no")) 
            {
                probRobot += 50;
            }

            questionMaker("Which is the best TV show? \nBreaking Bad / Game of Thrones / Neither");
            String answer2 = scanner.nextLine().toLowerCase();
            if(answer2.equals("Breaking Bad")) 
            {
                probHuman += 50;
            } 
            else if(answer2.equals("Game of Thrones")) 
            {
                probRobot += 10;
            }
            else if(answer2.equals("Neither"))
            {
                probHuman += 10;
                probRobot += 10;
            }
            
            questionMaker("Do you participate in viral challenges on TikTok or Instagram? \nYes / No / I don’t use social media");
            String answer3 = scanner.nextLine().toLowerCase();
            if(answer3.equals("Yes")) 
            {
                probHuman += 20;
            } 
            else if(answer3.equals("No")) 
            {
                probHuman -= 10;
                probRobot += 5;
            }
            else if(answer3.equals("I don’t use social media"))
            {
                probRobot += 30;
            }

            questionMaker("Do you play video games regularly? \nYes / No / Sometimes");
            String answer4 = scanner.nextLine().toLowerCase();
            if(answer4.equals("Yes")) 
            {
                probHuman += 20;
            } 
            else if(answer4.equals("No")) 
            {
                probHuman -= 5;
                probRobot += 15;
            }
            else if(answer4.equals("Sometimes"))
            {
                probHuman += 10;
                probRobot += 5;
            }
            
            questionMaker("What does it feel like to touch a hot object? \nIt Burns / Nothing");
            String answer5 = scanner.nextLine().toLowerCase();
            if(answer5.equals("It Burns")) 
            {
                probHuman += 20;
            } 
            else if(answer5.equals("Nothing")) 
            {
                probRobot += 30;
            }

            // Ask for the user's confidence level and adjust result accordingly
            questionMaker("On a scale of 0-100%, how confident are you in your answers?");
            int confidence = scanner.nextInt();
            int uncertainty = 100 - confidence;
            int randomAdjustment = random.nextInt(uncertainty + 1) - uncertainty / 2;

            // Adjust the probabilities based on the random number generated
            probHuman += randomAdjustment;
            probRobot += randomAdjustment;

            // Ensure the probabilities are between 0 and 100
            probHuman = Math.min(100, Math.max(0, probHuman));
            probRobot = Math.min(100, Math.max(0, probRobot));

            // Print the results
            questionMaker("Final probability of being human: " + probHuman);
            questionMaker("Final probability of being a robot: " + probRobot);

            // Determine and print the result
            if (probHuman > probRobot) {
                questionMaker("The user is most likely a human.");
            } else if (probRobot > probHuman) {
                questionMaker("The user is most likely a machine.");
            } else {
                questionMaker("The result is uncertain.");
            }

            // Ask the user if they want to retake the test
            System.out.println("Do you want to take the test again? (yes/no)");
            String retakeTest = scanner.nextLine().toLowerCase();

            if (retakeTest.equals("no")) {
                runAgain = false;
            }
        }

        System.out.println("Thank you for taking the test!");
}
