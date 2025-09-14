package javaPrograms.basicPrograms;

import java.util.Scanner;

public class PalindromeOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();

        //Reverse a Number
        int rev = 0;
        int temp = num;
        while (num > 0){
            rev = rev * 10 + (num %10);
            num /= 10;
        }

        System.out.println(temp == rev ? "Palindrome" : "Not Palindrome");
    }
}
