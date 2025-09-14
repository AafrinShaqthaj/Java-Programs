package javaPrograms.basicPrograms;

import java.util.Scanner;

public class print1toN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();

        // print 1 to N numbers
        for (int i=1; i<=n; i++){
            System.out.print(i + " ");
        }
    }
}
