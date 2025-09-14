package javaPrograms.basicPrograms;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();

        int temp = n;
        int ans = 0;
        while (n>0){
            ans += (int) Math.pow((n%10), 3);
            n /= 10;
        }
        System.out.println(temp == ans ? "Armstrong Number" : "Not Armstrong");
    }
}
