import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;

public class MyKeyboard implements KeyboardHandler {
    
    private Keyboard keyboard;
    private PotatoHead potatoHead;
    
    public void init() {
        
        keyboard = new Keyboard(this);
        
        //setup the event to move right
        KeyboardEvent goRight = new KeyboardEvent();
        //set the key to the event
        goRight.setKey(KeyboardEvent.KEY_D);
        //set the type of event
        goRight.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        
        keyboard.addEventListener(goRight);
        
        System.out.println("done!!!");
        
        
    }
    
    
    @Override
    public void keyPressed(KeyboardEvent keyboardEvent) {
        System.out.println("pressing D");
        potatoHead.moveRight();
        
    }
    
    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {
    
    }
    
    public void setPotatoHead(PotatoHead potatoHead) {
        this.potatoHead = potatoHead;
    }
}
