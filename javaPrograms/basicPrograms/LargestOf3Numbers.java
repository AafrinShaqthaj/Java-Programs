package javaPrograms.basicPrograms;

import java.util.Scanner;

public class LargestOf3Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        System.out.println("Largest Number is "+((num1 > num2 ? (Math.max(num1, num3)) : (Math.max(num2, num3)))));

    }
}
