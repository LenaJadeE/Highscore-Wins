package com.pluralsight;

import java.util.Scanner;

public class HighScoreWins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter the game score: ");
        System.out.println("(Example: Home:Visitor|#:#) ");
        String input = scanner.nextLine().trim();

        String[] sections = input.split("\\|");

        String[] teams = sections[0].split(":");

        String[] scores = sections[1].split(":");

        String homeTeam = teams[0];
        String visitorTeam = teams[1];
        int homeScores = Integer.parseInt(scores[0]);
        int visitorScores = Integer.parseInt(scores[1]);

        if (homeScores > visitorScores) {
            System.out.println("Winner: " + homeTeam);
        } else if (visitorScores > homeScores) {
            System.out.println("Winner: " + visitorTeam);
        } else {
            System.out.println("Winner: Tie!");
        }
    }
}


// EXERCISE 3
//  Create a new Java application called highscore-wins that prompts the user to enter team and score information of an event.
//  The input will be a single string that contains both team names and the final score of the match.
// Step 1
//  Prompt the user for a game score and the user will input a score in the following format:
//  Home:Visitor|21:9
//  Based on the user input, you should determine which team had the higher score and display the name of the winning team.
//      Hint: You will have to split the user input multiple times  - one split will be on the pipe ( | ) - one split will be on the colon ( : )
//  A sample trace of your output, and bolded code is what the user entered:
//  Please enter the game score: Home:Visitor|21:9↵
//  Winner: Home
//  A different trace would be:
//  Please enter the game score: Spurs:Knicks|106:107↵
//  Winner: Knicks
//  A tie would be:
//  Please enter the game score: Slytherin:Gryffindor|42:42↵
//  Winner: Tie!
// Step 2
//  1. Ensure all your changes are committed and pushed to GitHub and Send your repository URL to your Instructor