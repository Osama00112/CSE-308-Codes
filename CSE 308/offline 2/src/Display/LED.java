package Display;

public class LED implements Display {
    private String name;
    private double price;

    LED(){
        name = "Display.LED";
        price = 0;
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
