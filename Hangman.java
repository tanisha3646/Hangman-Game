import java.util.Scanner;

public class Hangman {

    private static String[] words = {"terminator", "banana", "computer", "multiplexer", "magenta", "Photoshop","patrol","commissioner","labrador","ginger" };
    private static String[] hints = {"Machine and a Movie", "Fruit", "We are working on..", "COA", "Color", "Graphics","police's duty","A Post","Breed","A necessecity for Tea" };
    private static double q=(Math.random() * words.length);
    private static String word = words[(int) q];
    private static String hint = hints[(int) q];
    private static String asterisk = new String(new char[word.length()]).replace("\0", "*");
    private static int count = 0;
    public static void clearScreen(){System.out.print("\033[H\033[2J");}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hint : - "+hint);
        while (count < 7 && asterisk.contains("*")) {
            System.out.println("Guess any letter in the word");
            System.out.println(asterisk);
            String guess = sc.next();
            hang(guess);
        }
        sc.close();
    }

    public static void hang(String guess) {
        String newasterisk = "";
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == guess.charAt(0)) {
                newasterisk += guess.charAt(0);
            } else if (asterisk.charAt(i) != '*') {
                newasterisk += word.charAt(i);
            } else {
                newasterisk += "*";
            }
        }

        if (asterisk.equals(newasterisk)) {
            count++;
            hangmanImage();
        } else {
            asterisk = newasterisk;
        }
        if (asterisk.equals(word)) {
            System.out.println("Correct! You win! The word was ** "  + word+" **");
        }
    }

    public static void hangmanImage() {
        if (count == 1) {
            System.out.println("Wrong guess, try again");
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println("   |");
            System.out.println("===|===");
            System.out.println();
        }
        if (count == 2) {
           
            System.out.println("Wrong guess, try again");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("===|===");
        }
        if (count == 3) {
           
            System.out.println("Wrong guess, try again");
            System.out.println("   =============");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   | ");
            System.out.println("===|===");
        }
        if (count == 4) {
            
            System.out.println("Wrong guess, try again");
            System.out.println("   =============");
            System.out.println("   |          _|_");
            System.out.println("   |         /   \\");
            System.out.println("   |        |     |");
            System.out.println("   |         \\_ _/");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("===|===");
        }
        if (count == 5) {
            
            System.out.println("Wrong guess, try again");
            System.out.println("   =============");
            System.out.println("   |          _|_");
            System.out.println("   |         /   \\");
            System.out.println("   |        |     |");
            System.out.println("   |         \\_ _/");
            System.out.println("   |           |");
            System.out.println("   |           |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("===|====");
        }
        if (count == 6) {
            System.out.println("Wrong guess, try again");
            System.out.println("   =============");
            System.out.println("   |          _|_");
            System.out.println("   |         /   \\");
            System.out.println("   |        |     |");
            System.out.println("   |         \\_ _/");
            System.out.println("   |           |");
            System.out.println("   |           |");
            System.out.println("   |          / \\ ");
            System.out.println("   |         /   \\");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("===|====");
            
        }
        if (count == 7) {
             
            System.out.println("GAME OVER!");
            System.out.println("   =============");
            System.out.println("   |          _|_");
            System.out.println("   |         /   \\");
            System.out.println("   |        |     |");
            System.out.println("   |         \\_ _/");
            System.out.println("   |          _|_");
            System.out.println("   |         / | \\");
            System.out.println("   |          / \\ ");
            System.out.println("   |         /   \\");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("===|===");
            System.out.println("GAME OVER! The word was ** " + word + " **");
        }
    }
}
