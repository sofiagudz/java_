package com.company;

public class Ex10 {
    public static void main(String[] args) {
        int[] array = new int[30];

        System.out.println("Random array:");
        for(int i = 0; i < array.length; i++){
            array[i] = ((int)(Math.random()*31) - 15);
            System.out.print(array[i] + " ");
        }

        int even_l = 0, odd_l = 0, pos_l = 0, neg_l = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i] % 2 == 0){
                even_l++;
            }
            else if(array[i] % 2 != 0){
                odd_l++;
            }
            if(array[i] > 0){
                pos_l++;
            }
            else if(array[i] < 0){
                neg_l++;
            }
        }

        int[] even_array = new int[even_l];
        int[] odd_array = new int[odd_l];
        int[] pos_array = new int[pos_l];
        int[] neg_array = new int[neg_l];
        int even = 0, odd = 0, pos = 0, neg = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i] % 2 == 0){
                even_array[even] = array[i];
                even++;
            }
            else if(array[i] % 2 != 0){
                odd_array[odd] = array[i];
                odd++;
            }
            if(array[i] > 0){
                pos_array[pos] = array[i];
                pos++;
            }
            else if(array[i] < 0){
                neg_array[neg] = array[i];
                neg++;
            }
        }

        System.out.println("\n\nAn array with even numbers:");
        for(int i = 0; i < even_array.length; i++){
            System.out.print(even_array[i] + " ");
        }

        System.out.println("\nAn array with odd numbers:");
        for(int i = 0; i < odd_array.length; i++){
            System.out.print(odd_array[i] + " ");
        }

        System.out.println("\nAn array with positive numbers:");
        for(int i = 0; i < pos_array.length; i++){
            System.out.print(pos_array[i] + " ");
        }

        System.out.println("\nAn array with negative numbers:");
        for(int i = 0; i < neg_array.length; i++){
            System.out.print(neg_array[i] + " ");
        }
    }
}
