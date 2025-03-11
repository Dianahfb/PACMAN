import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;

public class MyKeyboard implements KeyboardHandler {
    
    private Keyboard keyboard;
    private Pacman pacman;
    private Ghost ghost;
    private Score score;
    
    public void init() {
        keyboard = new Keyboard(this);

        // setup do move right
        KeyboardEvent goRight = new KeyboardEvent();
        KeyboardEvent goLeft = new KeyboardEvent();
        KeyboardEvent goUp = new KeyboardEvent();
        KeyboardEvent goDown = new KeyboardEvent();

        //set the key to the event
        goRight.setKey(KeyboardEvent.KEY_RIGHT);
        goRight.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        goLeft.setKey(KeyboardEvent.KEY_LEFT);
        goLeft.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        goUp.setKey(KeyboardEvent.KEY_UP);
        goUp.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        goDown.setKey(KeyboardEvent.KEY_DOWN);
        goDown.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);

        keyboard.addEventListener(goLeft);
        keyboard.addEventListener(goRight);
        keyboard.addEventListener(goUp);
        keyboard.addEventListener(goDown);

    }
    
    
    @Override
    public void keyPressed(KeyboardEvent keyboardEvent) {
        if(keyboardEvent.getKey() == KeyboardEvent.KEY_RIGHT) {
            pacman.moveRight();

        } if (keyboardEvent.getKey() == KeyboardEvent.KEY_LEFT) {
            pacman.moveLeft();

        } if (keyboardEvent.getKey() == KeyboardEvent.KEY_UP) {
            pacman.moveUp();

        } if (keyboardEvent.getKey() == KeyboardEvent.KEY_DOWN  ) {
            pacman.moveDown();

        }
    }

    
    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {
    
    }
    
    public void setPacman(Pacman pacman) {
        this.pacman = pacman;
    }
    public void setScore(Score score) {this.score = score;}

}
