package com.company;

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of metres");
        int m = scanner.nextInt();
        int convert = 0;
        do{
            System.out.println("Convert metres to:\n1)miles\n2)inches\n3)yards");
            convert = scanner.nextInt();
            if(convert < 1 || convert > 3){
                System.out.println("Wrong input!!!");
            }
        }while(convert < 1 || convert > 3);
        if(convert == 1){
            double miles = m * 0.000621371;
            System.out.println(m + " metres = " + miles + " miles");
        }
        else if(convert == 2){
            double inches = m * 39.3701;
            System.out.println(m + " metres = " + inches + " inches");
        }
        else if(convert == 3){
            double yards = m * 1.09361;
            System.out.println(m + " metres = " + yards + " yards");
        }
    }
}
