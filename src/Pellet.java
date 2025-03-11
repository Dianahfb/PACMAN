import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Pellet {

    public Picture picture;
    private  boolean eaten;

    public Pellet(Picture picture) {
        this.picture = picture;
        picture.draw();
        this.eaten = false;
    }

    public Picture getPicture() {
        return this.picture;
    }

    public boolean isEaten() {
        return eaten;
    }

    public void setEaten(boolean eaten) {
        this.eaten = eaten;
    }

    public void die() {
        picture.delete();
    }
}


