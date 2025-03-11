import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Field {

    public Picture picture;

    public Field(Picture picture) {
        this.picture = picture;
        picture.draw();
    }

}
