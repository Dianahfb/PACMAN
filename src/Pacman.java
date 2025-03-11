import org.academiadecodigo.simplegraphics.pictures.Picture;

public class OLD_Pacman {

    private Picture picture;

    public OLD_Pacman(Picture picture) {
        this.picture = picture;
        picture.draw();
    }
    
    public void moveRight() {
        picture.translate(10, 0);
    }
    public void moveLeft() {
        picture.translate(-10,0);

    }
    public void moveUp() {
        picture.translate(0, -10);
    }
    public void moveDown() {
        picture.translate(0,10);
    }
}


