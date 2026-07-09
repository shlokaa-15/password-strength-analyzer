import java.util.Random;
import java.util.Scanner;

/*
 * Generates secure random passwords based on
 * user-specified length.
 */
public class PasswordGenerator {

    private Scanner sc = new Scanner(System.in);
    private final String UPPER = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private final String LOWER = "abcdefghijklmnopqrstuvwxyz";
    private final String NUMBERS = "0123456789";
    private final String SPECIAL = "!@#$%^&*()_+-=[]{}|;:,.<>?";
    // Combined character set used for random password generation.
    private final String ALL = UPPER + LOWER + NUMBERS + SPECIAL;
    private Random random = new Random();

    public void generateNewPassword() {
        System.out.println();
        System.out.println("=================================================");
        System.out.println("               PASSWORD GENERATOR                ");
        System.out.println("=================================================");
        System.out.println();
        System.out.print("Enter desired password length (minimum 8): ");
        int length = sc.nextInt();
        sc.nextLine();
        String generated = generatePassword(length);
        System.out.println();
        System.out.println("------------- GENERATED PASSWORD ----------------");
        System.out.println();
        System.out.println("Generated Password: "+generated);
        System.out.println();
        System.out.println("-------------------------------------------------");
    }

    /*
     * Generates a password containing at least one
     * uppercase letter, lowercase letter, digit,
     * and special character.
     */
    private String generatePassword(int length) {
        StringBuilder password = new StringBuilder();
        password.append(UPPER.charAt(random.nextInt(UPPER.length())));
        password.append(LOWER.charAt(random.nextInt(LOWER.length())));
        password.append(NUMBERS.charAt(random.nextInt(NUMBERS.length())));
        password.append(SPECIAL.charAt(random.nextInt(SPECIAL.length())));
        for (int i = 4; i < length; i++) {
            password.append(ALL.charAt(random.nextInt(ALL.length())));
        }
        return shuffle(password.toString());
    }

    /*
     * Randomizes the order of characters using
     * the Fisher-Yates shuffle algorithm.
     */
    private String shuffle(String password) {
        char[] chars = password.toCharArray();
        for (int i = chars.length - 1; i > 0; i--) {
            int j = random.nextInt(i + 1);
            char temp = chars[i];
            chars[i] = chars[j];
            chars[j] = temp;
        }
        return new String(chars);
    }
}
