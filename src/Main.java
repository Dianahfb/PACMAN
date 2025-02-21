import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Ellipse;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Main {
    public static void main(String[] args) {
        
        
        
        Rectangle field = new Rectangle(10, 10, 900, 600);
        field.draw();
        /*rectangle.setColor(Color.MAGENTA);
        rectangle.fill();*/
        
        /*Rectangle square = new Rectangle(100,400, 20, 20);
        square.setColor(Color.MAGENTA);
        square.fill();
        
        Ellipse ball = new Ellipse(150, 400, 20, 20);
        ball.setColor(Color.GREEN);
        ball.fill();
        
        Picture potato = new Picture(200, 150, "resources/mrsPotatoHead.jpg");
        potato.draw();
        potato.translate(200,100);*/
       
       PotatoHead potatoHead = new PotatoHead(new Picture(200, 150, "resources/mrsPotatoHead.jpg"));
        
/*        for (int i = 0; i < 50; i++) {
            potatoHead.moveRight();
        }*/
      
      MyKeyboard myKeyboard = new MyKeyboard();
      myKeyboard.init();
      myKeyboard.setPotatoHead(potatoHead);
      
      
    }
}
