package com.company;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 3 numbers");
        int numb1 = scanner.nextInt();
        int numb2 = scanner.nextInt();
        int numb3 = scanner.nextInt();

        int number = numb1*100 + numb2*10 + numb3;
        System.out.println("Your number " + number);
    }
}
