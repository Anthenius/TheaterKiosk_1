import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int age = 0;

        // Prompt the user for their age
        System.out.print("Enter your age: ");
        if (in.hasNextInt()) {
            age = in.nextInt();
            in.nextLine(); // Clear the buffer

            // Check if the age is 21 or older
            if (age >= 21) {
                System.out.println("You get a paper wristband.");
            }
        } else {
            System.out.println("Please enter a valid integer for age.");
            in.nextLine(); // Clear the invalid input
        }

        in.close(); // Close the scanner
    }
}
