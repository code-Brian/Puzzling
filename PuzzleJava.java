import java.util.Random;

public class PuzzleJava {
    Random rand = new Random();
    public int randomRoll(int min, int max) {
        return rand.nextInt((max + 1) - min) + min;
    }

    public int[] getTenRolls(int[] rollArray) {
        for(int i = 0; i < rollArray.length; i++){
            rollArray[i] = randomRoll(1,20);
        }
        return rollArray;
    }
}