package Display;

public class LCD implements Display {
    private String name;
    private double price;

    LCD(){
        name = "LCD";
        price = 500;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public void setPrice(double price) {
        this.price = price;
    }
}
