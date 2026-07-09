import java.util.Scanner;

/*
 * Displays the application menu and directs
 * the user to the selected feature.
 */
public class Menu {
    private Scanner sc = new Scanner(System.in);
    private PasswordAnalyzer analyzer=new PasswordAnalyzer();
    private PasswordGenerator generator=new PasswordGenerator();

    // Reads the user's menu choice.
    // Calls the appropriate module based on user selection.
    public void start() {
        System.out.println("=================================================");
        System.out.println("           PASSWORD STRENGTH ANALYZER            ");
        System.out.println("=================================================");
        System.out.println();
        int choice ;
        do {
            System.out.println();
            System.out.println("1. Analyze Password\n2. Generate Password\n0. Exit");
            System.out.println();
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 0:
                    System.out.println();
                    System.out.println("Exiting...");
                    System.out.println("=================================================");
                    break;
                case 1:
                    analyzer.startAnalysis();
                    break;
                case 2:
                    generator.generateNewPassword();
                    break;
                default:
                    System.out.println("Invalid Choice.");
            }
        } while(choice!=0);
    }
}
