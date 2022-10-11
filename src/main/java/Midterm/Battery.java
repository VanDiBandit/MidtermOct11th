package Midterm;

public class Battery extends Product implements Consumable{
    public Battery(double price, String name) {
        super(name, price);
    }

    @Override
    public void consume() {

    }
}
