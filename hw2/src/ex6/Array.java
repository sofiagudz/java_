package ex6;

public class Array implements IMath{
    public int[] array = new int[10];

    public Array() {
        for(int i = 0; i < 10; i++){
            array[i] = ((int)(Math.random()*31) + 15);
            System.out.print(array[i] + " ");
        }
    }
    @Override
    public int Max() {
        int max = array[0];
        for(int i = 1; i < 10; i++){
            if(array[i]>max){
                max = array[i];
            }
        }
        return max;
    }

    @Override
    public int Min() {
        int min = array[0];
        for(int i = 1; i < 10; i++){
            if(array[i]<min){
                min = array[i];
            }
        }
        return min;
    }

    @Override
    public int Avg() {
        int sum = 0;
        for(int i = 1; i < 10; i++){
            sum += array[i];
        }
        int avg = sum / 10;
        return avg;
    }
    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }
}
