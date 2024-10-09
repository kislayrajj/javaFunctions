package functions;

import java.util.Scanner;

public class FactorialOfANumber {
    public static void factorialOfANumber(int num) {
        if (num == 0 || num == 1) {
            System.out.println("0");
        } else if (num < 0) {
            System.out.println("Number is not valid");
        } else {
            int factorial = 1;
            for (int i = num; i >= 2; i--) {
                factorial = i * factorial;
            }
            System.out.println("Factorial : " + factorial);
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter a number to get their factorial");
        Scanner sc = new Scanner(System.in);
        System.out.print("a : ");
        int a = sc.nextInt();
        factorialOfANumber(a);
    }
}
