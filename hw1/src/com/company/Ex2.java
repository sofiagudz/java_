package com.company;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = 0, persent = 0;
        System.out.println("Enter a number");
        number = scanner.nextInt();
        System.out.println("Enter % ");
        persent = scanner.nextInt();
        double result = (number*persent)/100.0;
        System.out.print("The result " + result);
    }
}
