package com.company;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = 0;
        do{
            System.out.println("Enter six digit number");
            number = scanner.nextInt();
            if(number > 999999 || number<100000){
                System.out.println("Your number must contain SIX digits!!!");
            }
        }while(number > 999999 || number<100000);

        int one = number/100000;
        int two = number/10000%10;
        int three = number/1000%10;
        int four = number/100%10;
        int five = (number%100)/10;
        int six = number%10;

//        System.out.println(one);
//        System.out.println(two);
//        System.out.println(three);
//        System.out.println(four);
//        System.out.println(five);
//        System.out.println(six);

        int result = six*100000 + five*10000 + three*1000 + four*100 + two*10 + one;
        System.out.print("The result " + result);
    }
}
