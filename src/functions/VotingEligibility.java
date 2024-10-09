package functions;

import java.util.Scanner;

public class VotingEligibility {
    public static String votingEligibility(int a) {
        if (a < 18 && a > 0) {
            return "NOT eligible ! You are a minor.";
        } else if (a > 18) {
            return "YES ! You are eligible to vote.";
        } else {
            return "Invalid age " + "'" + a + "'";
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter your age to find out voting eligibility - ");
        Scanner sc = new Scanner(System.in);
        System.out.print("Age : ");
        int age = sc.nextInt();
        String eligibility = votingEligibility(age);
        System.out.println(eligibility);
    }
}
