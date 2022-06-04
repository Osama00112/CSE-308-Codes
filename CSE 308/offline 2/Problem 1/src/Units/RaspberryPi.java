package Units;

public class RaspberryPi implements mController {
    private final String name;
    private double price;

    RaspberryPi(){
        name = "Raspberry Pi";
        price = 325;
    }
    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price;
    }
}
