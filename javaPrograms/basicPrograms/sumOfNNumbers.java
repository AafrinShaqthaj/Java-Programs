package javaPrograms.basicPrograms;

import java.util.Scanner;

public class sumOfNNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();

        int sum = 0;

        //type 1
        for (int i=1; i<=n ; i++){
            sum += i;
        }
        System.out.println("Sum of first " + n +" numbers is " + sum);

        // type 2
        System.out.println("Sum of first " + n +" numbers is " + n*((n+1)/2));
    }
}
