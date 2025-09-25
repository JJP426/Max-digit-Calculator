// CSCI 1933 Lab 03
import java.util.Scanner;

public class MaxDigit {

	// Returns maximum digit in an integer using iteration
    public static int iterativeMaxDigit(int n) {
        int currentdigit = n % 10;
        int nextdigit = (n / 10) % 10;
        int bigDigit = currentdigit;
    
        while (n > 0) {
        if (nextdigit > bigDigit) {
            bigDigit = nextdigit;
            currentdigit = nextdigit;
            nextdigit = (n / 10) % 10;
            
        }
        n = n / 10;
        }
        return bigDigit;

    }
	
	// Returns maximum digit in an integer using recursion
    public static int recursiveMaxDigit(int n) {
        // Base case: Will stop calling itself once there is only one digit remaining
        if (n < 10){
            return n;
        }
        int previousDigit = n % 10;
        //Remove previosDigit from the whole number
        int biggestDigit = recursiveMaxDigit(n / 10);
        // Compares the digits
        if (previousDigit > biggestDigit){
            return previousDigit;
        }
        else{
            return biggestDigit;
        }
    }

    public static void main(String[] args) {
// Instantiate Scanner
        Scanner s = new Scanner(System.in);
        // Prompt user
        System.out.println("Enter an int n to get the highest digit: ");
        // Gets integer from the command line
        int n = s.nextInt();
        // Print the results

        System.out.println("The highest digit in " + n + "is: " + iterativeMaxDigit(n) + "(Iterative)");
        System.out.println("The highest digit in " + n + "is: " + recursiveMaxDigit(n) + "(Recursive)");

       }
}