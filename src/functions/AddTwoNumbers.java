package functions;

import java.util.Scanner;

public class AddTwoNumbers {
    public static void addTwoNumbers(int sum) {
        System.out.println("Sum : " + sum);
    }

    public static void main(String[] args) {
        System.out.println("Enter 'a' and 'b' to get their sum");
        System.out.print("a : ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.print("b : ");
        int b = sc.nextInt();
        int sum = a + b;
        addTwoNumbers(sum);
        sc.close();
    }
}
