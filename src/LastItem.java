import java.util.Scanner;
public class LastItem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String lastString = "something";

        System.out.println("Enter strings (press Enter without typing anything to finish):");

        while (true) {
            System.out.print("Enter a string (or press Enter to finish): ");
            String input = scanner.nextLine();
            if (input.isEmpty()) {
                break;
            }
            lastString = input;
        }

        if (lastString != "something") {
            System.out.println("The last string entered was: " + lastString);
        } else {
            System.out.println("No strings were entered.");
        }
    }

}
