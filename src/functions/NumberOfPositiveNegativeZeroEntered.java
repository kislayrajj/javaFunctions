package functions;

import java.util.Scanner;

public class NumberOfPositiveNegativeZeroEntered {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int positiveCount = 0;
        int negativeCount = 0;
        int zeroCount = 0;
        System.out.println("This program will find out the number of positive number, negative number and zero entered.");
        System.out.print("Enter numbers separated by spaces : ");
        String input = sc.nextLine();

        String[] numbers = input.split(" ");
        for (String numStr : numbers) {
            try {
                int number = Integer.parseInt(numStr.trim());

                if (number > 0) {
                    positiveCount++;

                } else if (number < 0) {
                    negativeCount++;
                } else {
                    zeroCount++;
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input ");
            }
        }

        System.out.println("Positive number entered : " + positiveCount);
        System.out.println("Negative number entered : " + negativeCount);
        System.out.println("Zero entered : " + zeroCount);

    }
}
