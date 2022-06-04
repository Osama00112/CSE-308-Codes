package Units;
public class ATMega32 implements mController {
    private String name;
    private double price;

    ATMega32(){
        name = "ATMega32";
        price = 350;
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
