import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Lifes {
    public Picture picture;


    public Lifes(Picture picture) {
        this.picture = picture;
    }

    public  void noMoreLifes() {
        picture.delete();
    }

}
