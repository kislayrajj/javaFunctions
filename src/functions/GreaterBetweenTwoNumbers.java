package functions;

import java.util.Scanner;

public class GreaterBetweenTwoNumbers {
    public static int greaterBetweenTwoNumbers(int a, int b) {
//       if(a > b){
//           return a;
//       }else{
//           return b;
//       }

        // or
        return Math.max(a, b);
    }

    public static void main(String[] args) {
        System.out.println("Enter a and b to find out which is 'greater'");
        Scanner sc = new Scanner(System.in);
        System.out.print("a : ");
        int a = sc.nextInt();
        System.out.print("b : ");
        int b = sc.nextInt();
        int greaterNumber = greaterBetweenTwoNumbers(a, b);
        System.out.println(greaterNumber + " is greater");
    }

}
