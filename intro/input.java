package intro;
import java.util.Scanner;
public class input {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your Birth Year:");
        int year = scanner.nextInt();
        //Since enter key is used to enter number, scanner skips name prompt.
        //To prevent this, nextLine() is used again.
        scanner.nextLine();
        System.out.println("Enter your name:");
        String name = scanner.nextLine();

        System.out.println("Name is: " + name);
        System.out.println("Birth year: " + year);
        scanner.close();
    }
}
