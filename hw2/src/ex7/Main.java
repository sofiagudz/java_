package ex7;

public class Main {
    public static void main(String[] args) {
        Array array = new Array();
        array.sortAsc();
        System.out.println("\nSorted array by ascending: "+ array.toString());
        array.sortDesc();
        System.out.println("Sorted array by descending: "+ array.toString());

    }
}
