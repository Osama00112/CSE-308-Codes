package Units;

public class RaspberryPi implements mController {
    private String name;
    private double price;

    RaspberryPi(){
        name = "Raspberry Pi";
        price = 0;
    }
    @Override
    public String getName() {
        return null;
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
