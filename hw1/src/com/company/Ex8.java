package com.company;

import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter two numbers(beginning and end of a range)");
        int b = 0, e = 0;
        do{
            b = scanner.nextInt();
            e = scanner.nextInt();
            if(b > e){
                System.out.println("The borders are incorrect!!!");
            }
        }while(b > e);
        for(int i = b; i <= e; i++){
            for(int n = 1; n <= 10; n++){
                System.out.print(i + "*" + n + " = " + i*n + "  ");
            }
            System.out.print("\n");
        }
    }
}
