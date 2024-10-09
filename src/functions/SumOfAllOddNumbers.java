package functions;

import java.util.Scanner;

public class SumOfAllOddNumbers {
    public static int sumOfAllOddNumbers(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                sum += i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println("Enter value of 'n' to get sum of all odd number from 1 to 'n' - ");
        Scanner sc = new Scanner(System.in);
        System.out.print("n : ");
        int n = sc.nextInt();
        int sum = sumOfAllOddNumbers(n);
        System.out.println("sum of all odd numbers from 1 to " + n + " is " + sum);
    }
}
