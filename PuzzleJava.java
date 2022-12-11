import java.util.Random;
import java.util.Arrays;

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

    public String getRandomChar() {
        int randCharIndex = randomRoll(0,25);
        String[] charArray = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
        return charArray[randCharIndex];
    }

    public String generatePassword() {
        String[] passwordArr = new String[8];
        for(int i = 0; i < 8; i++) {
            passwordArr[i] = getRandomChar();
        }
        String password = Arrays.toString(passwordArr);
        password = password.replaceAll(",", "");
        password = password.replaceAll(" ", "");
        password = password.replaceAll("\\[", "").replaceAll("\\]","");
        return password;
    }

    public String[] generatePasswordSet(int numSets) {
        String[] passwords = new String[numSets];
        for(int i = 0; i < numSets; i++){
            passwords[i] = generatePassword();
        }
        return passwords;
    }
}