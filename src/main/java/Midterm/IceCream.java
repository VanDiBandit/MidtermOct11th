package Midterm;

public class IceCream extends Product implements Consumable, LickAble{
    Size size;

    public IceCream(double price, String name){
        super(name, price);

    }

    @Override
    public void consume() {

    }

    @Override
    public boolean safeToLick(PostalStamp postalStamp, IceCream iceCream) {
        return true;
    }
}
