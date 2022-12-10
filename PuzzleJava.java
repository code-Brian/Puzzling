import java.util.Random;

public class PuzzleJava {
    Random rand = new Random();
    public int randomRoll(int min, int max) {
        return rand.nextInt((max + 1) - min) + min;
    }
}