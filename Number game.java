import java.util.Random;
import java.util.Scanner;

class number_game {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Random random = new Random();
        int score = 0;
        int rounds = 0;
        boolean play_again = true;

        while (play_again) {
            rounds++;
            int attempts = 0;
            int maxattempts = 3;//chances per round
            int guess_number = random.nextInt(100) + 1;//guess number between 1-100

            System.out.println("Round" + rounds + "guess the number between 1-100:");
            boolean guess = false;

            while (attempts < maxattempts && !guess) {
                System.out.print("enter your guess (attempt " + (attempts + 1) + " of " + maxattempts + "):");
                int user_guess = s.nextInt();
                attempts++;

                if (user_guess == guess_number) {
                    guess = true;
                    System.out.println("congratulations! your guess is correct in" + attempts + "attempts.");
                    score++;
                } else if (user_guess < guess_number) {
                    System.out.println("low,try again");
                } else {
                    System.out.println("high,try again");
                }
            }
            if (!guess) {
                System.out.println("failed,attempts over.The correct number was" + guess_number);
            }
            System.out.println("do you want to try another round?(yes/no):");
            String answer = s.next();
            play_again = answer.equalsIgnoreCase("yes");
            System.out.println("rounds played are:" + rounds);
            System.out.println("your score is:" + score);
        }
    }

}