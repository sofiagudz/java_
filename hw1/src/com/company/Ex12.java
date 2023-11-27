package com.company;

import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = new int[15];

        System.out.println("Random array:");
        for(int i = 0; i < array.length; i++){
            array[i] = ((int)(Math.random()*31) - 15);
            System.out.print(array[i] + " ");
        }

        int sortBy = 0;
        do{
            System.out.println("Sort by\n1)ascending\n2)descending");
            sortBy = scanner.nextInt();
            if(sortBy > 2 || sortBy < 1){
                System.out.println("You must enter 1 or 2!!!");
            }
        }while(sortBy > 2 || sortBy < 1);

        sort(array, sortBy);
    }
    public static void sort(int[] array, int sortBy){
        if (sortBy == 1) {
            for(int i = 0; i< array.length; i++){
                for(int j = i + 1; j< array.length; j++){
                    if(array[i] > array[j]){
                        int k = array[i];
                        array[i] = array[j];
                        array[j] = k;
                    }
                }
            }
        }
        else if(sortBy == 2){
            for(int i = 0; i< array.length; i++){
                for(int j = i + 1; j< array.length; j++){
                    if(array[i] < array[j]){
                        int k = array[i];
                        array[i] = array[j];
                        array[j] = k;
                    }
                }
            }
        }
        for(int i = 0; i<array.length; i++){
            System.out.print(array[i] + " ");
        }
    }
}
