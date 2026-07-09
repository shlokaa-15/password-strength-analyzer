import java.util.Scanner;

/*
 * Analyzes the strength of a user-entered password.
 * Evaluates the password against common security criteria.
 * and provides suggestions for improvement.
 */
public class PasswordAnalyzer {
    private Scanner sc = new Scanner(System.in);
    private String password;
    private boolean hasUpperCase = false;
    private boolean hasLowerCase = false;
    private boolean hasNumber = false;
    private boolean hasSpecial = false;
    private int score;

    /* Stars password analysis process.
       Reads user input,analyzes password,calculates strength and displays suggestion.
     */
    public void startAnalysis() {
        resetAnalysis();
        readPassword();
        analyzePassword();
        calculateScore();
        printResults();
        printSuggestions();
    }

    // Resets analysis before checking a new password.
    private void resetAnalysis() {
        hasUpperCase = false;
        hasLowerCase = false;
        hasNumber = false;
        hasSpecial = false;
        score = 0;
    }

    private void readPassword() {
        System.out.println();
        System.out.println("=================================================");
        System.out.println("               PASSWORD ANALYSIS                 ");
        System.out.println("=================================================");
        System.out.println();
        System.out.print("Enter Password: ");
        password = sc.nextLine();
    }

    private void analyzePassword() {
        // Checks each character to determine whether the password
        // contains uppercase letters, lowercase letters,
        // digits, and special characters.
        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) {
                hasUpperCase = true;
            } else if (Character.isLowerCase(c)) {
                hasLowerCase = true;
            } else if (Character.isDigit(c)) {
                hasNumber = true;
            } else {
                hasSpecial = true;
            }
        }
    }

    // Calculates score based on security criteria satisfied.
    private void calculateScore() {
        score = 0;
        if (hasUpperCase)
            score++;
        if (hasLowerCase)
            score++;
        if (hasNumber)
            score++;
        if (hasSpecial)
            score++;
        if (password.length() >= 8) {
            score++;
        }
    }

    private void printResults() {
        System.out.println();
        System.out.println("-------------- ANALYSIS RESULTS -----------------");
        System.out.println();
        if (score <= 2) {
            System.out.println("Password Score: " + score + "/5");
            System.out.println("Strength      : Weak");
        } else if (score <= 4) {
            System.out.println("Password Score: " + score + "/5");
            System.out.println("Strength      : Moderate");
        } else {
            System.out.println("Password Score: " + score + "/5");
            System.out.println("Strength      : Strong");
        }
    }

    // Displays suggestions for improving password strength.
    private void printSuggestions() {
        if (score == 5) {
            System.out.println();
            System.out.println("Excellent! Your password meets all the basic strength requirements.");
            System.out.println();
            System.out.println("-------------------------------------------------");
        } else {
            System.out.println("\nSuggestions: ");
            if (!hasUpperCase)
                System.out.println("- Add at least one uppercase letter (A-Z).");
            if (!hasLowerCase)
                System.out.println("- Add at least one lowercase letter (a-z).");
            if (!hasNumber)
                System.out.println("- Add at least one number (0-9).");
            if (!hasSpecial)
                System.out.println("- Add at least one special character (!, @, #, ...).");
            if (password.length() < 8)
                System.out.println("- Increase password length to at least 8 characters.");
            System.out.println();
            System.out.println("-------------------------------------------------");
        }
    }
}
