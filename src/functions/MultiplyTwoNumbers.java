package functions;

import java.util.Scanner;

public class MultiplyTwoNumbers {
    public static int multiplyTwoNumbers(int a, int b) {
        return a * b;
    }

    public static void main(String[] args) {
        System.out.println("Enter 'a' and 'b' to ger their product - ");
        Scanner sc = new Scanner(System.in);
        System.out.print("a : ");
        int a = sc.nextInt();
        System.out.print("b : ");
        int b = sc.nextInt();
        int product = multiplyTwoNumbers(a, b);
        System.out.println("Product of " + a + " and " + b + " is " + product);
    }
}

