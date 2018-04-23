package pl.edu.ur.oopl8;

public abstract class Product {

    public String name;
    public double price;
    public String describe;

    public Product(String name, String describe) {
        this.name = name;
        this.describe = describe;
    }

    public Product(double price, String name) {
        this.price = price;
        this.name = name;
    }

    public Product() {
    }

    public Product(double price, String name, String describe) {
        this.price = price;
        this.name = name;
        this.describe = describe;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public abstract void buy();

    public abstract void showInfo();
}