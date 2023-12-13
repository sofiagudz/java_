package ex3;

public class Money {
    public int wholeNumber;
    public float realPartOfNumber;

    public Money() {
    }

    public Money(int wholeNumber, float realPartOfNumber) {
        this.wholeNumber = wholeNumber;
        this.realPartOfNumber = realPartOfNumber;
    }
    public float Sum(int wholeNumber, float realPartOfNumber){
        return (float)(wholeNumber + realPartOfNumber*0.01);
    }
    public void inputWholeNumber(int wholeNumber){
        this.wholeNumber = wholeNumber;
    }
    public void inputRealPartOfNumber(float realPartOfNumber){
        this.realPartOfNumber = realPartOfNumber;
    }

    public int getWholeNumber() {
        return wholeNumber;
    }

    public float getRealPartOfNumber() {
        return realPartOfNumber;
    }

    public void setWholeNumber(int wholeNumber) {
        this.wholeNumber = wholeNumber;
    }

    public void setRealPartOfNumber(float realPartOfNumber) {
        this.realPartOfNumber = realPartOfNumber/100;
    }
}
