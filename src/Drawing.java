public class Drawing {

    public String title = " _                                             \n" +
            "| |                                            \n" +
            "| |__   __ _ _ __   __ _ _ __ ___   __ _ _ __  \n" +
            "| '_ \\ / _` | '_ \\ / _` | '_ ` _ \\ / _` | '_ \\ \n" +
            "| | | | (_| | | | | (_| | | | | | | (_| | | | |\n" +
            "|_| |_|\\__,_|_| |_|\\__, |_| |_| |_|\\__,_|_| |_|\n" +
            "                    __/ |                      \n" +
            "                   |___/                       ";

    public String stage1 = "  +---+\n" +
            "  |   |\n" +
            "      |\n" +
            "      |\n" +
            "      |\n" +
            "      |\n" +
            "=========";

    public String stage2 = "  +---+\n" +
            "  |   |\n" +
            "  O   |\n" +
            "      |\n" +
            "      |\n" +
            "      |\n" +
            "=========\n";

    public String stage3 = "  +---+\n" +
            "  |   |\n" +
            "  O   |\n" +
            "  |   |\n" +
            "      |\n" +
            "      |\n" +
            "=========";

    public String stage4 = "  +---+\n" +
            "  |   |\n" +
            "  O   |\n" +
            " /|   |\n" +
            "      |\n" +
            "      |\n" +
            "=========";

    public String stage5 = "  +---+\n" +
            "  |   |\n" +
            "  O   |\n" +
            " /|\\  |\n" +
            "      |\n" +
            "      |\n" +
            "=========";

    public String stage6 = "  +---+\n" +
            "  |   |\n" +
            "  O   |\n" +
            " /|\\  |\n" +
            " /    |\n" +
            "      |\n" +
            "=========";

    public String stage7 = "  +---+\n" +
            "  |   |\n" +
            "  O   |\n" +
            " /|\\  |\n" +
            " / \\  |\n" +
            "      |\n" +
            "=========";

    public String award = "     _______________\n" +
            "    |@@@@|     |####|\n" +
            "    |@@@@|     |####|\n" +
            "    |@@@@|     |####|\n" +
            "    \\@@@@|     |####/\n" +
            "     \\@@@|     |###/\n" +
            "      `@@|_____|##'\n" +
            "           (O)\n" +
            "        .-'''''-.\n" +
            "      .'  * * *  `.\n" +
            "     :  *       *  :\n" +
            "    : ~  HANGMAN  ~ :\n" +
            "    : ~ A W A R D ~ :\n" +
            "     :  *       *  :\n" +
            "      `.  * * *  .'\n" +
            "        `-.....-'";

    public String dead = "            .-.\n" +
            "           (X.X)\n" +
            "         '=.|m|.='\n" +
            "         .='`\"``=.";

    public String line = "------------LOSER-------------";


    public String[] stages = new String[7];
    // Could've just given each index in stages the string,
    // but making variables of each stage makes it more readable(imo)
    public Drawing() {
        stages[0] = stage1;
        stages[1] = stage2;
        stages[2] = stage3;
        stages[3] = stage4;
        stages[4] = stage5;
        stages[5] = stage6;
        stages[6] = stage7;
    }

}