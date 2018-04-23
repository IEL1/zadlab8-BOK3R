package pl.edu.ur.oopl8;

public class Tractor extends Product {

    public Tractor(String name, double price, String describe) {
        super(name, price, describe);
    }

    @Override
    public void buy() {
        System.out.println(
                "I bought a black tractor, capaciticy 2400!");
    }

    @Override
    public void showInfo() {
        System.out.println(
                "Price:" + getPrice()
                + " name:" + getName()
                + " describe:" + getDescribe()
        );
    }
}
