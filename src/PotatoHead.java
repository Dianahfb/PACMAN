import org.academiadecodigo.simplegraphics.pictures.Picture;

public class PotatoHead {
    
    private Picture picture;
    
    public PotatoHead(Picture picture) {
        this.picture = picture;
        picture.draw();
    }
    
    public void moveRight() {
        picture.translate(10, 0);
    }
}
