import java.util.Scanner;

/*⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻HANGMAN⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻⎻*\
|                                                   |
|    Classes/requirements:                          |
|        - Game class:                              |
|    *   Something that displays what letters       |
|        have been guessed.                         |
|    *   Something that finds out if what the       |
|        user has guessed, matches the chosen       |
|        word.                                      |
|    *   (Maybe) Ascii of the progression based     |
|        on number of wrong guesses.                |
|    *   Something that can differentiates between  |
|        the words, based on difficulty(Hard/Easy). |
|                                                   |
|        - Main class:                              |
|    *   Something that takes the users input.      |
|    *   A menu to choose difficulty.               |
|                                                   |
|         - Enum class:                             |
|    *   Easy                                       |
|    *   Hard                                       |
|                                                   |
|         - File class:                             |
|    *   Get the words from the file and split      |
|        the words based on the difficulty.         |
|                                                   |
|                                                   |
\*_________________________________________________*/

class Program {
    private final Drawing render = new Drawing();
    private final Scanner scanner = new Scanner(System.in);
    private final Game game = new Game();


    public void run() {

        System.out.println(render.title);
        System.out.println("CHOOSE DIFFICULTY (easy, hard): ");

        String option = scanner.nextLine();
        switch (option) {
            case "easy":
                game.startGame(Difficulty.DIFFICULTY_EASY);
                break;

            case "hard":
                game.startGame(Difficulty.DIFFICULTY_HARD);
                break;

            default:
                System.out.println("Invalid option.");
                break;
        }



    }
}

public class Main {
    public static void main(String[] args) {
        new Program().run();
    }
}