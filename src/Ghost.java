import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Ghost {
    public Picture picture;
    public Directions previousDirection;
    public int moves;

    public Ghost(Picture picture) {
        this.picture = picture;
        this.moves = 0;
        picture.draw();
    }

    public Directions newDirection() {
        if (this.previousDirection == null) {
            return Directions.randomDirection();
        } else if (this.moves == 19 || this.moves == 5) {
            this.moves = 0;
            return Directions.randomDirection();
        } else {
            return this.previousDirection;
        }
    }

    void move() {
        this.moves++;
        int ghostX = picture.getX();
        int ghostY = picture.getY();
        boolean hasBlockAbove = GameBoard.checkMazeBlock(ghostX, ghostY - GameBoard.CELLSIZE);
        boolean hasBlockUnder = GameBoard.checkMazeBlock(ghostX, ghostY + GameBoard.CELLSIZE);
        boolean hasBlockLeft = GameBoard.checkMazeBlock(ghostX - GameBoard.CELLSIZE, ghostY);
        boolean hasBlockRight = GameBoard.checkMazeBlock(ghostX + GameBoard.CELLSIZE, ghostY);

        switch (newDirection()) {
            case UP:
                if (!hasBlockAbove) {
                    picture.translate(0, -GameBoard.CELLSIZE);
                    setPreviousDirection(Directions.UP);
                } else {
                    setPreviousDirection(null);
                }
                break;
            case DOWN:
                if (!hasBlockUnder) {
                    picture.translate(0, GameBoard.CELLSIZE);
                    setPreviousDirection(Directions.DOWN);
                } else {
                    setPreviousDirection(null);
                }
                break;
            case RIGHT:
                if (!hasBlockRight) {
                    picture.translate(GameBoard.CELLSIZE, 0);
                    setPreviousDirection(Directions.RIGHT);
                } else {
                    setPreviousDirection(null);
                }
                if (ghostX == 540) {
                    picture.translate(-570, 0);
                }
                break;
            case LEFT:
                if (!hasBlockLeft) {
                    picture.translate(-GameBoard.CELLSIZE, 0);
                    setPreviousDirection(Directions.LEFT);
                } else {
                    setPreviousDirection(null);
                }
                if (ghostX == 0) {
                    picture.translate(570, 0);
                }
                break;
        }

    }

    public void setPreviousDirection(Directions previousDirection) {
        this.previousDirection = previousDirection;
    }

    public void reset() {
        picture.delete();
    }
}