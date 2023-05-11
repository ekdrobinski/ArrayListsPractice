import java.util.Scanner;
public class IndexOfInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] integers = new int[300]; //initiates an array of 300 as a maximum amount of integers
        int index = 0; //initializes a first index

        System.out.println("Enter a series of number integers and hit 0 to end and get the index.");
        while (true) {
            int input = scanner.nextInt();
            if (input == 0) {
                break; //exit loop if the user types only 0 and hits enter
            }
            integers[index] = input;
            index++;
        }
        System.out.println("You are done adding integers to the list.");

        System.out.print("Enter a number to find its index(es): ");
        int number = scanner.nextInt();

        boolean found = false; // Initialize a flag to track if the number is found


        for (int i = 0; i < index; i++) {
            if (integers[i] == number) {
                found = false; //initialize a flag to track if the number is found
                System.out.println( number + " is at index " + i);
                found = true; //set the flag to true since the number is found
            }
        }

        if (!found) {
            System.out.println("The number " + number + " is not in the list."); // Notify if the number is not found
        }
    }
}

