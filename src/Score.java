import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Score {
    public static Picture picture;

    public Score (Picture picture) {
        this.picture= picture;
        picture.draw();
    }
}

