package com.company;

import java.util.Scanner;
import java.io.IOException;

public class Ex11 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        int length = 0, direction = 0;
        char symbol;
        do{
            System.out.println("Enter the length of the line ");
            length = scanner.nextInt();
            if(length <= 0){
                System.out.println("The length must be bigger than null!!!");
            }
        }while(length <= 0);

        do{
            System.out.println("Choose direction\n1)horizontal\n2)vertical");
            direction = scanner.nextInt();
            if(direction > 2 || direction < 1){
                System.out.println("You must enter 1 or 2!!!");
            }
        }while(direction > 2 || direction < 1);

        System.out.println("Enter symbol");
        symbol = (char)System.in.read();

        print(length, direction,symbol);
    }
    public static void print(int length, int direction, char symbol){
        for(int i = 0; i<length; i++){
            if(direction == 1){
                System.out.print(symbol + "");
            }
            else if(direction == 2){
                System.out.println(symbol);
            }
        }
    }
}
