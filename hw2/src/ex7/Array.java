package ex7;

import java.util.Arrays;

public class Array implements ISort{
    public int[] array = new int[10];

    public Array() {
        for(int i = 0; i < 10; i++){
            array[i] = ((int)(Math.random()*31) + 15);
            System.out.print(array[i] + " ");
        }
    }

    @Override
    public void sortDesc() {
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

    @Override
    public void sortAsc() {
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

    @Override
    public String toString() {
        String str = "";
        for(int i = 0; i < 10; i++){
            str = str + array[i] + " ";
        }
        return str;
    }

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }
}
