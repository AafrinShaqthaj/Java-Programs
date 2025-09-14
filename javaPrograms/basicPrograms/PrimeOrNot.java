package javaPrograms.basicPrograms;

import java.util.Scanner;

public class PrimeOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();

        boolean isPrime = true;
        if (n<=1){
            isPrime = false;
        } else {
            for (int i = 2; i < n; i++) {   //Type 1 ----> O(n)
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        System.out.println(isPrime ? "Prime": "Not Prime");



        //Type 2  ---> O(sqrt(n))
        if (n<=1){
            isPrime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(n); i++) {   //Type 1 ----> O(sqrt(n))
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        System.out.println(isPrime ? "Prime": "Not Prime");

    }
}
