package functions;

import java.util.Scanner;

public class AverageOfThreeNumbers {
    public static int averageOfThreeNumbers(int a, int b, int c) {
        return (a + b + c) / 3;
    }

    public static void main(String[] args) {
        System.out.println("Enter 3 numbers to ger their Average -");
        Scanner sc = new Scanner(System.in);
        System.out.print("a : ");
        int a = sc.nextInt();
        System.out.print("b : ");
        int b = sc.nextInt();
        System.out.print("c : ");
        int c = sc.nextInt();
        int average = averageOfThreeNumbers(a, b, c);
        System.out.println("Average of " + a + " " + b + " and " + c + " is " + average);
    }
}
