package javaPrograms.basicPrograms;

import java.util.Scanner;

public class TriangleType {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sides of triangle: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println((a == b) && (b == c) ? "Equilateral Triangle"
                : (a == b) || (b == c) || (a == c) ? "Isosceles Triangle" : "Scalene");
    }
}
