import java.util.random.RandomGenerator;

public enum Directions {
    RIGHT,
    LEFT,
    DOWN,
    UP;

    public static Directions randomDirection() {
        return Directions.values()[(int)(Math.random() * Directions.values().length)];
    }
}