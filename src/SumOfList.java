import java.util.Scanner;
public class SumOfList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[300];
        int count = 0;
        int sum = 0;
        String numberString = ""; // Initialize an empty string
        System.out.println("Enter integer numbers. Enter 0 to finish.");
        while (true) {
            int input = scanner.nextInt();
            if (input == 0) {
                break; // Exit the loop if zero is entered
            }
            numbers[count] = input;
            sum += input;
            count++;
            numberString += input + ", "; // Append the inputted number to the string
        }
        System.out.print(numberString.trim() + " were the items in the list.  ");
        System.out.println("The sum of the that list is: " + sum);
    }

    }
