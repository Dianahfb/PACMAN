import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.pictures.Picture;

import javax.sound.sampled.*;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

public class Main {
    public static void main(String[] args) {

        /*File file = new File("resources/pacman_beginning.wav");
        AudioInputStream audioStream = null;
        try {
            audioStream = AudioSystem.getAudioInputStream(file);
        } catch (UnsupportedAudioFileException | IOException e) {
            throw new RuntimeException(e);
        }
        Clip clip = null;
        try {
            clip = AudioSystem.getClip();
        } catch (LineUnavailableException e) {
            throw new RuntimeException(e);
        }
        try {
            clip.open(audioStream);
        } catch (LineUnavailableException | IOException e) {
            throw new RuntimeException(e);
        }
        clip.loop(Clip.LOOP_CONTINUOUSLY);*/

        InputStream inputStream = Main.class.getClassLoader().getResourceAsStream("resources/pacman_beginning.wav");

        if (inputStream == null) {
            throw new RuntimeException("Resource not found: resources/pacman_beginning.wav");
        }
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);

        AudioInputStream audioStream = null;
        try {
            audioStream = AudioSystem.getAudioInputStream(bufferedInputStream);
        } catch (UnsupportedAudioFileException | IOException e) {
            throw new RuntimeException(e);
        }

        Clip clip = null;
        try {
            clip = AudioSystem.getClip();
        } catch (LineUnavailableException e) {
            throw new RuntimeException(e);
        }

        try {
            clip.open(audioStream);
        } catch (LineUnavailableException | IOException e) {
            throw new RuntimeException(e);
        }

        clip.loop(Clip.LOOP_CONTINUOUSLY);

        Rectangle field = new Rectangle(0, 0, 570, 630);
        field.draw();
        field.setColor(Color.BLACK);
        field.fill();

        GameBoard gameBoard = new GameBoard();
        gameBoard.start();
    }
}