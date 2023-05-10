import java.util.Scanner;
public class FifthItem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] strings = new String[5]; // Array to store the strings
        int count = 0; // Counter for the number of strings entered

        // Prompt the user for strings until an empty string is entered or five strings are entered
        while (count < 5) {
            System.out.print("Enter a string (or press Enter to finish): ");
            String input = scanner.nextLine();

            if (input.isEmpty()) {
                break; // Exit the loop if an empty string is entered
            }

            strings[count] = input;
            count++;
        }
        // Check if the fifth string exists and display it
        if (count >= 5) {
            System.out.println("The fifth string entered was: " + strings[4]);
        } else {
            System.out.println("Less than five strings were entered.");
        }

    }
}