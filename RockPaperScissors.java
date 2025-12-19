import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] choices = {"Rock", "Paper", "Scissors"};
        
        System.out.println("======================================");
        System.out.println("ROCK PAPER SCISSORS: Player vs Player");
        System.out.println("0: Rock, 1: Paper, 2: Scissors, -1: Exit");
        System.out.println("======================================");
        
        while (true) {
            System.out.print("Player 1 Choice : ");
            int p1 = input.nextInt();
            if (p1 == -1) break;

            System.out.print("Player 2 Choice : ");
            int p2 = input.nextInt();
            if (p2 == -1) break;
            
            if (p1 < 0 || p1 > 2 || p2 < 0 || p2 > 2) {
                System.out.println("Invalid choice. Please try again.");
                continue;
            }
            
            System.out.println("Player 1 chose: " + choices[p1]);
            System.out.println("Player 2 chose: " + choices[p2]);

            if (p1 == p2) {
                System.out.println("Result: It's a Tie!");
            } 
            else if ((p1 == 0 && p2 == 1) || (p1 == 2 && p2 == 0) || (p1 == 1 && p2 == 2)) {
                System.out.println("Result: Player 1 Wins!");
            } 
            else {
                System.out.println("Result: Player 2 Wins!");
            }
            System.out.println("--------------------------------------");
        }
        
        System.out.println("Game Over. Goodbye!");
        input.close();
    }
}
//นาย พัทธดนย์ อักษรคง 6830300550
//นาย วีรภัทร ตั้งจันทร์สุข 6830300771
