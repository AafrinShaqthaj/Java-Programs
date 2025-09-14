package javaPrograms.basicPrograms;

import java.util.Scanner;

public class VoteEligibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int age = sc.nextInt();
        System.out.println(age >= 18 ? "Eligible to Vote" : "Not Eligible");
    }
}
