import java.util.ArrayList;
import java.util.Scanner;
public class HowLarge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<String>();
        String input = "";
        while (true) {
            System.out.print("Enter a string. Enter an empty string to quit.");
            input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }
            list.add(input);
        }
        System.out.println("The total amount of items in the list was: " + list.size());
    }
}
