package Units;
public class ATMega323 implements mController {
    private String name;
    private double price;

    ATMega323(){
        name = "ATMega32";
        price = 0;
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
