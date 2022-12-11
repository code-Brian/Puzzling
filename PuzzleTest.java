public class PuzzleTest {
    public static void main(String[] args) {
        PuzzleJava puzzleTime = new PuzzleJava();
        System.out.println(puzzleTime.randomRoll(1,20));
        int[] tenRolls = new int[10];
        puzzleTime.getTenRolls(tenRolls);
        for (int i = 0; i < tenRolls.length; i++) {
            System.out.println(tenRolls[i]);
        }
        String output = String.format("tenRolls length is: %s",tenRolls.length);
        System.out.println(output);
        System.out.println(puzzleTime.getRandomChar());
        System.out.println(puzzleTime.generatePassword());
    }
}