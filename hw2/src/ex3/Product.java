package ex3;

public class Product extends Money{
    public float priceOfTheProduct;

    public Product(int wholeNumber, float realPartOfNumber) {
        super(wholeNumber, realPartOfNumber);
    }
    public Product(int wholeNumber, float realPartOfNumber, float priceOfTheProduct) {
        super(wholeNumber, realPartOfNumber);
        this.priceOfTheProduct = priceOfTheProduct;
    }
    public void buyingTheProduct(){
        int wholeNumber = getWholeNumber();
        float realPartOfNumber = getRealPartOfNumber();
        float result = super.Sum(wholeNumber, realPartOfNumber) - priceOfTheProduct;
        wholeNumber = (int)result;
        int realPart = (int)(((result - (int)result)*100000)/1000);
        setWholeNumber(wholeNumber);
        setRealPartOfNumber(realPart);
    }
    public float Sum_final(int wholeNumber, float realPartOfNumber){
        return wholeNumber + realPartOfNumber;
    }

    public double getPriceOfTheProduct() {
        return priceOfTheProduct;
    }

    public void setPriceOfTheProduct(float priceOfTheProduct) {
        this.priceOfTheProduct = priceOfTheProduct;
    }
}
