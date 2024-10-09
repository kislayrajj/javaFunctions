package functions;

import java.util.Scanner;

public class PrintFibonacciSeries {
    public static void printFibonacciSeries(int n) {
        int previousCount = 0;
        int count = 1;

        for (int i = 0; i <= n; i++) {
            int currentCount = previousCount + count;
            System.out.println(currentCount);
            previousCount = count;
            count = currentCount;
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter value of 'n' get fibonacci series on 'n' term(s) -");
        Scanner sc = new Scanner(System.in);
        System.out.print("n : ");
        int n = sc.nextInt();
        printFibonacciSeries(n);
    }

}
