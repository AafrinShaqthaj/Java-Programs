package javaPrograms.basicPrograms;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();

        //Multiplication table
        for (int i=1; i<=10; i++){
            System.out.println(i + " X " + n + " = " + i*n);
        }
    }
}
