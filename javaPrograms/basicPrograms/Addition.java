package javaPrograms.basicPrograms;

import java.util.Scanner;

public class Addition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers : ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println("Addition of given numbers "+num1 +" and " + num2+" = "+(num1+ num2));
    }
}
