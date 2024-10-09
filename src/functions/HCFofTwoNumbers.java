package functions;

import java.util.Scanner;

public class HCFofTwoNumbers {
    public static int hcfOfTwoNumbers(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        System.out.println("Enter a and b to get their HCF/GCD");
        Scanner sc = new Scanner(System.in);
        System.out.print("a : ");
        int a = sc.nextInt();
        System.out.print("b : ");
        int b = sc.nextInt();
        int hcf = hcfOfTwoNumbers(a, b);
        System.out.println("HCF of " + a + " and " + b + " is " + hcf);
    }
}
