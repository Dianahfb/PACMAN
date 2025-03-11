import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Maze {
    private static char[] row1  = new char[] {'X','X','X','X','X','X','X','X','X','X','X','X','X','X','X','X','X','X','X'};
    private static char[] row2  = new char[] {'X',' ',' ',' ',' ',' ',' ',' ',' ','X',' ',' ',' ',' ',' ',' ',' ',' ','X'};
    private static char[] row3  = new char[] {'X',' ','X','X',' ','X','X','X',' ','X',' ','X','X','X',' ','X','X',' ','X'};
    private static char[] row4  = new char[] {'X',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','X'};
    private static char[] row5  = new char[] {'X',' ','X','X',' ','X',' ','X','X','X','X','X',' ','X',' ','X','X',' ','X'};
    private static char[] row6  = new char[] {'X',' ',' ',' ',' ','X',' ',' ',' ',' ',' ',' ',' ','X',' ',' ',' ',' ','X'};
    private static char[] row7  = new char[] {'X','X','X','X',' ','X','X','X','X',' ','X','X','X','X',' ','X','X','X','X'};
    private static char[] row8  = new char[] {'O','O','O','X',' ','X',' ',' ',' ',' ',' ',' ',' ','X',' ','X','O','O','O'};
    private static char[] row9  = new char[] {'X','X','X','X',' ','X',' ','X','X','r','X','X',' ','X',' ','X','X','X','X'};
    private static char[] row10 = new char[] {'O',' ',' ',' ',' ',' ',' ',' ','p','y','b',' ',' ',' ',' ',' ',' ',' ','O'};
    private static char[] row11 = new char[] {'X','X','X','X',' ','X',' ','X','X','X','X','X',' ','X',' ','X','X','X','X'};
    private static char[] row12 = new char[] {'O','O','O','X',' ','X',' ',' ',' ',' ',' ',' ',' ','X',' ','X','O','O','O'};
    private static char[] row13 = new char[] {'X','X','X','X',' ','X',' ','X','X','X','X','X',' ','X',' ','X','X','X','X'};
    private static char[] row14 = new char[] {'X',' ',' ',' ',' ',' ',' ',' ',' ','X',' ',' ',' ',' ',' ',' ',' ',' ','X'};
    private static char[] row15 = new char[] {'X',' ','X','X',' ','X','X','X',' ','X',' ','X','X','X',' ','X','X',' ','X'};
    private static char[] row16 = new char[] {'X',' ',' ','X',' ',' ',' ',' ',' ','P',' ',' ',' ',' ',' ','X',' ',' ','X'};
    private static char[] row17 = new char[] {'X','X',' ','X',' ','X',' ','X','X','X','X','X',' ','X',' ','X',' ','X','X'};
    private static char[] row18 = new char[] {'X',' ',' ',' ',' ','X',' ',' ',' ','X',' ',' ',' ','X',' ',' ',' ',' ','X'};
    private static char[] row19 = new char[] {'X',' ','X','X','X','X','X','X',' ','X',' ','X','X','X','X','X','X',' ','X'};
    private static char[] row20 = new char[] {'X',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','X'};
    private static char[] row21 = new char[] {'X','X','X','X','X','X','X','X','X','X','X','X','X','X','X','X','X','X','X'};
    private static char[][] matrix = new char[][] {row1, row2, row3, row4, row5, row6, row7, row8, row9, row10, row11, row12, row13, row14, row15, row16, row17, row18, row19, row20, row21};

    public static char[][] getMatrix() {
        return matrix;
    }
}


