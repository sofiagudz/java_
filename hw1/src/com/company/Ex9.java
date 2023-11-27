package com.company;

public class Ex9 {
    public static void main(String[] args) {
        int[] array = new int[15];

        System.out.println("Random array:");
        for(int i = 0; i < array.length; i++){
            array[i] = ((int)(Math.random()*31) - 15);
            System.out.print(array[i] + " ");
        }

        int neg = 0, pos = 0, zero = 0;

        for(int i = 0; i < array.length; i++){
            if(array[i]>0){
                pos++;
            }
            else if(array[i]<0){
                neg++;
            }
            else if(array[i] == 0){
                zero++;
            }
        }

        System.out.println("\nPositive elements: " + pos + "\nNegative elements: " + neg + "\nZero elements: " + zero);
    }
}
