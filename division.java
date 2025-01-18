package calculator;

import java.util.Scanner;

public class division {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the numerator: ");
        int numerator = scanner.nextInt();
        
        System.out.print("Enter the denominator: ");
        int denominator = scanner.nextInt();
        
        if (denominator != 0) {
            double result = (double) numerator / denominator;
            System.out.println("The result is: " + result);
        } else {
            System.out.println("Error: Division by zero is not allowed.");
        }
        
        scanner.close();
    }
}
