import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Pacman {

    public Picture picture;

    public Pacman(Picture picture) {
        this.picture = picture;
        picture.draw();
    }

    public void moveRight() {
        int pacmanX = picture.getX();
        int pacmanY = picture.getY();
        boolean hasBlockRight = GameBoard.checkMazeBlock(pacmanX + GameBoard.CELLSIZE, pacmanY);
        if (!hasBlockRight) {
            picture.translate(GameBoard.CELLSIZE, 0);
            picture.load("resources/PacmanRight.svg.png");
        }
        if (pacmanX == 540) {
            picture.translate(-570, 0);
            picture.load("resources/PacmanRight.svg.png");
        }

    }

    public void moveLeft() {
        int pacmanX = picture.getX();
        int pacmanY = picture.getY();
        boolean hasBlockLeft = GameBoard.checkMazeBlock(pacmanX - GameBoard.CELLSIZE, pacmanY);
        if (!hasBlockLeft) {
            picture.translate(-GameBoard.CELLSIZE, 0);
            picture.load("resources/PacmanLeft.svg.png");
        }
        if (pacmanX == 0) {
            picture.translate(570, 0);
            picture.load("resources/PacmanLeft.svg.png");
        }
    }

    public void moveUp() {
        int pacmanX = picture.getX();
        int pacmanY = picture.getY();
        boolean hasBlockAbove = GameBoard.checkMazeBlock(pacmanX, pacmanY - GameBoard.CELLSIZE);
        if (!hasBlockAbove) {
            picture.translate(0, -GameBoard.CELLSIZE);
            picture.load("resources/PacmanUp.svg.png");
        }
    }

    public void moveDown() {
        int pacmanX = picture.getX();
        int pacmanY = picture.getY();
        boolean hasBlockUnder = GameBoard.checkMazeBlock(pacmanX, pacmanY + GameBoard.CELLSIZE);
        if (!hasBlockUnder) {
            picture.translate(0, GameBoard.CELLSIZE);
            picture.load("resources/PacmanDown.svg.png");
        }
    }

    public void die() {
        picture.delete();
    }

}







