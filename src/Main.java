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
    //Objects
    private final Drawing render = new Drawing();
    private final Scanner scanner = new Scanner(System.in);
    private final Game game = new Game();


    public void run() {

        System.out.println(render.title);
        System.out.println("\n\tCHOOSE DIFFICULTY:\n\t1.\t\tEASY\n\t2.\t\tHARD");
        String option = "";

        do{
            option = scanner.nextLine();
            switch (option) {
                case "1":
                    game.startGame(Difficulty.DIFFICULTY_EASY);
                    return;

                case "2":
                    game.startGame(Difficulty.DIFFICULTY_HARD);
                    return;

                default:
                    System.out.println("Invalid option.");
                    break;
            }
        }while(!option.matches("1") || !option.matches("2"));




    }
}

public class Main {
    public static void main(String[] args) {
        new Program().run(); //Getting out of static context
    }
}