import java.util.Scanner;
//The code defines a two-player game where players take turns removing pennies from a row of boxes. The player who removes the last penny wins the game.
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of boxes:");
        int left = 0;
        int move = 0;
        int p1 = 0;
        int p2 = 0;
        int player = 1;
        int n = scan.nextInt();
        int right = n - 1;
        int[] numList = new int[n];
        System.out.println("Enter pennies in each box:");
        System.out.println("");
        System.out.println("Boxes:");
        for (int i = 0; i < n; i++) {
            numList[i] = scan.nextInt();
            System.out.print(numList[i] + " ");
        }
        System.out.println("");
        System.out.println("Player 1 score: 0");
        System.out.println("Player 2 score: 0");
        while (left <= right) {
            System.out.println("Enter player " + player + " move (1 for leftmost,2 for rightmost):");
            move = scan.nextInt();

            if (move > 2 || move < 1) {
                System.out.println("Invalid move!");
                System.out.println("");
                System.out.println("Boxes:");
                for (int a = left; a <= right; a++) {
                    System.out.print(numList[a] + " ");
    
                }
                System.out.println("");
                player = 3 - player;
                System.out.println("Player 1 score: " + p1);
                System.out.println("Player 2 score: " + p2);
            }
            if (move == 2) {
            System.out.println("");
                System.out.println("Boxes:");
                for (int a = left; a < right; a++) {
                    System.out.print(numList[a] + " ");
                    System.out.print("");
                }
                if (player == 1) {
                    p1 = p1 + numList[right];
                }
                if (player == 2) {
                    p2 = p2 + numList[right];
                }
                System.out.println("");
                System.out.println("Player 1 score: " + p1);
                System.out.println("Player 2 score: " + p2);
                right = right - 1;
            }
            if (move == 1) {
                System.out.println("");
                System.out.println("Boxes:");
                for (int b = left + 1; b < right + 1; b++) {
                    System.out.print(numList[b] + " ");
                    System.out.print("");
                }
                if (player == 1) {
                    p1 = p1 + numList[left];
                }
                if (player == 2) {
                    p2 = p2 + numList[left];
                }
                System.out.println("");
                System.out.println("Player 1 score: " + p1);
                System.out.println("Player 2 score: " + p2);
                left = left + 1;
            }
            player = 3 - player;
        }
        if (p1 > p2) {
            System.out.println("Player 1 won!");
        } else if (p2 > p1) {
            System.out.println("Player 2 won!");
        } else {
            System.out.println("It's a tie!");
        }
    }
}
  