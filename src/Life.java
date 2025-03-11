import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Life {
    public Picture picture;


    public Life(Picture picture) {
        this.picture = picture;
    }

    public void removeLife() {
        this.picture.delete();
    }

}
