import org.academiadecodigo.simplegraphics.pictures.Picture;

public class MazeBlock {

    public Picture picture;

    public MazeBlock(Picture picture) {
        this.picture = picture;
        picture.draw();
    }

    public Picture getPicture() {
        return this.picture;
    }

}
