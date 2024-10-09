package functions;

import java.util.Scanner;

public class CircumferenceOfACircle {

    public static double circumferenceOfACircle(int r) {
        return 2 * 3.14 * r;
    }

    public static void main(String[] args) {
        System.out.println("Enter radius 'r' to get the circumference of the circle");
        Scanner sc = new Scanner(System.in);
        System.out.print("radius (r) : ");
        int r = sc.nextInt();
        double circumference = circumferenceOfACircle(r);
        System.out.println("Circumference of the circle having radius (r) is " + circumference);
    }
}
