import org.academiadecodigo.simplegraphics.pictures.Picture;

import javax.sound.sampled.*;
import javax.swing.*;
import java.io.File;
import java.io.IOException;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Objects;

public class GameBoard {

    public static final int CELLSIZE = 30;
    private Pacman pacman;
    private Ghost[] ghosts = new Ghost[4];
    private static MazeBlock[] mazeBlocks = new MazeBlock[196];
    private int pelletsNR = 184;
    private Pellet[] pellets = new Pellet[184];
    private Life[] lifes = new Life[3];
    private MyKeyboard myKeyboard;
    private boolean gameWon = false;

    public GameBoard() {
        createMaze();
        createLifes();
        this.myKeyboard = new MyKeyboard();
        this.myKeyboard.init();
        this.myKeyboard.setPacman(pacman);
    }

    public void createLifes() {
        lifes[0] = new Life(new Picture(450, CELLSIZE, "resources/heart.png"));
        lifes[1] = new Life(new Picture(480, CELLSIZE, "resources/heart.png"));
        lifes[2] = new Life(new Picture(510, CELLSIZE, "resources/heart.png"));
        for (Life life : lifes) {
            life.picture.draw();
        }
    }

    public static boolean checkMazeBlock(int x, int y) {
        return Arrays.stream(mazeBlocks).anyMatch(mazeBlock -> mazeBlock.getPicture().getY() == y && mazeBlock.getPicture().getX() == x);
        /** the for loop below is doing the same thing as the array method above**/
        /*for (int mazeBlock = 0; mazeBlock < mazeBlocks.length; mazeBlock++) {
            if (mazeBlocks[mazeBlock].getPicture().getX() == x && mazeBlocks[mazeBlock].getPicture().getY() == y) {
                return true;
            }
        }*/
        //return false;
    }

    public void createMaze() {
        char[][] maze = Maze.getMatrix();
        int blockIndex = 0;
        int pelletIndex = 0;
        for (int r = 0; r < maze.length; r++) {
            for (int c = 0; c < maze[r].length; c++) {
                if (maze[r][c] == 'X') {
                    mazeBlocks[blockIndex] = new MazeBlock(new Picture(c * CELLSIZE, r * CELLSIZE, "resources/BlueBlock.png"));
                    blockIndex++;
                }
                if (maze[r][c] == 'P') {
                    spawnPacman();
                }
                if (maze[r][c] == 'p') {
                    ghosts[0] = new Ghost(new Picture(270, 270, "resources/Pinky.tiff"));
                }
                if (maze[r][c] == 'y') {
                    ghosts[1] = new Ghost(new Picture(300, 270, "resources/clyde.tiff"));
                }
                if (maze[r][c] == 'r') {
                    ghosts[2] = new Ghost(new Picture(270, 240, "resources/Blinky.tiff"));
                }
                if (maze[r][c] == 'b') {
                    ghosts[3] = new Ghost(new Picture(240, 270, "resources/Inky.tiff"));
                }
                if (maze[r][c] == ' ') {
                    pellets[pelletIndex] = new Pellet(new Picture(c * CELLSIZE, r * CELLSIZE, "resources/Pellet.png"));
                    pelletIndex++;
                }
            }
        }

    }

    public void spawnPacman() {
        this.pacman = new Pacman(new Picture(270, 450, "resources/Pacman.svg.png"));
    }

    public void start() {
        new Timer(200, o -> {
            for (Ghost ghost : ghosts) {
                ghost.move();
            }
            for (Ghost ghost : ghosts) {
                checkCollision(pacman, ghost);
            }
            /// ////////////////////////////////////////Ricardo Simoes///////////////////////////////////////////////
            for (Pellet pellet : pellets) {
                checkCollision(pacman, pellet);
            }
            /// ////////////////////////////////////////Ricardo Simoes///////////////////////////////////////////////
            if (Arrays.stream(lifes).allMatch(Objects::isNull)) {
                Picture gameOver = new Picture(0, 0, "resources/GameOver.png");
                gameOver.draw();
            }
        }).start();

    }


    public void checkCollision(Pacman pacman, Ghost ghost) {

        if (pacman.picture.getX() == ghost.picture.getX() && pacman.picture.getY() == ghost.picture.getY()) {
            for (int l = 0; l < lifes.length; l++) {
                if (lifes[l] != null) {
                    lifes[l].removeLife();
                    lifes[l] = null;
                    break;
                }
            }
            pacman.die();
            ghosts[0].reset();
            ghosts[1].reset();
            ghosts[2].reset();
            ghosts[3].reset();
            ghosts[0] = new Ghost(new Picture(270, 270, "resources/Pinky.tiff"));
            ghosts[1] = new Ghost(new Picture(300, 270, "resources/clyde.tiff"));
            ghosts[2] = new Ghost(new Picture(270, 240, "resources/Blinky.tiff"));
            ghosts[3] = new Ghost(new Picture(240, 270, "resources/Inky.tiff"));
            spawnPacman();
            this.myKeyboard.setPacman(this.pacman);
        }

    }

    /// ////////////////////////////////////////Ricardo Simoes///////////////////////////////////////////////

    public void checkCollision(Pacman pacman, Pellet pellet) {

        if (!gameWon) {

            if (pacman.picture.getX() == pellet.picture.getX() && pacman.picture.getY() == pellet.picture.getY()) {

                if (!pellet.isEaten()) {
                    pellet.die();
                    pellet.setEaten(true);

                    pelletsNR--;

                    System.out.println(pelletsNR);

                    if (pelletsNR == 0) {
                        gameWon = true;

                        Picture gameWin = new Picture(0, 0, "resources/YouWin.png");
                        gameWin.draw();

                    }
                }
            }
        }
    }
}
