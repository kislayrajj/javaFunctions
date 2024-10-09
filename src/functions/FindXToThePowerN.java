package functions;

import java.util.Scanner;

public class FindXToThePowerN {
    public static int findXToThePowerN(int x, int n) {
        return (int) Math.pow(x, n);
    }

    public static void main(String[] args) {
        System.out.println("Enter x and a to n to get value of x^n");
        Scanner sc = new Scanner(System.in);
        System.out.print("x (base) : ");
        int x = sc.nextInt();
        System.out.println("n (exponent) : ");
        int n = sc.nextInt();
        int value = findXToThePowerN(x, n);
        System.out.println("x^n = " + value);
    }
}
