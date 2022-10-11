package Midterm;

public class PostalStamp extends Product implements LickAble,IPrint{

    private int amount;

    public PostalStamp(double price, String name, int amount) {
        super(name, price);
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public boolean safeToLick(PostalStamp postalStamp, IceCream iceCream) {
        return false;
    }

    @Override
    public void print() {

    }
}
