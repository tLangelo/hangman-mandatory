import java.util.ArrayList;
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
public class Game {

    private Difficulty difficulty;
    private final FileUtil fileUtil = new FileUtil("resources/Words.csv");
    private final Drawing render = new Drawing();
    private final Scanner scanner = new Scanner(System.in);

    private String word;
    private final ArrayList<String> usedLetters = new ArrayList<>();
    private int lives = 0;


    public void startGame(Difficulty difficulty) {

        this.difficulty = difficulty;
        fileUtil.initFile(difficulty);

        int randIndex = ((int)(Math.random() * fileUtil.getWordList().size()));
        word = fileUtil.getWordList().get(randIndex);


        while (lives < 7) {

            System.out.println(render.stages[lives]);

            int correct = 0;
            System.out.println("Used letters:");
            System.out.println(usedLetters);
            System.out.println("Lives: " + lives + "/7");
            // Prints out the correct letters and underscores
            for (char letter : word.toCharArray()) {
                if (usedLetters.contains("" + letter)) {
                    System.out.print(letter);
                    correct++;
                }
                else {
                    System.out.print("_");
                }
            }
            System.out.println();
            // Winning condition
            if (correct == word.length()) {
                System.out.println("YOU WIN.");
                System.out.println(render.award);
                return;
            }

            System.out.println("Choose a letter:");
            String userOption = "" + scanner.nextLine().charAt(0);
            // Checks if the letter is already guessed
            if (usedLetters.contains(userOption))
                continue;

            usedLetters.add(userOption);

            if (!word.contains(userOption)) {
                lives++;
            }

            System.out.println();
            System.out.println();

        }

        System.out.println("\t\t -YOU LOST-");
        System.out.println(render.dead);

    }



    public Difficulty getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(Difficulty difficulty) {
        this.difficulty = difficulty;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

}