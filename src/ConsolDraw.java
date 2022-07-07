public class ConsolDraw {
    private static boolean borderOn = false;
    private int x;
    private int y;
    private char[][] consoleMatrix;

    public ConsolDraw(int x, int y) {
        borderOn = false;
        this.x = x;
        this.y = y;
        this.consoleMatrix = new char[x][y];
        cls();
    }

    public void show() {
        String screen = "";
        for (int yi = 0; yi < y; yi++) {
            for (int xi = 0; xi < x; xi++) {
                screen += consoleMatrix[xi][yi];
            }
            screen += "\n";
        }
        System.out.print(screen);
    }

    public void drawChar(int xChar, int yChar, char setChar) {
        if (borderOn) {
            if (xChar < x - 1 && xChar > 0 && yChar < y - 1 && yChar > 0) {
                consoleMatrix[xChar][yChar] = setChar;
            }
        } else if (xChar < x && xChar > -1 && yChar < y && yChar > -1) {
            consoleMatrix[xChar][yChar] = setChar;
        }
    }

    public void draw16Color(int xChar, int yChar, int color16Symbol) {//╌╍─═╎╏│┼║╬░▒▓█


        char setChar = ' ';
        switch (color16Symbol) {
            case (1):
                setChar = '·';
                break;
            case (2):
                setChar = '╌';
                break;
            case (3):
                setChar = '╍';
                break;
            case (4):
                setChar = '─';
                break;
            case (5):
                setChar = '═';
                break;
            case (6):
                setChar = '╎';
                break;
            case (7):
                setChar = '╏';
                break;
            case (8):
                setChar = '│';
                break;
            case (9):
                setChar = '┼';
                break;
            case (10):
                setChar = '║';
                break;
            case (11):
                setChar = '╬';
                break;
            case (12):
                setChar = '░';
                break;
            case (13):
                setChar = '▒';
                break;
            case (14):
                setChar = '▓';
                break;
            case (15):
                setChar = '█';
                break;
        }

        drawChar(xChar, yChar, setChar);
    }

    public void draw64Color(int xChar, int yChar, int color16Symbol) {//╌╍─═╎╏│┼║╬░▒▓█


        char setChar = ' ';
        switch (color16Symbol) {
            case (1):
                setChar = '1';
                break;
            case (2):
                setChar = '2';
                break;
            case (3):
                setChar = '3';
                break;
            case (4):
                setChar = '4';
                break;
            case (5):
                setChar = '5';
                break;
            case (6):
                setChar = '6';
                break;
            case (7):
                setChar = '7';
                break;
            case (8):
                setChar = '8';
                break;
            case (9):
                setChar = '9';
                break;
            case (10):
                setChar = '0';
                break;
            case (11):
                setChar = 'a';
                break;
            case (12):
                setChar = 'b';
                break;
            case (13):
                setChar = 'c';
                break;
            case (14):
                setChar = 'd';
                break;
            case (15):
                setChar = 'e';
                break;
            case (16):
                setChar = 'f';
                break;
            case (17):
                setChar = 'g';
                break;
            case (18):
                setChar = 'h';
                break;
            case (19):
                setChar = 'i';
                break;
            case (20):
                setChar = 'j';
                break;
            case (21):
                setChar = 'k';
                break;
            case (22):
                setChar = 'l';
                break;
            case (23):
                setChar = 'm';
                break;
            case (24):
                setChar = 'n';
                break;
            case (25):
                setChar = 'o';
                break;
            case (26):
                setChar = 'p';
                break;
            case (27):
                setChar = 'q';
                break;
            case (28):
                setChar = 'r';
                break;
            case (29):
                setChar = 's';
                break;
            case (30):
                setChar = 't';
                break;
            case (31):
                setChar = 'u';
                break;
            case (32):
                setChar = 'v';
                break;
            case (33):
                setChar = 'w';
                break;
            case (34):
                setChar = 'x';
                break;
            case (35):
                setChar = 'y';
                break;
            case (36):
                setChar = 'z';
                break;
            case (37):
                setChar = 'A';
                break;
            case (38):
                setChar = 'B';
                break;
            case (39):
                setChar = 'C';
                break;
            case (40):
                setChar = 'D';
                break;
            case (41):
                setChar = 'E';
                break;
            case (42):
                setChar = 'F';
                break;
            case (43):
                setChar = 'G';
                break;
            case (44):
                setChar = 'H';
                break;
            case (45):
                setChar = 'I';
                break;
            case (46):
                setChar = 'J';
                break;
            case (47):
                setChar = 'K';
                break;
            case (48):
                setChar = 'L';
                break;
            case (49):
                setChar = 'M';
                break;
            case (50):
                setChar = 'N';
                break;
            case (51):
                setChar = 'O';
                break;
            case (52):
                setChar = 'P';
                break;
            case (53):
                setChar = 'Q';
                break;
            case (54):
                setChar = 'R';
                break;
            case (55):
                setChar = 'S';
                break;
            case (56):
                setChar = 'T';
                break;
            case (57):
                setChar = 'U';
                break;
            case (58):
                setChar = 'V';
                break;
            case (59):
                setChar = 'W';
                break;
            case (60):
                setChar = 'X';
                break;
            case (61):
                setChar = 'Y';
                break;
            case (62):
                setChar = 'Z';
                break;
            case (63):
                setChar = '▒';
                break;

        }

        drawChar(xChar, yChar, setChar);
    }

    public void cls() {
        borderOn = false;
        for (int yi = 0; yi < y; yi++) {
            for (int xi = 0; xi < x; xi++) {
                consoleMatrix[xi][yi] = ' ';
            }
        }
    }

    public void border() {
        for (int yi = 0; yi < y; yi++) {
            consoleMatrix[0][yi] = '│';
            consoleMatrix[x - 1][yi] = '│';
        }
        for (int xi = 0; xi < x; xi++) {
            consoleMatrix[xi][0] = '─';
            consoleMatrix[xi][y - 1] = '─';
        }
        consoleMatrix[0][0] = '┌';
        consoleMatrix[x - 1][y - 1] = '┘';
        consoleMatrix[0][y - 1] = '└';
        consoleMatrix[x - 1][0] = '┐';
        borderOn = true;
    }

    public void clsBorder() {
        for (int yi = 0; yi < y; yi++) {
            for (int xi = 0; xi < x; xi++) {
                consoleMatrix[xi][yi] = ' ';
            }
        }
        border();
    }
}
