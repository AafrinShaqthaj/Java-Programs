package javaPrograms.basicPrograms;

import java.util.Scanner;

public class Greetings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter yor name: ");
        String name =  sc.next();
        System.out.println("Hello, "+name+ "!");
    }
}
