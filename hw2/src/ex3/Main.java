package ex3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        Money money = new Money(34, 78);
//        System.out.println("Sum: "+ money.Sum(money.wholeNumber, money.realPartOfNumber));
//
//        Money money2 = new Money();
//
//        System.out.print("Whole number: ");
//        int number = scanner.nextInt();
//        money2.inputWholeNumber(number);
//
//        System.out.print("Real part of the number: ");
//        double realPart = scanner.nextDouble();
//        money2.inputRealPartOfNumber(realPart);
//
//        System.out.println("Sum: "+ money2.Sum(money2.wholeNumber, money2.realPartOfNumber));

        Product product = new Product(56, 13);
        System.out.print("The price of the product: ");
        float price = scanner.nextFloat();
        product.setPriceOfTheProduct(price);
        product.buyingTheProduct();
        System.out.println("New amount of money: "+product.Sum_final(product.wholeNumber, product.realPartOfNumber));
    }
}
