package com.company;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int month = 0;
        do{
            System.out.println("Enter the serial number of a month");
            month = scanner.nextInt();
            if(month>12 || month<1){
                System.out.println("A month with this number does not exist!!!");
            }
        }while(month>12 || month<1);
        if(month == 1 || month == 2 || month == 12){
            System.out.println("It's winter");
        }
        else if(month == 3 || month == 4 || month == 5){
            System.out.println("It's spring");
        }
        else if(month == 6 || month == 7 || month == 8){
            System.out.println("It's summer");
        }
        else{
            System.out.println("It's autumn");
        }
    }
}
