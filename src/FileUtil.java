import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileUtil {

    private File file;
    private Scanner scanner;
    private ArrayList<String> wordList;

    public FileUtil(String filePath) {
        file = new File(filePath);
        wordList = new ArrayList<>();

        try {
            scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void initFile(Difficulty difficulty) {
        while (scanner.hasNext()) {
            String currLine = scanner.nextLine();
            String[] splitLine = currLine.split(",");

            if (difficulty == Difficulty.DIFFICULTY_EASY) {
                wordList.add(splitLine[0]);
            }
            else {
                wordList.add(splitLine[1]);
            }
        }
    }

    public ArrayList<String> getWordList() {
        return wordList;
    }

}