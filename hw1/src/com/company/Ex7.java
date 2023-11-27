package com.company;

import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter two numbers(beginning and end of a range)");
        int b = scanner.nextInt();
        int e = scanner.nextInt();
        if(b > e){
            int k = b;
            b = e;
            e = k;
            System.out.println("The borders were incorrect so they were changed places");
        }
        for(int i = b; i <= e; i++){
            if(i % 2 != 0){
                System.out.print(i + " ");
            }
        }
    }
}
